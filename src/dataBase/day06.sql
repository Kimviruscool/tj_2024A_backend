drop database if exists day06;
create database day06;
use day06;

#1. 회원테이블
drop table if exists member;
# 아이디 비밀번호 이름 연락처 가입일
create table member(
mid varchar(20) not null unique,
mpwd varchar(30) not null,
mname varchar(20) not null,
mphone varchar(15) not null,
mdate datetime default now(),
mno int auto_increment,
primary key(mno)
);
#확인용
select * from member;

#2. 게시물테이블
drop table if exists board;
#글제목 글내용 글작성일 글작성자 글조회수
create table board(
btitle varchar(100),
bcontent longtext,
bdate datetime default now(),
binfo varchar(500),
bno int auto_increment,
mno int,
primary key(bno),
foreign key(mno) references member(mno)
);
drop table board;

#확인
select * from board;

#3. 댓글테이블
drop table if exists reply; 
#댓글내용 댓글작성일 댓글작성자
create table reply(
rcontent varchar(200),
rdatet datetime default now(),
mno int,
bno int,
rno int auto_increment,
primary key(rno),
foreign key(mno) references member(mno),
foreign key(bno) references board(bno)
);

select * from reply;

#ERR 다이어그램확인
#샘플 데이터 등록
#회원 2명
#게시물 2개
#댓글 5개
select * from member;
select * from board;
select * from reply;

insert into member(mid , mpwd, mname , mphone) values ('yu1','1234','유재석0','010-9999-8888');
insert into member(mid , mpwd, mname , mphone) values ('yu12','1234','유재석1','010-9999-8888');
insert into member(mid , mpwd, mname , mphone) values ('yu123','1234','유재석2','010-9999-8888');
insert into member(mid , mpwd, mname , mphone) values ('yu1234','1234','유재석3','010-9999-8888');
insert into member(mid , mpwd, mname , mphone) values ('yu12345','1234','유재석4','010-9999-8888');



insert into board(btitle, bcontent,mno) values ('글1','테스트1',1);
insert into board(btitle, bcontent,mno) values ('글2','테스트2',2);
insert into board(btitle, bcontent,mno) values ('글3','테스트3',3);
insert into board(btitle, bcontent,mno) values ('글4','테스트4',4);
insert into board(btitle, bcontent,mno) values ('글5','테스트5',5);

insert into reply(rcontent, mno, bno) values ('댓글내용1',1,1);
insert into reply(rcontent, mno, bno) values ('댓글내용2',2,2);
insert into reply(rcontent, mno, bno) values ('댓글내용3',3,3);
insert into reply(rcontent, mno, bno) values ('댓글내용4',4,4);
insert into reply(rcontent, mno, bno) values ('댓글내용5',5,5);

#검색
#1. 전체검색
select * from member;
#2. 조건 검색
select * from member where mphone = '010-9999-8888';
#아이디 찾기 (회원명가 연락처가 동일한 회원 검색)
#비교연산자 : >초과 <미만 >= 이상 <=이하 =같다 !=같지않다,
# 관계연산자 and or not vs java && || !

#로그인/비교
