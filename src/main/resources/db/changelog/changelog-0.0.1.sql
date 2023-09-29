CREATE SEQUENCE voucher_details_id_seq;

CREATE TABLE voucher_details
(
    id         INTEGER DEFAULT nextval('voucher_details_id_seq') NOT NULL,
    name       VARCHAR(255),
    address    VARCHAR(255),
    phone      VARCHAR(255),
    head_id    BIGINT,
    amount     DOUBLE PRECISION,
    PRIMARY KEY (id)
);

