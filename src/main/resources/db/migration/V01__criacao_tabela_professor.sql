
create table professor (
	nome varchar (40),
    id int auto_increment,
    departamento varchar (40),
    email varchar(40),
    formacao varchar (40),
    primary key (id)
);
insert into professor (nome, departamento, email, formacao) values ('Ana MAria', 'DAI', 'amar@acad.edu.br', 'cientistas de dados');
insert into professor (nome, departamento, email, formacao) values ('Carlo Paulo', 'DAI', 'Capaulo@acad.edu.br', 'Analista sistema');
insert into professor (nome, departamento, email, formacao) values ('Pedro dominick', 'DAI', 'dominickt@acad.edu.br', 'Cientista da computação');

