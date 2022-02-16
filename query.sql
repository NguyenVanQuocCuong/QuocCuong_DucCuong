create database student_management ;
use student_management ;


create table student (
	id int primary key auto_increment,
	fullname varchar(50) not null,
	gender varchar(15),
	age int,
	email varchar(150),
	phone_number varchar(15)
);


create table project (
	id int primary key auto_increment,
	projectname varchar(50) not null,
	deadline varchar(15),
	instruction varchar(15)
);