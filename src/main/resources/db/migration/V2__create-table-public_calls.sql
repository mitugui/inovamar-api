create table public_calls(
    id bigint not null auto_increment,
    organization_id bigint not null,
    title varchar(255) not null,
    description varchar(500) not null,
    submission_deadline varchar(100),
    funding decimal(11,2),

    primary key(id),

    constraint fk_public_calls_organization_id foreign key(organization_id) references organizations(id)
);