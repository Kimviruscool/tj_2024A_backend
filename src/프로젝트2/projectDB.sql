#DB생성 테스트
drop database if exists testbase;
create database testbase;

use testbase;
#테이블 테스트

drop table if exists myaccount;
drop table if exists mycharacter;
drop table if exists monster;
drop table if exists dungeon;
drop table if exists skill;

create table myaccount(
akey int auto_increment,
aid varchar(20) not null unique,
apwd varchar(40) not null,
aname varchar(40) not null,
anum varchar(20) not null,
abirth varchar(6) not null,
adate datetime default now(),
primary key(akey)
);
create table mycharacter(
ckey int auto_increment,
cnickname varchar(20) not null unique,
chp int default 100,
primary key(ckey),
akey int,
skkey int,
foreign key(akey) references myaccount(akey),
foreign key(skkey) references skill(skkey)
);
create table monster(
mkey int auto_increment,
mname varchar(20),
mhp int default 100,
mdamage int default 0,
primary key(mkey)
);
create table dungeon(
dkey int auto_increment,
dname varchar(20),
primary key(dkey),
mkey int,
ckey int,
foreign key(mkey) references monster(mkey),
foreign key(ckey) references mycharacter(ckey)
);
create table skill(
skkey int auto_increment,
skname varchar(10),
skinfo varchar(40),
skdamage int default 0,
primary key (skkey)
);

select * from myaccount;
select * from mycharacter;
select * from monster;
select * from dungeon;
select * from skill;

#테스트용
insert into myaccount(aid,apwd,aname,anum,abirth) values ('bc','1234','김병찬','010-9999-8888','010101');
insert into myaccount(aid,apwd,aname,anum,abirth) values ('bk','1234','유재석','010-7777-8888','990808');
insert into myaccount(aid,apwd,aname,anum,abirth) values ('bq','1234','강호동','010-6666-8888','891111');

insert into mycharacter(cnickname) values ('카카오');
insert into mycharacter(cnickname) values ('네이버');
insert into mycharacter(cnickname) values ('페이커');

insert into monster(mname,mhp,mdamage) values ('스켈레톤',100,5);
insert into monster(mname,mhp,mdamage) values ('스켈레톤1',100,5);
insert into monster(mname,mhp,mdamage) values ('스켈레톤2',100,5);

insert into dungeon(dname) values ('초원');
insert into dungeon(dname) values ('동굴');
insert into dungeon(dname) values ('용암');

insert into skill(skname,skinfo) values ('참격','참격을날립니다.');
insert into skill(skname,skinfo) values ('파이어볼','파이어볼 날립니다.');
insert into skill(skname,skinfo) values ('활쏘기','화살을 쏩니다.');

