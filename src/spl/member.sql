SELECT * FROM member;
--계정생성--
CREATE USER oracle    IDENTIFIED BY password;

oracle/password
--권한부여--
GRANT RESOURCE, CONNECT, DBA TO oracle;

----현재 사용자 정보
SHOW USER;

SELECT * FROM TAB;


----테이블생성
CREATE TABLE member(
id VARCHAR2(10),
name VARCHAR2(10),
pass VARCHAR2(10),
ssn VARCHAR2(14)
);
SELECT * FROM member;

---삭제
DROP TABLE member;

---인스턴스 생성 == DB에서 한 row를 추가하는 것
INSERT INTO member(id, name, pass, ssn)
VALUES('hong', '홍길동', '1', '960314-1234567')