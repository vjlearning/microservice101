/* 
 * Copyright 2018 by vjlearning
 */
/**
 * Author:  Vijendra Rao 
 * Created: Aug 03, 2018
 */

DROP TABLE IF EXISTS NOTIFICATION_MASTER;

CREATE TABLE NOTIFICATION_MASTER ( 
    ID INT NOT NULL AUTO_INCRIMENT;
    FROM_ADDR VARCHAR(500) NOT NULL,
    TO_ADDR VARCHAR(500) NOT NULL,
    CC_ADDR VARCHAR(500),
    BCC_ADDR VARCHAR(500),
    SUBJECT VARCHAR(500),
    CONTENT VARCHAR(4000),
    CONTENT_TYPE VARCHAR(100) NOT NULL DEFAULT "text/html",
    SEND_TIME TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    SENT_FLAG VARCHAR(1),
    REC_CREATE_DATE TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    REC_CREATED_BY VARCHAR(100) NOT NULL,
    REC_UPDATED_DATE TIMESTAMP,
    REC_UPDATED_BY VARCHAR(100),
    REC_ACTIVE_FLAG INT NOT NULL DEFAULT 1,
    PRIMARY(ID)
) ENGINE = InnoDB;