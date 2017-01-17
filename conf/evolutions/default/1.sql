# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table libro (
  id                            varchar(255) not null,
  titulo                        varchar(255),
  autor                         varchar(255),
  precio                        float,
  constraint pk_libro primary key (id)
);


# --- !Downs

drop table if exists libro;

