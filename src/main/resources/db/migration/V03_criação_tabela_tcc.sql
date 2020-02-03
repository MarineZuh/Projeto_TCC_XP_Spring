use projeto;

create table tcc(
	tema varchar(50),
    id int auto_increment,
    orientador int,
    orientando int,
    primary key (id),
    foreign key (orientador) references professor(id),
    foreign key (orientando) references aluno(id)
);

insert into tcc (tema,orientador, orientando) values ('Robotica educacional',1,1);
insert into tcc (tema,orientador, orientando) values ('Inteligência artificial e seus conceitos',2,2);
insert into tcc (tema,orientador, orientando) values ('A analise de dados no mercado de trabalho',3,3);