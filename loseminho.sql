select * from chellenge_list;
select * from chellengeinfo;
select * from member_tbl;

SELECT SUM(QUEST_CAN) ĵ,
    SUM(QUEST_PLA) �ö�ƽ,
    SUM(QUEST_GLASS) ����,
    SUM(QUEST_PAPER) ����,
    SUM(QUEST_WRAPPER) ���,
    SUM(QUEST_TABACOO) ������,
    SUM(QUEST_POINT) ����,
    MEMBER_NO ȸ����ȣ FROM chellenge_list GROUP BY MEMBER_NO;

INSERT INTO chellenge_list VALUES
(CHELLENGE_SEQ.NEXTVAL,
'����:����λ�/������:�ؿ��/�ҿ�ð�:10�� ~ 30��',
2,5,3,8,7,5,45,
'2022-09-27','�����ϰ�����2.jpg',
41,
'Y','�ȳ��ϼ���'
);

SELECT QUEST_CAN ĵ,
    QUEST_PLA �ö�ƽ,
    QUEST_GLASS ����,
    QUEST_PAPER ����,
    QUEST_WRAPPER ���,
    QUEST_TABACOO ������,
    QUEST_POINT ����,
    MEMBER_NO ȸ����ȣ,
    ROW_NUMBER() OVER (ORDER BY QUEST_POINT DESC) ���� FROM chellenge_list;
    
    
    
    SELECT (SELECT SUM(QUEST_CAN) ĵ,
    SUM(QUEST_PLA) �ö�ƽ,
    SUM(QUEST_GLASS) ����,
    SUM(QUEST_PAPER) ����,
    SUM(QUEST_WRAPPER) ���,
    SUM(QUEST_TABACOO) ������,
    SUM(QUEST_POINT) ����Ʈ,
    MEMBER_NO ȸ����ȣ FROM chellenge_list GROUP BY MEMBER_NO), ROW_NUMBER() OVER (ORDER BY ����Ʈ.SUM(QUEST_POINT) DESC) ���� FROM chellenge_list;
    