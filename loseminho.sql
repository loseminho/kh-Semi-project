select * from chellenge_list;
select * from chellengeinfo;
select * from member_tbl;

SELECT SUM(QUEST_CAN) 캔,
    SUM(QUEST_PLA) 플라스틱,
    SUM(QUEST_GLASS) 유리,
    SUM(QUEST_PAPER) 종이,
    SUM(QUEST_WRAPPER) 비닐,
    SUM(QUEST_TABACOO) 담배꽁초,
    SUM(QUEST_POINT) 점수,
    MEMBER_NO 회원번호 FROM chellenge_list GROUP BY MEMBER_NO;

INSERT INTO chellenge_list VALUES
(CHELLENGE_SEQ.NEXTVAL,
'지역:쓰담부산/상세지역:해운대/소요시간:10분 ~ 30분',
2,5,3,8,7,5,45,
'2022-09-27','망나니같은놈2.jpg',
41,
'Y','안녕하세요'
);

SELECT QUEST_CAN 캔,
    QUEST_PLA 플라스틱,
    QUEST_GLASS 유리,
    QUEST_PAPER 종이,
    QUEST_WRAPPER 비닐,
    QUEST_TABACOO 담배꽁초,
    QUEST_POINT 점수,
    MEMBER_NO 회원번호,
    ROW_NUMBER() OVER (ORDER BY QUEST_POINT DESC) 순위 FROM chellenge_list;
    
    
    
    SELECT (SELECT SUM(QUEST_CAN) 캔,
    SUM(QUEST_PLA) 플라스틱,
    SUM(QUEST_GLASS) 유리,
    SUM(QUEST_PAPER) 종이,
    SUM(QUEST_WRAPPER) 비닐,
    SUM(QUEST_TABACOO) 담배꽁초,
    SUM(QUEST_POINT) 포인트,
    MEMBER_NO 회원번호 FROM chellenge_list GROUP BY MEMBER_NO), ROW_NUMBER() OVER (ORDER BY 포인트.SUM(QUEST_POINT) DESC) 순위 FROM chellenge_list;
    