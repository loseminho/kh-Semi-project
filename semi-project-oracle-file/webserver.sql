-- ȸ�����̺�
CREATE TABLE MEMBER_TBL(
    MEMBER_NO   NUMBER          PRIMARY KEY, -- ȸ�� ������ȣ
    MEMBER_ID   VARCHAR2(20)    UNIQUE NOT NULL,
    MEMBER_PW   VARCHAR2(20)    NOT NULL,
    MEMBER_NAME VARCHAR2(21)    NOT NULL,
    MEMBER_PHONE    CHAR(13),
    MEMBER_ADDR     VARCHAR2(100),
    MEMBER_LEVEL    NUMBER, -- ȸ�����(1:������, 2:��ȸ��, 3:��ȸ��)
    ENROLL_DATE     CHAR(10)    --YYYY-MM-DD
);

CREATE SEQUENCE MEMBER_SEQ; -- ȸ�� ������ȣ �߱��� ���� ������

select * from member_tbl;

UPDATE MEMBER_TBL SET MEMBER_LEVEL = 1 WHERE MEMBER_NO=22;
UPDATE MEMBER_TBL SET MEMBER_LEVEL = 2 WHERE MEMBER_NO=23;
UPDATE MEMBER_TBL SET MEMBER_PW = 960607 WHERE MEMBER_ID='user01';
COMMIT;


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







CREATE TABLE CHELLENGE_LIST(
    QUEST_NO        NUMBER          PRIMARY KEY,
    QUEST_AREA      VARCHAR2(15)    NOT NULL,
    QUEST_CAN       NUMBER,
    QUEST_PLA       NUMBER,
    QUEST_GLASS     NUMBER,
    QUEST_PAPER     NUMBER,
    QUEST_WRAPPER   NUMBER,
    QUEST_TABACOO   NUMBER,
    QUEST_POINT     NUMBER          NOT NULL,
    QUEST_DATE      CHAR(10)        NOT NULL,
    PHOTO_PATH      VARCHAR2(100)   NOT NULL,
    MEMBER_NO       NUMBER          REFERENCES MEMBER_TBL(MEMBER_NO) ON DELETE CASCADE NOT NULL,
    PERMISSION      CHAR(1)         NOT NULL,
    MEMBER_THINK    VARCHAR2(300)   NULL
);
SELECT * FROM CHELLENGE_LIST;
CREATE SEQUENCE CHELLENGE_LIST_SEQ;
COMMIT;

INSERT INTO CHELLENGE_LIST VALUES
(CHELLENGE_LIST_SEQ.NEXTVAL,
'����',
8,
8,
8,
8,
8,
8,
16,
'220923',
'home',
24,
'Y',
NULL
);
SELECT * FROM MEMBER_TBL;