package com.earthpurging.mypage.model.dao;

import com.earthpurging.member.model.vo.Member;
import common.JDBCTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MypageDao {
    public int[] selectInquiryCnt(Connection conn, String memberName, String memberEmail) {
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        //String query = "select (select count(*) from INQUIRY_TBL where IS_ANSWER='답변대기') as cnt1, (select count(*) from INQUIRY_TBL where IS_ANSWER='답변완료') as cnt2 from dual";
        String query = "select (select count(*) from "
                + "(select M.MEMBER_NAME, I.IS_ANSWER FROM INQUIRY_TBL I, MEMBER_TBL M where M.MEMBER_NAME=I.INQUIRY_WRITER and M.MEMBER_EMAIL=I.INQUIRER_EMAIL and I.IS_ANSWER = '답변대기' and I.INQUIRY_WRITER = ? and I.INQUIRER_EMAIL = ?)) as cnt1,"
                + "(select count(*) from (select M.MEMBER_NAME, I.IS_ANSWER FROM INQUIRY_TBL I, MEMBER_TBL M where M.MEMBER_NAME=I.INQUIRY_WRITER and M.MEMBER_EMAIL=I.INQUIRER_EMAIL and I.IS_ANSWER = '답변완료' and I.INQUIRY_WRITER = ? and I.INQUIRER_EMAIL = ?)) as cnt2 "
                + "from dual";
        int[] inquiryCntarr = new int[2];

        try {
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, memberName);
            pstmt.setString(2, memberEmail);
            pstmt.setString(3, memberName);
            pstmt.setString(4, memberEmail);
            rset = pstmt.executeQuery();
            if(rset.next()) {
                inquiryCntarr[0] = rset.getInt("cnt1");
                inquiryCntarr[1] = rset.getInt("cnt2");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTemplate.close(rset);
            JDBCTemplate.close(pstmt);
        }

        return inquiryCntarr;
    }

    public int updateMyInfo(Connection conn, Member m, String beforeMemberId) {
        PreparedStatement pstmt = null;
        int result = 0;

        String query = "update member_tbl set member_id=?, member_name=?, nickname=?, member_email=?, member_addr=? where member_id=?";

        try {
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, m.getMemberId());
            pstmt.setString(2, m.getMemberName());
            pstmt.setString(3, m.getNickname());
            pstmt.setString(4, m.getMemberEmail());
            pstmt.setString(5, m.getMemberAddr());
            pstmt.setString(6, beforeMemberId);

            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTemplate.close(pstmt);
        }
        return result;
    }

    public int updateMyInfoWithPw(Connection conn, Member m, String beforeMemberId) {

        PreparedStatement pstmt = null;
        int result = 0;

        String query = "update member_tbl set member_id=?, member_pw=?, member_name=?, nickname=?, member_email=?, member_addr=? where member_id=?";

        try {
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, m.getMemberId());
            pstmt.setString(2, m.getMemberPw());
            pstmt.setString(3, m.getMemberName());
            pstmt.setString(4, m.getNickname());
            pstmt.setString(5, m.getMemberEmail());
            pstmt.setString(6, m.getMemberAddr());
            pstmt.setString(7, beforeMemberId);

            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTemplate.close(pstmt);
        }
        return result;
    }

    public int deleteMember(Connection conn, String memberId) {
        PreparedStatement pstmt = null;
        int result = 0;

        String query ="delete from member_tbl where member_id=?";

        try {
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, memberId);
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCTemplate.close(pstmt);
        }
        return result;
    }
}
