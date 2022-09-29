drop table member2 cascade constraints purge;

create table member2(
	id			varchar2(15),
	password	varchar2(60),
	name		varchar2(15),--한글 5글자까지 가능
	age			number(2),
	gender		varchar2(3),
	email		varchar2(30),
	PRIMARY	KEY(id)
);

select * from member2;
