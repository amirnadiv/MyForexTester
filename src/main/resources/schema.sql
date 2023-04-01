DROP ALL OBJECTS;

CREATE TABLE IF NOT EXISTS GBPJPY (
                         id   INTEGER      NOT NULL AUTO_INCREMENT,
                         date VARCHAR(128) NOT NULL,
                         time  DOUBLE ,
                         high  DOUBLE ,
                         low   DOUBLE ,
                         open  DOUBLE ,
                         close DOUBLE ,
                         volume int ,
                         PRIMARY KEY (id)
);