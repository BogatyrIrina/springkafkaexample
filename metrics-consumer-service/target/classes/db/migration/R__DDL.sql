CREATE TABLE metric (
    id serial PRIMARY KEY,
    name varchar,
    description varchar,
    base_unit varchar
);

CREATE TABLE available_tag (
    id serial PRIMARY KEY,
    tag varchar,
    metric_id integer,
    FOREIGN KEY (metric_id) REFERENCES metric (id)
);

CREATE TABLE measurement (
    id serial PRIMARY KEY,
    statistic varchar,
    value numeric,
    metric_id integer,
    FOREIGN KEY (metric_id) REFERENCES metric (id)
);

CREATE TABLE tbl_value (
    id serial PRIMARY KEY,
    name varchar,
    available_tag_id integer,
    FOREIGN KEY (available_tag_id) REFERENCES available_tag (id)
);