package com.earthpurging.mypage.controller;

import com.earthpurging.mypage.model.service.MypageService;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DeleteMember", urlPatterns = {"/deleteMember.do"})
public class DeleteMemberServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteMemberServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
        String memberId = request.getParameter("memberId");

        MypageService service = new MypageService();
        int result = service.deleteMember(memberId);

        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/common/msg.jsp");
        if(result>0) {
            request.setAttribute("title", "탈퇴완료");
            request.setAttribute("msg", "회원탈퇴가 완료되었습니다");
            request.setAttribute("icon", "success");
            request.setAttribute("loc", "/logout.do");
        } else {
            request.setAttribute("title", "탈퇴실패");
            request.setAttribute("msg", "관리자에게 문의하세요");
            request.setAttribute("icon", "error");
            request.setAttribute("loc", "/mypageInfo.do");
        }
        view.forward(request, response);
	}

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}