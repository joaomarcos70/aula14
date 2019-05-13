
DROP TABLE users;
CREATE TABLE users(
id BIGINT not null primary key
GENERATED ALWAYS AS IDENTITY
(START WITH 1, INCREMENT BY 1)
,role varchar (200)not null
,name varchar (200)not null
,login varchar (200)not null
,passwordHash BIGINT not null
);

INSERT INTO users VALUES
(default, 'ADMIN', 'Administrator', 'admin',1509442);
INSERT INTO users VALUES
(default, 'OPERADOR','Fulano da silva','fulano',1509442);

DROP TABLE prices;

CREATE TABLE prices(
id BIGINT not null primary key
generated always as identity 
(start with 1, increment by 1)
,timestamp TIMESTAMP not null
,new_price double precision not null 
);

drop table parking_peiods;
create table parking_periods(
id BIGINT not null primary key 
GENERATED ALWAYS AS IDENTITY
(start with 1, increment by 1)
,model varchar(50) not null 
,plate varchar(7) not null
,begin_peiod timestamp not null
,end_peiod timestamp
,price double precision
);
  

CREATE TABLE PARKING_PERIODS(
ID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY
(START WITH 1, INCREMENT BY 1),
PLATE VARCHAR(7) NOT NULL,
BEGIN_PERIOD TIMESTAMP NOT NULL,
END_PERIOD TIMESTAMP,
PRICE NUMERIC(10,2)
)
