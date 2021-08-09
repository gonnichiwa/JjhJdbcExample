
drop table Student
-- Student 테이블을 만듭니다.
create table Student(
                        id int primary key,        -- 학생 구분 번호
                        name varchar(30) not null, -- 학생 이름
                        age int not null,          -- 학생 나이
                        phone varchar(50) not null, -- 폰번호
                        email varchar(100) not null default'no email' -- email
)
-- 학생 데이터 추가해 봅시다
insert into Student (id, name, age, phone, email) values
                                                      (1, '홍길동', 33, '010-1234-5678', 'gildong@gmail.com'),
                                                      (2, '홍길서', 34, '010-2345-6789', 'gilseo@daum.net'),
                                                      (3, '서우진', 25, '010-2548-6849', 'ugin@hanmail.net'),
                                                      (4, '김예준', 27, '010-9559-1515', 'yejun@gmail.com'),
                                                      (5, '박서준', 29, '010-4847-2828', 'seojun@gmail.com')

select max(id) + 1 from Student


select * from Student
-- 나이가 30이상인 학생들을 모두 조회 하시오
select * from Student where age >= 30
-- 나이가 30 이상인 학생들을 나이 많은 순으로 조회 하시오
select * from Student
order by age
select * from Student;