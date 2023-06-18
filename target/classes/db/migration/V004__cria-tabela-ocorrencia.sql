CREATE TABLE ocorrencia (
    id bigint not null auto_increment primary key,
	entrega_id bigint not null,
	descricao text not null,
	data_registro datetime not null
);

ALTER TABLE ocorrencia add constraint fk_ocorrencia_entrega
foreign key (entrega_id) references entrega (id);