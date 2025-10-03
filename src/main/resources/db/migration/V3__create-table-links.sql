create table links(
    id bigint not null auto_increment,
    public_call_id bigint not null,
    title varchar(255) not null,
    url varchar(500) not null,

    primary key(id),

    constraint fk_links_public_call_id foreign key(public_call_id) references public_calls(id)
);