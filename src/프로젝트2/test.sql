#DB생성 테스트
drop database if exists testbase;
create database testbase;

use testbase;
#테이블 테스트

drop table if exists 계정;
drop table if exists 캐릭터;
drop table if exists 몬스터;
drop table if exists 아이템;
drop table if exists 사냥터;
drop table if exists 스킬;
drop table if exists 상점;
drop table if exists 가방;
drop table if exists 장비;

create table 계정(
식별번호 int auto_increment,
아이디 varchar(20),
비밀번호 varchar(40),
이름 varchar(40),
전화번호 varchar(20),
생년월일 varchar(6),
생성일 datetime default now(),
primary key(식별번호)
);
create table 캐릭터(
식별키 int auto_increment,
닉네임 varchar(20),
직업 int,
체력 int,
마나 int,
보유금액 int,
공격력 int,
primary key(식별키),
계정참조키 int,
아이템참조키 int,
스킬참조키 int,
foreign key(계정참조키) references 계정(식별번호),
foreign key(아이템참조키) references 아이템(식별번호),
foreign key(스킬참조키) references 스킬(식별번호)
);
create table 몬스터(
식별키 int auto_increment,
이름 varchar(20),
체력 int,
드랍금액 int,
드랍아이템 int,
공격력 int,
primary key(식별키),
아이템참조키 int,
foreign key(아이템참조키) references 아이템(식별번호)
);
create table 아이템(
식별번호 int auto_increment,
아이템이름 varchar(30),
아이템설명 varchar(30),
수량 int,
primary key(식별번호)
);
create table 사냥터(
식별번호 int auto_increment,
이름 varchar(20),
primary key(식별번호),
캐릭터참조키 int,
몬스터참조키 int,
foreign key(캐릭터참조키) references 캐릭터(식별키),
foreign key(몬스터참조키) references 몬스터(식별키)
);
create table 스킬(
식별번호 int auto_increment,
스킬이름 varchar(10),
설명 varchar(40),
primary key (식별번호)
);
create table 상점(
식별번호 int auto_increment,
상점이름 varchar(10),
primary key(식별번호),
아이템참조키 int,
foreign key(아이템참조키) references 아이템(식별번호)
);
create table 가방(
식별키 int auto_increment,
가방1 int,
가방2 int,
가방3 int,
가방4 int,
가방5 int,
가방6 int,
가방7 int,
가방8 int,
가방9 int,
가방10 int,
primary key(식별키),
참조키 int,
foreign key(참조키) references 아이템(식별번호)
);
create table 장비(
식별키 int auto_increment,
장비1 int,
장비2 int,
장비3 int,
장비4 int,
무기1 int,
primary key(식별키),
아이템참조 int,
foreign key(아이템참조) references 아이템(식별번호)
);

select * from 계정;
select * from 캐릭터;
select * from 몬스터;
select * from 아이템;
select * from 사냥터;
select * from 스킬;
select * from 상점;
select * from 가방;
select * from 장비;

#테스트용
insert into 계정(아이디,비밀번호,이름,전화번호,생년월일) values ('bc','1234','김병찬','010-9999-8888','010101');
insert into 계정(아이디,비밀번호,이름,전화번호,생년월일) values ('bc1','1234','김병찬1','010-9999-8888','010101');
insert into 계정(아이디,비밀번호,이름,전화번호,생년월일) values ('bc2','1234','김병찬2','010-9999-8888','010101');

insert into 캐릭터(닉네임,체력,마나,보유금액,공격력) values ('카카오',100,100,30000,10);
insert into 캐릭터(닉네임,체력,마나,보유금액,공격력) values ('오카카',100,100,30000,10);
insert into 캐릭터(닉네임,체력,마나,보유금액,공격력) values ('네이버',100,100,30000,10);

insert into 몬스터(이름,체력,드랍금액,공격력) values ('스켈레톤',100,5000,5);
insert into 몬스터(이름,체력,드랍금액,공격력) values ('스켈레톤1',100,5000,5);
insert into 몬스터(이름,체력,드랍금액,공격력) values ('스켈레톤2',100,5000,5);

insert into 아이템(아이템이름,아이템설명) values ('물약','체력회복시필요합니다.');
insert into 아이템(아이템이름,아이템설명) values ('갑옷','몸을보호하는 갑옷입니다.');
insert into 아이템(아이템이름,아이템설명) values ('철칼','철칼입니다.');

insert into 사냥터(이름) values ('초원');
insert into 사냥터(이름) values ('동굴');
insert into 사냥터(이름) values ('용암');

insert into 스킬(스킬이름,설명) values ('참격','참격을날립니다.');
insert into 스킬(스킬이름,설명) values ('파이어볼','파이어볼 날립니다.');
insert into 스킬(스킬이름,설명) values ('활쏘기','화살을 쏩니다.');


insert into 상점(상점이름) values ('마을상점');

insert into 가방(가방1,가방2,가방3,가방4,가방5) values (1,2,3,4,5);
insert into 가방(가방1,가방2,가방3,가방4,가방5) values (1,2,3,4,5);
insert into 가방(가방1,가방2,가방3,가방4,가방5) values (1,2,3,4,5);

insert into 장비(장비1,장비2,장비3,장비4,무기1) values (1,1,1,3,2);
insert into 장비(장비1,장비2,장비3,장비4,무기1) values (1,2,2,3,2);
insert into 장비(장비1,장비2,장비3,장비4,무기1) values (1,1,1,1,2);
