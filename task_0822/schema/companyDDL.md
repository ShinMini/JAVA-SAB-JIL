-- 00.mysql계정생성.sql
/*
* 사용자 계정 생성
* 해당 사용자는 pokemon database 사용 예정
* 작업 단계
* 1. 사용자 계정 생성(project01/project01)
* 2. 권한 부여
* 3. 사용자 계정으로 DDL(create/drop/alter) + DML(insert/update/delete) + DQL(select)
* 4. DBeaver에 project01/project01 계정으로 접속 instance 생성
*/
-- admin인 root 계정으로 접속
-- mysql -u root -p
-- database list 확인
-- SHOW DATABASES;
-- id-bigdata/pw-bigdata 계정 생성
-- 로컬 user 생성 명령어 : host=localhost
-- CREATE user 'project01'@'localhost' identified BY 'project01';
-- 외부 접속 user 생성 명령어 : host=%
-- create user 'project01'@'%' identified by 'project01';
-- 만일 ip 주소가 292.158.26.60 에서만 접속 가능한 user 생성 방식
-- create user 'project01'@'292.158.26.60' identified by 'project01';
-- DB생성CREATE DATABASE pokemon;
-- 특정 database 사용 가능하게 권한 부여
-- 전제조건 : admin 즉 root 계정으로 권한 부여
-- mysql -u root - p
-- GRANT ALL privileges ON pokemon.* TO 'project01'@'localhost';
-- ? 생성 및 권한이 있는 project01 계정으로 pokemon인 database 사용 명령어
-- mysql -u project01 -p
-- SHOW DATABASES;
-- 테이블 생성 코드
-- 생성하려는 table이 혹여 존재할 경우 삭제하는 명령어DROP TABLE IF EXISTS

