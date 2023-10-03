drop schema if exists anotacao;

drop user if exists 'user'@'localhost';

create schema anotacao;

create user 'user'@'localhost' identified by 'pass123';

grant select, insert, delete, update on anotacao.* to user@'localhost';

use anotacao;

create table dcn_dicionario (
 dcn_id bigint primary key auto_increment,
 dcn_verbete varchar(100) not null ,
 dcn_significado varchar(200) not null ,
 dcn_versao int,
 dcn_data_hora_cadastro datetime not null,
 dcn_data_hora_revisado datetime
);

insert into dcn_dicionario (dcn_verbete, dcn_significado, dcn_data_hora_cadastro)
 values ('tupla','linha de uma tabela', '2023-10-01 10:00:06'),
 ('tupla','conjunto de atributos relacionados', current_timestamp());
