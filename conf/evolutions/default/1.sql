# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table libro (
  pk                            integer not null,
  titulo                        varchar(255),
  autor                         varchar(255),
  precio                        float,
  constraint pk_libro primary key (pk)
);
create sequence libro_seq;


# --- !Downs

drop table if exists libro;
drop sequence if exists libro_seq;

