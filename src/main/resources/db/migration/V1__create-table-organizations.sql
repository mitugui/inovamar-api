create table organizations(
    id bigint not null auto_increment,
    name varchar(45) not null unique,

    primary key(id)
);