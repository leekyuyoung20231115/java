drop table if exists product;
create table product(
	id	int auto_increment,
    pname varchar(100) not null,
    stock int not null,
    price int not null,
    create_dt datetime  not null default now(),
    modify_dt datetime  not null default now(),
    delyn char(1) not null default 'N',
    primary key(id)
);
-- crud
-- create : insert
insert into product(pname,stock,price) values("바나나우유",100,1400);
insert into product(pname,stock,price) values("초코우유",100,1400);
insert into product(pname,stock,price) values("딸기우유",100,1400);
insert into product(pname,stock,price) values("커피우유",100,1400);
-- read : select
select * from product where delyn = 'N';

-- update : update

update product set stock = 50  where delyn = 'N' and id = 1;

-- delete : update
update product set delyn = 'Y' where id = 3;
drop table if exists member;
create table member(
	email varchar(45) not null,
    psw varchar(100) not null,
    mrole varchar(45) not null default 'user',
    create_dt datetime  not null default now(),
    modify_dt datetime  not null default now(),
    delyn char(1) not null default 'N',
    primary key(email)
);

