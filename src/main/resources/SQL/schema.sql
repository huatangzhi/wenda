CREATE TABLE user
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name VARCHAR(64) DEFAULT '' NOT NULL,
    password VARCHAR(128) NOT NULL,
    salt VARCHAR(32) DEFAULT '',
    head_url VARCHAR(256)
);
CREATE UNIQUE INDEX user_name_uindex ON user (name);

CREATE TABLE question
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    user_id INT(11),
    created_date DATETIME NOT NULL,
    comment_count INT(11) NOT NULL
);
CREATE INDEX date_index ON question (created_date);