create table role (id int8 generated by default as identity, role_name varchar(255), primary key (id));
create table user (id int8 generated by default as identity, email varchar(255), name varchar(255), password varchar(255), primary key (id));
create table user_role (user_id int8 not null, role_id int8 not null, primary key (user_id, role_id));
alter table if exists user add constraint UK_ob8kqyqqgmefl0aco34akdtpe unique (email);
alter table if exists user_role add constraint FKa68196081fvovjhkek5m97n3y foreign key (role_id) references role;
alter table if exists user_role add constraint FK859n2jvi8ivhui0rl0esws6o foreign key (user_id) references user;
create table tb_role (id int8 generated by default as identity, role_name varchar(255), primary key (id));
create table tb_user (id int8 generated by default as identity, email varchar(255), name varchar(255), password varchar(255), primary key (id));
create table user_role (user_id int8 not null, role_id int8 not null, primary key (user_id, role_id));
alter table if exists tb_user add constraint UK_4vih17mube9j7cqyjlfbcrk4m unique (email);
alter table if exists user_role add constraint FKeayxeqvq6j9yuf6ogfgvr9u6 foreign key (role_id) references tb_role;
alter table if exists user_role add constraint FK430om9qnxgilp5cvcbeyovi37 foreign key (user_id) references tb_user;