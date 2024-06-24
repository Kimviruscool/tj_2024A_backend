#데이터베이스 삭제/ 생성 / 사용
drop database if exists day04;
create database day04;
use day04;

#테이블 삭제 / 생성 / 사용
drop table if exists table1;
create table table1(
mno int,
mnae varchar(30) not null unique
);

#만들어진 테이블 확인
select * from table1;

#DML : 조작어
#1. INSERT 2. SELECT 3.UPDATE 4.DELETE
#	  (C)		(R)		(U)		(D)
/*
#[1] INSERT : 레코드(향,튜플,가로단위) 삽입
1. 모든 필드에 값 대입 : insert into 테이블명 values(값1 , 값2 , 값3 ~~~~);
2. 특정 필드에 값 대입 : insert into 테이블명(필드명, 필드명) values(값1, 값2);
3. 여러개의 레코드 삽입 : insert into 테이블명(필드명, 필드명) values(값1,값2),(값1,값2),(값1,값2);

#[2] SELECT : 레코드(행,튜플,가로단위) 조회/검색/찾기
#전체 조회 : select *(와일드카드) from 테이블명
#특정 필드 조회 :  select 필드명 from 테이블명;
#레코드 조건 조회 select 필드명1, 필드명2 from 테이블명 where 조건절

#[3] UDDATE : 레코드(행,가로단위,튜플)의 필드 값 수정(최신화)
#특정 필드의 전체값 수정 : update 테이블명 set 수정할필드명 = 새로운값;
#특정 필드의 조건에 따른 값 수정 : update 테이블명 set 수정할필드명 = 새로운값 where 조건절;

#주의
#update delete는 workbench에서 기본적으로 safemode로 보호
#safe모드 끄기
SET SQL_SAFE_UPDATES = 0; 
#safe mode = 0 : 해제 1 : 사용

#[4] delete : 레코드(행,튜플,가로단위) 삭제
#1. 전체 레코드 삭제 : delete from 테이블명; (레코드 전체 처리 : 느리다 , 취소가능)
#2. 특정 조건에 따른 레코드 삭제 : delete from 테이블명 where 조건절

#번외 (DDL)
#전체 레코드 삭제
truncate table table1; (레코드 전체 처리 : 빠르다 , 취소불가능)

*/

#[1] INSERT : 레코드(향,튜플,가로단위) 삽입
#1. 모든 필드에 값 대입 : insert into 테이블명 values(값1 , 값2 , 값3 ~~~~);
insert into table1 values(1 , "유재석"); #테이블(표)안에 값 입력

#2. insert into 테이블이름(필드명, 필드명) values(값1, 값2);
insert into table1(mno, mnae) values(2, "정형돈");
insert into table1(mnae, mno) values("박명수", 3);
insert into table1(mnae) values("서장훈");

#3. 여러개의 레코드 삽입 : insert into 테이블명(필드명, 필드명) values(값1,값2),(값1,값2),(값1,값2);
insert into table1 values(4, "강호동"),(5,"김희철"),(6,"백종원");

#[2] SELECT : 레코드(행,튜플,가로단위) 조회/검색/찾기

#1. 테이블 확인 
#- select *(와일드카드) from 테이블명     * : 모든 필드 조회 (와일드카드)
select * from table1;

#2. 특정 필드 조회
#- select 필드명 from 테이블명;
select mno from table1;
select mnae from table1;
select mnae , mno from table1;

#3. 레코드 조건 검색
#- select 필드명1, 필드명2 from 테이블명 where 조건절
select * from table1 where mnae = "유재석";			# = 같다(대입x)
#	TABLE1 mnae 필드내 "유재석"인 데이터의 레코드(가로단위 한 줄) 검색

#[3] UDDATE : 레코드(행,가로단위,튜플)의 필드 값 수정(최신화)
#1. 특정 필드의 전체 값 수정
#- update 테이블명 set 수정할필드명 = 새로운값;
update table1 set mno = 10; #테이블의 mno 을 10으로 수정(오류발생 : safe mode 해제)
select * from table1;

#update delete는 workbench에서 기본적으로 safemode로 보호
#safe모드 끄기
SET SQL_SAFE_UPDATES = 0; #safe mode = 0 : 해제 1 : 사용

#2. 특정 필드의 조건에 따른 값 수정 
#- update 테이블명 set 수정할필드명 = 새로운값 where 조건절;
update table1 set mno = 3 where mnae = "유재석";
#테이블의 mnae 필드내 "유재석"인 데이터의 mno 필드의 값을 3으로 수정
update table1 set mnae = "유재석B" where mno = 3;
#테이블의 mno 필드가 3인 레코드의 mnae의 필드값을 "유재석B" 로수정

select * from table1;

#[4] delete : 레코드(행,튜플,가로단위) 삭제

#테이블 확인
select * from table1;

#2. 특정 조건에 따른 레코드 삭제
#- delete from 테이블명 where 조건절
delete from table1 where mno = 3;
#해석 : 테이블의 mno의 필드가 3인 레코드를 삭제
delete from table1 where mnae = "강호동";
#해석 : 테이블의 mnae의 필드가 "강호동"인 레코드를 삭제

#1. 전체 레코드 삭제
#- delete from 테이블명;
delete from table1; #전체 레코드삭제 (레코드 하나씩 처리 : 느리다 , 취소가능)
	#vs
truncate table table1; #전체 레코드 삭제 (레코드 전체 처리 : 빠르다 , 취소불가능)