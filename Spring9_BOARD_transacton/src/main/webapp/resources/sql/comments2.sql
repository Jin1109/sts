drop table comments2 CASCADE CONSTRAINTS;

select * from comments2;

create table comments2(
	num			number			primary key,
	id			varchar2(30)	references member2(id),
	content 	varchar2(200),
	reg_date	date,
	board_num	number references board2(board_num)
				on delete cascade
);

drop sequence com_seq2;
create sequence com_seq2;