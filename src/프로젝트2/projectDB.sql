#DB생성 테스트
drop database if exists testbase;
create database testbase;

use testbase;
#테이블 테스트

drop table if exists myaccount;
drop table if exists mycharacter;
drop table if exists monster;
drop table if exists item;
drop table if exists dungeon;
drop table if exists skill;
drop table if exists shop;
drop table if exists bag;
drop table if exists equipment;

create table myaccount(
akey int auto_increment,
aid varchar(20) not null unique,
apwd varchar(40),
aname varchar(40),
anum varchar(20),
abirth varchar(6),
adate datetime default now(),
primary key(akey)
);
create table mycharacter(
ckey int auto_increment,
cnickname varchar(20) not null unique,
chp int default 100,
cmp int default 100,
cmoney int default 0,
cdamage int default 10,
primary key(ckey),
akey int,
ikey int,
skkey int,
foreign key(akey) references myaccount(akey),
foreign key(ikey) references item(ikey),
foreign key(skkey) references skill(skkey)
);
create table monster(
mkey int auto_increment,
mname varchar(20),
mhp int,
mdropmoney int,
mdropitem int,
mdamage int,
primary key(mkey),
ikey int,
foreign key(ikey) references item(ikey)
);
create table item(
ikey int auto_increment,
iname varchar(30),
iinfo varchar(30),
primary key(ikey)
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
primary key (skkey)
);
create table shop(
shkey int auto_increment,
shname varchar(10),
primary key(shkey),
ikey int,
foreign key(ikey) references item(ikey)
);
create table bag(
bkey int auto_increment,
bag1 int,
bag2 int,
bag3 int,
bag4 int,
bag5 int,
bag6 int,
bag7 int,
bag8 int,
bag9 int,
bag10 int,
primary key(bkey),
ikey int,
foreign key(ikey) references item(ikey)
);
create table equipment(
eqkey int auto_increment,
eq1 int,
eq2 int,
eq3 int,
eq4 int,
wp1 int,
primary key(eqkey),
ikey int,
foreign key(ikey) references item(ikey)
);

select * from myaccount;
select * from mycharacter;
select * from monster;
select * from item;
select * from dungeon;
select * from skill;
select * from shop;
select * from bag;
select * from equipment;

#테스트용
insert into myaccount(aid,apwd,aname,anum,abirth) values ('bc','1234','김병찬','010-9999-8888','010101');
insert into myaccount(aid,apwd,aname,anum,abirth) values ('bc1','1234','김병찬1','010-9999-8888','010101');
insert into myaccount(aid,apwd,aname,anum,abirth) values ('bc2','1234','김병찬2','010-9999-8888','010101');

insert into mycharacter(cnickname,chp,cmp,cmoney,cdamage) values ('카카오',100,100,0,10);
insert into mycharacter(cnickname,chp,cmp,cmoney,cdamage) values ('오카카',100,100,0,10);
insert into mycharacter(cnickname,chp,cmp,cmoney,cdamage) values ('네이버',100,100,0,10);

insert into monster(mname,mhp,mdropmoney,mdamage) values ('스켈레톤',100,5000,5);
insert into monster(mname,mhp,mdropmoney,mdamage) values ('스켈레톤1',100,5000,5);
insert into monster(mname,mhp,mdropmoney,mdamage) values ('스켈레톤2',100,5000,5);

insert into item(iname,iinfo) values ('물약','체력회복시필요합니다.');
insert into item(iname,iinfo) values ('갑옷','몸을보호하는 갑옷입니다.');
insert into item(iname,iinfo) values ('철칼','철칼입니다.');

insert into dungeon(dname) values ('초원');
insert into dungeon(dname) values ('동굴');
insert into dungeon(dname) values ('용암');

insert into skill(skname,skinfo) values ('참격','참격을날립니다.');
insert into skill(skname,skinfo) values ('파이어볼','파이어볼 날립니다.');
insert into skill(skname,skinfo) values ('활쏘기','화살을 쏩니다.');


insert into shop(shname) values ('마을상점');

insert into bag(bag1,bag2,bag3,bag4,bag5) values (1,2,3,4,5);
insert into bag(bag1,bag2,bag3,bag4,bag5) values (1,2,3,4,5);
insert into bag(bag1,bag2,bag3,bag4,bag5) values (1,2,3,4,5);

insert into equipment(eq1,eq2,eq3,eq4,wp1) values (1,1,1,3,2);
insert into equipment(eq1,eq2,eq3,eq4,wp1) values (1,2,2,3,2);
insert into equipment(eq1,eq2,eq3,eq4,wp1) values (1,1,1,1,2);
