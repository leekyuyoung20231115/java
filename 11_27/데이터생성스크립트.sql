drop database if exists bbs;
create database bbs;
use bbs;
drop table if exists board;
CREATE TABLE  board (
  BOARD_ID int NOT NULL AUTO_INCREMENT,
  BOARD_TITLE varchar(30) DEFAULT NULL,
  BOARD_CONTENT varchar(500) DEFAULT NULL,
  REGISTER_ID varchar(20) DEFAULT NULL,
  REGISTER_DATE datetime DEFAULT CURRENT_TIMESTAMP,
  UPDATER_ID varchar(20) DEFAULT NULL,
  UPDATER_DATE datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (BOARD_ID)
) ;
insert into board(BOARD_TITLE,BOARD_CONTENT,REGISTER_ID,REGISTER_DATE,UPDATER_ID,UPDATER_DATE) 
	values('테스트1', '내용1', '001', now(), NULL, null) ;
insert into board(BOARD_TITLE,BOARD_CONTENT,REGISTER_ID,REGISTER_DATE,UPDATER_ID,UPDATER_DATE) 
	values('테스트2', '내용2', '002', now(), NULL, null) ;    
insert into board(BOARD_TITLE,BOARD_CONTENT,REGISTER_ID,REGISTER_DATE,UPDATER_ID,UPDATER_DATE) 
	values('테스트3', '내용3', '003', now(), NULL, null) ;    

use bbs;
select * from board;

