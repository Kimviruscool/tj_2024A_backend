drop database if exists day08;
create database day08;
use day08;

#1. A테이블
create table table1(
num int,
primary key(num)
);
#2. B테이블
create table table2(
no int,
primary key(no),
num int,
foreign key(num) references table1(num)
);

#샘플
insert into table1 value(1),(2),(3),(4),(5);
insert into table2 value(1,1),(2,2),(3,1),(4,1),(5,2);

#확인
select * from table1;
select * from table2;

#1. 단일 테이블의 데이터 검색
select * from table1 where num = 1;
select * from table2 where num = 1;

#2. 다중 테이블의 데이터 검색 : 쉼표를 이용한 테이블 구분
#select * from 테이블명1 , 테이블명2
#select * from 테이블명1 , 테이블명2 where 테이블명.필드명 = 테이블명.필드명;
#select * from 테이블명1 별칭 , 테이블명2 별칭
	#별칭 : 주로 테이블명 , 필드명을 간추려 SQL질의어 에서 사용할때 
select * from table1, table2; #레코드 개수 25개, = 첫번째  테이블개수 * 두번째 테이블 개수
select * from table1, table2 where num = num; #pk필드와 fk필드의 식별이 불가능
select * from table1, table2 where table1.num = table2.num;
select * from table1 a ,table2 b where a.num = b.num;
#왜 PK와 FK필드가 같은 경우를 검색하는지? 관계를 찾기 위해서
#===========================================================
#3. Join 절
#3-1 교집합  -> 두 개이상의 집합/테이블 이 공통된 수/데이터 PK , FK 교집합 찾기
#[1] where 절
select * from table1, table2 where table1.num = table2.num; #where 일반조건
#[2] natural join 절
select * from table1 natural join table2;
#[3] on절
select * from table1 join table2 on table1.num = table2.num; #on join조건
#[4] using절
select * from table1 join table2 using(num);
#[5] inner join on절
select * from table1 inner join table2 on table1.num = table2.num;
