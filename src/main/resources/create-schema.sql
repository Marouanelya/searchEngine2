create table users(
      email varchar_ignorecase(50) not null primary key,
      nom varchar_ignorecase(50) not null,
      prenom varchar_ignorecase(50) not null,
      password varchar_ignorecase(250) not null,
      enabled boolean not null);



  create table authorities (
      email varchar_ignorecase(50) not null,
      authority varchar_ignorecase(50) not null,
      constraint fk4_authorities_users foreign key(email) references users(email));
      create unique index ix_auth_username on authorities (email,authority);