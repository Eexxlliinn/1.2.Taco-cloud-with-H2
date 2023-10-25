drop sequence taco_sequence if exists;
drop sequence taco_order_sequence if exists;
create sequence taco_sequence start with 1 increment by 50;
create sequence taco_order_sequence start with 1 increment by 50;
drop table Taco_Order if exists cascade;
drop table Taco if exists cascade;
drop table Ingredient_Ref if exists cascade;
drop table Ingredient if exists cascade;
create table if not exists Taco_Order (
    id identity(1, 1) primary key,
    delivery_Name varchar(50) not null,
    delivery_Street varchar(50) not null,
    delivery_City varchar(50) not null,
    delivery_State varchar(50) not null,
    delivery_Zip varchar(20) not null,
    cc_number varchar(16) not null,
    cc_expiration varchar(5) not null,
    cccvv varchar(3) not null,
    placed_at timestamp not null
);
create table if not exists Taco (
    id identity(1, 1) primary key,
    name varchar(50) not null,
    taco_order bigint not null,
    created_at timestamp not null
);
create table if not exists Ingredient_Ref (
    ingredient varchar(4) not null,
    taco bigint not null
);
create table if not exists Ingredient (
    id varchar(4) primary key,
    name varchar(50) not null,
    type varchar(10) not null
);
alter table Taco add foreign key (taco_order) references Taco_Order(id);
alter table Ingredient_Ref add foreign key (ingredient) references Ingredient(id);
alter table Ingredient_Ref add foreign key (taco) references Taco(id);