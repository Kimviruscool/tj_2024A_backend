/* 여러줄 주석 */
# 한줄 주석
-- 한줄 주석
/* SQL질의어 */
/*
1. 주의할점 
	- sql문장을 입력후 ; 으로 끝내야함 , 자바와비슷
    - 문자처리 ''혹은 ""
    - 명령어/키워드 에서 대소문자 구분 안함 , 데이터/자료는 당연히 구분함.
2. 실행
	- 명렁어 단위 실행 , 전체실행
    - 명령어 단위실행/한줄 : 실행 명령어에 커서 두고 Ctrl+Enter / 상단 I번개
    - 전체실행 : Ctrl+Shift+Enter / 상단 번개 
3. 실행 결과
	- 하단 결과 확인 Result확인 (print와 비슷함)
    - Output 창 : 실행결과 확인창
    ------------------------------------------------------------------
    DB관련명령어
    
    DDL(Data Definition Language) 데이터 정의어
    - 생성 :  create database '새로운DB명';
    - 삭제 : drop database '삭제할DB명'; / drop database if exists '삭제할DB명';
    - show databases; 현재서버 DB목록 확인 / show variables like 'datadir' 데이터의로컬위치알려줌
    - use database '사용할DB명' DB사용(접속) DBSERVER, 사용할 DB선택
    
    
    DML (Data Manipulation Language) 데이터 조작어
    
    DCL (Data Control Language) 데이터 제어어
*/

# 현재 DB SERVER 존재하는 데이터베이스 학인
show databases;
#2. 현재 DB SERVER 존재하는 로컬(C드라이브) 위치 확인
show variables like 'datadir';
#3. 현재 DB SERVER내 데이터베이스 생성
create database myDB;
#4. 데이터베이스 삭제
drop database myDB;
#4-2 만약에 해당 데이터 베이스 존재하면 삭제
drop database if exists myDB;
#5. DB SERVER에는 여러개의 데이터베이스 존재
use myDB;

#실습1
/*
test2이름의 데이터베이스가존재하면 삭제하기
test2 이름의 데이터베이스 생성하기
데이터베이스 목록확인
로컬PC에 데이터베이스가 있는지 확인하기
test2 데이터베이스 사용 활성화 하기
*/
drop database if exists test2;
create database test2;
show databases;
show variables like 'datadir';
use test2;
