CREATE TABLE plant (
  id serial PRIMARY KEY,
  name varchar(128) NOT NULL
);

INSERT INTO plant (name)
VALUES ('Роза'), ('Ромашка'), ('Одуванчик'), ('Гвоздика'), ('Тюльпан');