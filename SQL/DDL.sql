
CREATE TABLE aeroporto (
	id_aeroporto serial4 NOT NULL,
	nome_aeroporto varchar(255) NULL,
	CONSTRAINT aeroporto_pkey PRIMARY KEY (id_aeroporto)
);



CREATE TABLE fabricante (
	id_fabricante serial4 NOT NULL,
	nome varchar(255) NOT NULL,
	pais_origem varchar(255) NULL,
	CONSTRAINT fabricante_pkey PRIMARY KEY (id_fabricante)
);



CREATE TABLE linguas (
	id_lingua serial4 NOT NULL,
	lingua varchar(255) NULL,
	CONSTRAINT linguas_pkey PRIMARY KEY (id_lingua)
);



CREATE TABLE pais (
	id_pais serial4 NOT NULL,
	nome varchar(255) NULL,
	CONSTRAINT pais_pkey PRIMARY KEY (id_pais)
);



CREATE TABLE tripulante (
	id_tripulante serial4 NOT NULL,
	nome_tripulante varchar(255) NULL,
	idade int4 NULL,
	matricula varchar(255) NULL,
	cpf varchar(255) NULL,
	status bool NULL,
	CONSTRAINT tripulante_pkey PRIMARY KEY (id_tripulante)
);


CREATE TABLE comissaria (
	id_comissaria int4 NOT NULL,
	CONSTRAINT comissaria_pkey PRIMARY KEY (id_comissaria),
	CONSTRAINT comissaria_id_comissaria_fkey FOREIGN KEY (id_comissaria) REFERENCES tripulante(id_tripulante)
);



CREATE TABLE comissaria_lingua (
	id_comissaria int4 NOT NULL,
	id_lingua int4 NOT NULL,
	CONSTRAINT comissaria_lingua_pkey PRIMARY KEY (id_comissaria, id_lingua),
	CONSTRAINT comissaria_lingua_id_comissaria_fkey FOREIGN KEY (id_comissaria) REFERENCES comissaria(id_comissaria),
	CONSTRAINT comissaria_lingua_id_lingua_fkey FOREIGN KEY (id_lingua) REFERENCES linguas(id_lingua)
);



CREATE TABLE linha_aerea (
	id_linha serial4 NOT NULL,
	id_aeroporto_destino int4 NOT NULL,
	id_aeroporto_origem int4 NOT NULL,
	CONSTRAINT linha_aerea_pkey PRIMARY KEY (id_linha),
	CONSTRAINT linha_aerea_id_aeroporto_destino_fkey FOREIGN KEY (id_aeroporto_destino) REFERENCES aeroporto(id_aeroporto),
	CONSTRAINT linha_aerea_id_aeroporto_origem_fkey FOREIGN KEY (id_aeroporto_origem) REFERENCES aeroporto(id_aeroporto)
);


CREATE TABLE modelo_aeronave (
	id_modelo serial4 NOT NULL,
	id_fabricante int4 NULL,
	nome varchar(255) NULL,
	capacidade_passageiro int4 NOT NULL,
	capacidade_carga float8 NULL,
	autonomia float8 NULL,
	CONSTRAINT modelo_aeronave_pkey PRIMARY KEY (id_modelo),
	CONSTRAINT modelo_aeronave_id_fabricante_fkey FOREIGN KEY (id_fabricante) REFERENCES fabricante(id_fabricante)
);



CREATE TABLE piloto (
	id_piloto int4 NOT NULL,
	CONSTRAINT piloto_pkey PRIMARY KEY (id_piloto),
	CONSTRAINT piloto_id_piloto_fkey FOREIGN KEY (id_piloto) REFERENCES tripulante(id_tripulante)
);



CREATE TABLE piloto_modelo (
	id_modelo int4 NOT NULL,
	id_piloto int4 NOT NULL,
	horas_voo float8 NULL,
	CONSTRAINT piloto_modelo_pkey PRIMARY KEY (id_modelo, id_piloto),
	CONSTRAINT piloto_modelo_id_modelo_fkey FOREIGN KEY (id_modelo) REFERENCES modelo_aeronave(id_modelo),
	CONSTRAINT piloto_modelo_id_piloto_fkey FOREIGN KEY (id_piloto) REFERENCES piloto(id_piloto)
);


CREATE TABLE aeronave (
	id_aeronave serial4 NOT NULL,
	id_modelo_aeronave int4 NULL,
	dt_aquisicao date NULL,
	CONSTRAINT aeronave_pkey PRIMARY KEY (id_aeronave),
	CONSTRAINT aeronave_id_modelo_aeronave_fkey FOREIGN KEY (id_modelo_aeronave) REFERENCES modelo_aeronave(id_modelo)
);


CREATE TABLE modelo_linha (
	id_aeronave int4 NOT NULL,
	id_linha int4 NOT NULL,
	CONSTRAINT modelo_linha_pkey PRIMARY KEY (id_aeronave, id_linha),
	CONSTRAINT modelo_linha_id_aeronave_fkey FOREIGN KEY (id_aeronave) REFERENCES aeronave(id_aeronave),
	CONSTRAINT modelo_linha_id_linha_fkey FOREIGN KEY (id_linha) REFERENCES linha_aerea(id_linha)
);


CREATE TABLE voo (
	id_voo serial4 NOT NULL,
	id_linha int4 NOT NULL,
	id_aeronave int4 NOT NULL,
	id_piloto int4 NOT NULL,
	id_copiloto int4 NOT NULL,
	dt_partida date NULL,
	dt_chegada date NULL,
	CONSTRAINT voo_pkey PRIMARY KEY (id_voo),
	CONSTRAINT voo_id_aeronave_fkey FOREIGN KEY (id_aeronave) REFERENCES aeronave(id_aeronave),
	CONSTRAINT voo_id_copiloto_fkey FOREIGN KEY (id_copiloto) REFERENCES piloto(id_piloto),
	CONSTRAINT voo_id_linha_fkey FOREIGN KEY (id_linha) REFERENCES linha_aerea(id_linha),
	CONSTRAINT voo_id_piloto_fkey FOREIGN KEY (id_piloto) REFERENCES piloto(id_piloto)
);
