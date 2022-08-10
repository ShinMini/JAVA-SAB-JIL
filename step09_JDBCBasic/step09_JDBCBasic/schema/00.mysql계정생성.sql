-- 00.mysql계정생성.sql
/*
 * 사용자 계정 생성
 * 해당 사용자는 playdata database 사용 예정
 * 작업 단계
 * 1. 사용자 계정 생성(bigdata/TIGER)
 * 2. 권한 부여
 * 3. 사용자 계정으로 DDL(create/drop/alter) + DML(insert/update/delete) + DQL(select)
 * 4. DBeaver에 bigdata/TIGER 계정으로 접속 instance 생성
 */ 

-- admin인 root 계정으로 접속
>mysql -u root -p 

-- database list 확인
mysql>show databases;


-- mysql 사용자 list 확인
-- mysql database는 사용자 계정에 대한 정보 보유
use mysql;

select user from user;


-- id-bigdata/pw-bigdata 계정 생성

-- 로컬 user 생성 명령어 : host=localhost
create user 'bigdata'@'localhost' identified by 'bigdata';

-- 외부 접속 user 생성 명령어 : host=%
create user 'bigdata'@'%' identified by 'bigdata';

-- 만일 ip 주소가 292.158.26.60 에서만 접속 가능한 user 생성 방식
-- create user 'bigdata'@'292.158.26.60' identified by 'bigdata';


-- 특정 database 사용 가능하게 권한 부여
-- 전제조건 : admin 즉 root 계정으로 권한 부여
mysql -u root - p 
grant all privileges on playdata.* to 'bigdata'@'localhost'; 





-- ? 생성 및 권한이 있는 bigdata 계정으로 playdata인 database 사용 명령어
mysql -u bigdata -p

-- use mysql;  권한 없어 에러 
-- select user from user; 권한 없어 에러 

show databases;
use playdata;
show tables;



-- 계정 삭제
-- admin 계정으로 접속 후 bigdata 사용자 계정 삭제 명령어
mysql> drop user 'bigdata'@'292.158.26.60';

mysql> select user, host from user;
+------------------+-----------+
| user             | host      |
+------------------+-----------+
| bigdata            | %         |
| bigdata            | localhost |
| mysql.infoschema | localhost |
| mysql.session    | localhost |
| mysql.sys        | localhost |
| root             | localhost |
+------------------+-----------+
6 rows in set (0.00 sec)


-- 해당 user의 권한을 확인하는 명령어
mysql> show grants for 'bigdata'@'localhost';
+-------------------------------------------------------------+
| Grants for bigdata@localhost                                  |
+-------------------------------------------------------------+
| GRANT USAGE ON *.* TO `bigdata`@`localhost`                   |
| GRANT ALL PRIVILEGES ON `playdata`.* TO `bigdata`@`localhost` |
+-------------------------------------------------------------+
2 rows in set (0.00 sec)

mysql> show grants for current_user;



