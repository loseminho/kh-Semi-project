
CREATE TABLE NOTICE(
    NOTICE_NO       NUMBER          PRIMARY KEY,
    NOTICE_TITLE    VARCHAR2(300)   NOT NULL,
    NOTICE_WRITER   VARCHAR2(20)    REFERENCES MEMBER_TBL(MEMBER_ID) ON DELETE CASCADE,
    NOTICE_CONTENT  VARCHAR2(4000)  NOT NULL,
    READ_COUNT      NUMBER,
    REG_DATE        CHAR(10),
    FILENAME        VARCHAR2(100),
    FILEPATH        VARCHAR2(100)
);
CREATE SEQUENCE NOTICE_SEQ;
INSERT INTO NOTICE VALUES
(NOTICE_SEQ.NEXTVAL,
'공지사항'||NOTICE_SEQ.CURRVAL,
'user01',
'공지사항내용'||NOTICE_SEQ.CURRVAL,
0,
TO_CHAR(SYSDATE,'YYYY-MM-DD'),
NULL,
NULL);
commit;
SELECT * FROM NOTICE;
delete from notice where notice_no=76;


SELECT * FROM NOTICE ORDER BY NOTICE_NO DESC;
select n.* from (SELECT * FROM NOTICE ORDER BY NOTICE_NO DESC)n;
select rownum, n.* from (SELECT * FROM NOTICE ORDER BY NOTICE_NO DESC)n;
select rownum as rnum, n.* from (SELECT * FROM NOTICE ORDER BY NOTICE_NO DESC)n;
select * from(select rownum as rnum, n.* from (SELECT * FROM NOTICE ORDER BY NOTICE_NO DESC)n) where rnum between 1 and 10;


select count(*) as cnt from notice;

------------------------------------------------------------
CREATE TABLE NOTICE_COMMENT(
    NC_NO       NUMBER          PRIMARY KEY,
    NC_WRITER   VARCHAR2(20)    REFERENCES MEMBER_TBL(MEMBER_ID) ON DELETE CASCADE,
    NC_CONTENT VARCHAR2(1000)   NOT NULL,
    NC_DATE     CHAR(10),
    NOTICE_REF  NUMBER          REFERENCES NOTICE ON DELETE CASCADE,
    NC_REF      NUMBER          REFERENCES NOTICE_COMMENT ON DELETE CASCADE
);
CREATE SEQUENCE NC_SEQ;
SELECT * FROM NOTICE_COMMENT;
commit;
---------------------------------------------------------------
CREATE TABLE FREE_NOTICE_COMMENT(
    NC_NO       NUMBER          PRIMARY KEY,
    NC_WRITER   VARCHAR2(20)    REFERENCES MEMBER_TBL(MEMBER_ID) ON DELETE CASCADE,
    NC_CONTENT VARCHAR2(1000)   NOT NULL,
    NC_DATE     CHAR(10),
    NOTICE_REF  NUMBER          REFERENCES FREE_NOTICE ON DELETE CASCADE,
    NC_REF      NUMBER          REFERENCES FREE_NOTICE_COMMENT ON DELETE CASCADE
);
CREATE SEQUENCE FREE_NC_SEQ;
SELECT * FROM FREE_NOTICE_COMMENT;
commit;
--------------------------------------------------------------------------
CREATE TABLE FREE_NOTICE(
    FREE_NOTICE_NO       NUMBER          PRIMARY KEY,
    FREE_NOTICE_TITLE    VARCHAR2(300)   NOT NULL,
    FREE_NOTICE_WRITER   VARCHAR2(20)    REFERENCES MEMBER_TBL(MEMBER_ID) ON DELETE CASCADE,
    FREE_NOTICE_CONTENT  VARCHAR2(4000)  NOT NULL,
    FREE_READ_COUNT      NUMBER,
    FREE_REG_DATE        CHAR(10),
    FREE_FILENAME        VARCHAR2(100),
    FREE_FILEPATH        VARCHAR2(100)
);
drop table free_notice;
drop sequence free_notice_seq;
COMMIT;
SELECT * FROM FREE_NOTICE;
CREATE SEQUENCE FREE_NOTICE_SEQ;
INSERT INTO FREE_NOTICE VALUES
(FREE_NOTICE_SEQ.NEXTVAL,
'자유게시판'||FREE_NOTICE_SEQ.CURRVAL,
'user01',
'자유게시판내용'||FREE_NOTICE_SEQ.CURRVAL,
0,
TO_CHAR(SYSDATE,'YYYY-MM-DD'),
NULL,
NULL);

SELECT * FROM FREE_NOTICE;
commit;

select * from(select rownum as rnum, n.* from (SELECT * FROM FREE_NOTICE ORDER BY FREE_NOTICE_NO DESC)n) where rnum between 1 and 10;
------------------------------------------------------------------
CREATE TABLE PHOTO(
    PHOTO_NO        NUMBER              PRIMARY KEY,
    PHOTO_WRITER    VARCHAR2(20)        REFERENCES MEMBER_TBL(MEMBER_ID) ON DELETE CASCADE,
    PHOTO_TITLE     VARCHAR2(100)       NOT NULL,
    PHOTO_CONTENT   VARCHAR2(1000)      NOT NULL,
    FILEPATH        VARCHAR2(100)
);
select * from photo;
CREATE SEQUENCE PHOTO_SEQ;
commit;
delete from photo where photo_no=26;
select * from (select rownum as rnum, p.* from(select * from photo order by 1 desc)p) where rnum between 1 and 5;
