
/*
#테이블/표 관련
관련용어
		[관점 차이에 따른 용어]
		파일시스템				데이터베이스 모델링			관계형 데이터베이스
        파일					엔티티					테이블 , 릴레이션
		레코드				튜플						행
        필드					속성						열
        
        [MySQL 데이터 타입]
        [정수]
        1.TINYINT 		1바이트 	-128 ~ +127
        2.SMALLINT 		2바이트 	+-3만정도
        3.MEDIUMINT 	3바이트 	+-800만정도
        4.INT			4바이트	+-20억
        5.BIGINT		8바이트	+-20억이상
        ===========================================
        [실수 : 부동소수점, 오차발생]
        1.FLOAT			4바이트
        2.DOBULE		8바이트
        ===========================================
        [문자형태로 저장되는 숫자, 오차없는 실수 표현]
        1.DECIMAL		:실수를 오차 없이 표현할때 사용
        ===========================================
        [날짜]
        1.DATE			:날짜 1000년~9999년
        2.DATETIME		:날짜,시간 표현
        ===========================================
        [문자]
        1.CHAR(문자길이)			:고정길이 , 배열 최대 1~255문자
        ex) CHAR(5) 유재석 => [유][재][석][][] = 비효율적
        2.VARCHAR(문자길이)		:가변길이 , 리스트 1~255문자
        ex) CHAR(5) 유재석 => [유][재][석][][] => [유][재][석] = 효율적
        3.TEXT 					:최대길이 6만자 글자 표현
        4.LONGTEXT				:최대길이 42억개 글자 표현 (4GB)
		=======================================================
        [논리]
        1.BOOL			:true , false ()
        =======================================================
        
	1. 테이블(Table) 		: 표 , 릴레이션(Relation) , 엔티티(Entity)
	2. 레코드(Record) 	: 튜플(tuple), 행(row)
    3. 필드(Field) 		: 속성(Attribute), 열(colum)
*/
#0. 어디에(어떤 위치 , 어떤DB에) 테이블을 생성할껀지!!!!!!!!!!!!!!!!!!!
use mydb;
#1. 테이블 생성 [ create table DB이름(열이름 타입 제약조건, 열이름2 타입 제약조건,) ]
create table 회원목록(이름 text, 점수 int);
#2. 현재 DB내 테이블 목록 확인
show tables;
#3. 테이블 삭제
drop table 회원목록;
#3-1. 만약에 테이블이 존재하면 삭제
drop table if exists 회원목록;

#[예1] member(회원) 테이블 만들기
drop database if exists sqlweb1;
create database sqlweb1;
use sqlweb1;
drop table if exists member;
create table member(id varchar(20) , password varchar(20), age int, joindate date);
show tables;
select * from member; # 원하는 테이블 값 확인

#[예2] board(게시판) 테이블 만들기
drop table if exists board;
create table board(
bno int, #번호(정수)
title varchar(100),  #제목 (최대100글자)
content longtext,  #내용 (긴글 최대 4GB)
view int, #조회수 (정수)
date datetime #작성일 (날짜와 시간)
);
show tables;
select * from board;

#[예3] student(학생) 테이블 생성
drop table if exists student;
create table student(
정수1 tinyint, 정수2 smallint, 정수3 mediumint,
정수4 int, 정수5 bigint,
실수1 float, 실수2 double, 실수3 decimal,
날짜 date, 날짜시간 datetime,
문자열1 char(100), 문자열2 varchar(100), 문자열3 text, 문자열4 longtext,
논리 bool
);
show tables;
select * from student;

#[실습1]
/*
-키오스크 개발의 메모리 설계
	[요구사항]
		1. 여러개 카테고리중 카테고리를 선택을 해서 카테고리 별로 제품들을 출력/확인
        2. 해당 제품을 선택해서 수량 입력받아 주문처리 -단) 하나의 주문의 여러개 제품을 주문할수있다.
        3. 주문번호를 받아서 대기한다.
        [메모리 설계 필수 속성]
        각 식별자코드 , 카테고리명, 가격, 제품명, 주문수량, 주문날짜
        [설계]
        필요테이블 카테고리 , 제품 , 주문
		
        
        
        
*/

drop table if exists 카테고리;
drop table if exists 제품;
drop table if exists 주문;
drop table if exists 주문상세테이블;


create table 카테고리(
카테고리코드 int,
카테고리명 varchar(20)
);

create table 제품(
제품코드 int,
제품명 varchar(20),
가격 int,
카테고리코드 int
);

create table 주문(
주문코드 int,
주문날짜 datetime
);

create table 주문상세테이블(
주문상세코드 int,
제품코드 int,
수량 int,
주문코드 int
);

show tables;
select * from 카테고리;
select * from 제품;
select * from 주문;
select * from 주문상세테이블;
