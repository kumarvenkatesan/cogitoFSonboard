create sequence seq_customer;

CREATE TABLE customer (
                                 id int8 default nextval('seq_customer') ,
                                 fist_name varchar(25) not NULL,
                                 last_name varchar(25) not NULL,
                                 mobile varchar(15) not NULL,
                                 email varchar(35) not NULL,
                                 address1 varchar(55) not NULL,
                                 address2 varchar(55) NULL,
                                 pincode int4 NOT NULL,
                                 CONSTRAINT customer_pkey PRIMARY KEY (id)
);