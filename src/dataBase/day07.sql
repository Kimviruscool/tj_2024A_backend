drop table table2;
drop table table1;


create database day07;
create table table1(
mno int,
primary key(mno)
);

create table table2(
bno_pk int,
primary key(bno_pk),
mno_fk int,
foreign key(mno_fk) references table1(mno) 
#on delete restrict
#on delete cascade
on delete set null
#on update restrict
#on update cascade
on update set null
);
#제약조건
#on delete restrict : pk-fk 데이터가 서로 참조하고 있는 데이터/개체가 존재하면 삭제 불가능 (기본값)
#on delete cascade : 종속 pk-fk 데이터가 서로 참조하고 있는 데이터/개체가 존재하면 같이 삭제
#on delete set null : pk-fk데이터가 서로 참조하고 있는 데이터/개체가 존재하면 pk삭제시 fk는 null 대입/변경

#on update restrict : pk-fk 데이터가 서로 참조하고 있는 데이터/개체가 존재할때 수정 불가능 (기본값)
#on update cascade : pk-fk 데이터가 서로 참조하고 있는 데이터/개체가 존재하면 같이 수정
#on update set null : pk-fk 데이터가 서로 참조하고 있는 데이터/개체가 존재하면 pk수정시 fk는 null 대입/변경

#샘플
insert into table1 values (1),(2),(3),(4),(5);

insert into table2 values (1,1),(2,1),(3,2),(4,2),(5,3);

delete from table1 where mno = 1; #회원1번 삭제 안됨 (삭제할 pk가 다른 테이블에 존재/참조를 당하는중)
delete from table1 where mno = 4; #회원번호가 4인 레코드 삭제 (삭제할 pk값이 다른테이블에 존재/참조를 당하지않는중)

update table1 set mno = 6 where mno = 1; #테이블 수정(업데이트)

#확인
select * from table1;
select * from table2;
