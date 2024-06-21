#데이터베이스 생성
drop database if exists day03;
create database day03;

/*
[정리]
1. not null : 해당 필드에 null값을 포함하지 않는다
2. default : 해당 필드의 기본값 설정
3. unique : 해당 필드내 중복된 값을 허용하지 않는다[중복제거]
4. auto_increment : 레코드 삽입시 해당 필드내 자동번호 부여 (MY SQL에서만 제공하는 기능)
5. primary key : 기본키(PK) 주로 해당 레코드 내 식별/고유값 가능한 고유값/성질 가진 키/필드 값 
6. foreign key : 외래키(FK) 다른 테이블내 pk를 참조하는 키
-- foreign key(tno) references t5(tno)

*/


# 테이블 생성
use day03;
drop table if exists member;
create table member(
회원번호 int,
아이디 varchar(30),
비밀번호 varchar(30),
연락처 char(13),
광고전송여부 boolean,
가입일 datetime
);
show tables; #현재 DB내 모든 테이블검색
select * from member; #특정 테이블 검색

#제약조건 
# 1. not null : (레코드/insert[삽입/등록]시 해당필드에 값이 없을때) 해당 필드에 null 값을 포함하지 않는다.
create table t1(tno int not null, tname varchar(10));
#레코드/행/튜플추가
#만약에 values안에(값1, 값2) 만약에 앞에 필드명을 생략시 필드명순서대로 값 대입
insert into t1 values(1, '유재석'); 
#만약에 앞에 필드명을 작성시 명시된 순서대로 값 대입
insert into t1 (tno , tname)values(2, '강호동');
insert into t1 (tname , tno)values('하하', 3);

insert into t1 (tname) values ('서장훈'); #오류있네? 값을 대입하지 않는 필드가 not null 이기때문에.
insert into t1 (tno) values (4); #오류없네? 값을 대입하지 않는 필드가 not null을 포함하지 않았기 때문에.

#확인
select * from t1;

#2. default : 해당 필드의 기본값 설정 먼저만들어지면 적용X

#생성
create table t2(tno int not null, 
tname varchar(10), 
tdate datetime default now(),
tstate int default 10
);

#삭제
drop table t2;

#레코드 추가
insert into t2 (tno , tname) values (1, '유재석'); #생략된 tdate,tstate 기본값으로 알아서 들어감 
insert into t2 values (1, '강호동', '2024-06-21 11:00:30', 3); #직접너을때는 기본값이 아닌 설정값이 들어감

#확인
show tables;
select * from t2;

#3. unique : 해당 필드내 중복된 값을 허용하지 않는다. [중복 제거]
-- 만약에 레코드 삽입시 해당 필드에 값을 대입시 기존 레코드내 동일값이 있으면 오류발생/중복제거 (유일값 생성시)

#제거
drop table t3;

#생성
create table t3(tno int not null unique, 
tname varchar(10), 
tpoint int default 100
);

insert into t3(tno) values(1); #:???? 등록가능
insert into t3(tno, tname) values(1, '유재석'); #?? tno에 동일한 값이 존재해서 오류남

#확인
select * from t3;

#4. auto_increment 레코드 삽입시 해당 필드내 자동번호 부여
create table t4(
tno int not null unique auto_increment,
tname varchar(10) default '아무개'
);

insert into t4(tname) values('유재석'); #실행 * 4 자동으로 tno가 1씩 증가하면서 대입
-- 삭제된 자동번호는 더이상 생성되지 않고 마지막 번호에 이어서 1씩 증가하며 생성

#열 삭제
delete from t4 where tno = 3; #tno가 '3' 인 레코드 

#확인
select * from t4;

#5. primary key : 기본키 주로 해당 레코드 내 식별/고유값 가능한 고유값/성질 가진 키/필드 값 (참조 당하는 키)
-- unique 포함 , not null포함
-- primary key ( PK로 선정할 필드명 );
create table t5(
tno int,
tname varchar(10),
primary key(tno) #pk필드로 선정
);

select * from t5;

#6. foreign key : 외래키 다른 테이블내 pk를 참조하는 키 (참조 하는키)
create table t6(
title text,
tno int,
foreign key(tno) references t5(tno) #참조키 (tno를) 참조하겠습니다 t5의(tno(PK를))
);

select * from t6;
#워크벤치 상단 메뉴 > database > reverse engineer

#예시

#1. 회원
create table m(
mno_pk int auto_increment,
mname varchar(10),
mphone char(13),
primary key(mno_pk)
);

#2. 게시물
create table b(
bno_pk int auto_increment,
btitle varchar(100),
bcontent longtext,
bdate datetime default now(),
mno_fk int,
foreign key(mno_fk) references m(mno_pk),
primary key(bno_pk)
);

#3. 게시물 댓글
create table r(
rno_pk int auto_increment,
rcontent text,
rpwd varchar(20),
mno_fk int,
bno_fk int,
primary key(rno_pk),
foreign key(mno_fk)references m(mno_pk),
foreign key(bno_fk)references b(bno_pk)
);

#삭제
drop table m;
drop table b;
drop table r;

#확인 : 워크벤치 상단 > database  > reverse engineer 


create table 카테고리(
cno_pk int auto_increment,
cname varchar(10)
);

create table 제품(
);

create table 주문();

create table 주문상세();