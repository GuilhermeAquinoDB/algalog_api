<<<<<<< HEAD
CREATE TABLE ocorrencia (
    id bigint not null auto_increment primary key,
	entrega_id bigint not null,
	descricao text not null,
	data_registro datetime not null
);

ALTER TABLE ocorrencia add constraint fk_ocorrencia_entrega
=======
create table ocorrencia (

	id bigint not null auto_increment primary key,
	entrega_id bigint not null,
	descricao text not null,
	data_registro datetime not null

);

alter table ocorrencia add constraint fk_ocorrencia_entrega
>>>>>>> 4b41594fa2ff4e26929cfd4d7dbc5536aa7e0273
foreign key (entrega_id) references entrega (id);