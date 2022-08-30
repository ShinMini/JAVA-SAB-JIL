show tables;

use 0822db;

DROP TABLE IF EXISTS Emp;
DROP TABLE IF EXISTS Dept;

CREATE TABLE Emp
(
    emp_no    BIGINT       NOT NULL auto_increment,
    emp_name    VARCHAR(255) NULL,
    sal      BIGINT       NULL,
    dept_no   BIGINT       NULL,
    CONSTRAINT pk_emp PRIMARY KEY (emp_no)
);

CREATE TABLE Dept
(
    dept_no BIGINT       NOT NULL,
    dept_name  VARCHAR(255) NULL,
    loc    VARCHAR(255) NULL,
    CONSTRAINT pk_dept PRIMARY KEY (dept_no)
);

ALTER TABLE Emp
    ADD CONSTRAINT FK_EMP_ON_DEPT_NO FOREIGN KEY (dept_no) REFERENCES Dept (dept_no);
### employee table values ###

-- 인사 부서
insert into Emp (emp_no, emp_name, sal)values ( 111, 'ponark', 3333);
insert into Emp (emp_no, emp_name, sal)values ( 128, 'rodasa', 8300);
insert into Emp (emp_no, emp_name, sal)values ( 139, 'kerium', 2000);
insert into Emp (emp_no, emp_name, sal)values ( 142, 'rod', 8030);

-- 운영 부서
insert into Emp (emp_no, emp_name, sal)values ( 201, 'jubar', 3929);
insert into Emp (emp_no, emp_name, sal)values ( 221, 'parkikyun', 4222);
insert into Emp (emp_no, emp_name, sal)values ( 293, 'bekamu', 6682);

-- 개발 부서
insert into Emp (emp_no, emp_name, sal)values ( 310, 'hyeon', 5300);
insert into Emp (emp_no, emp_name, sal)values ( 322, 'mini', 6030);
insert into Emp (emp_no, emp_name, sal)values ( 303, 'ayeii', 2400);

-- 생산 부서
insert into Emp (emp_no, emp_name, sal)values ( 441, 'showche', 5000);
insert into Emp (emp_no, emp_name, sal)values ( 429, 'chadu', 2000);
insert into Emp (emp_no, emp_name, sal)values ( 443, 'suricha', 8030);

-- 디자인 부서
insert into Emp (emp_no, emp_name, sal)values ( 515, 'simsori', 4000);
insert into Emp (emp_no, emp_name, sal)values ( 529, 'mulra', 8833);
insert into Emp (emp_no, emp_name, sal)values ( 503, 'maljori', 1223);

-- 판매 부서
insert into Emp (emp_no, emp_name, sal)values ( 611, 'irion', 2000);
insert into Emp (emp_no, emp_name, sal)values ( 623, 'parkno', 3000);
insert into Emp (emp_no, emp_name, sal)values ( 643, 'eimil', 4000);

### Dept table values ###
insert into Dept (dept_no, dept_name, loc)values ( 100, 'PR', '7F' );
insert into Dept (dept_no, dept_name, loc)values ( 200, 'OP', '4F' );
insert into Dept (dept_no, dept_name, loc)values ( 300, 'DEV', '11F' );
insert into Dept (dept_no, dept_name, loc)values ( 400, 'MA', '6F' );
insert into Dept (dept_no, dept_name, loc)values ( 500, 'DE', '5F' );
insert into Dept (dept_no, dept_name, loc)values ( 600, 'SA', '2F' );
