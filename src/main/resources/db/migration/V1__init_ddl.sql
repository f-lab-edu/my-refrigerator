#refrigerator
CREATE TABLE `refrigerator` (
        `id` bigint NOT NULL AUTO_INCREMENT,
        `name` varchar(100) NOT NULL,
        `created_time` datetime DEFAULT NULL,
        `modified_time` datetime DEFAULT NULL,
        `deleted_time` datetime DEFAULT NULL,
        `limited_volume` bigint NOT NULL,
        PRIMARY KEY (`id`)
) ENGINE=InnoDB charset = utf8mb4;

#item
CREATE TABLE item (
       id BIGINT auto_increment NOT NULL,
       name varchar(100) NOT NULL,
       storage_start_date DATETIME NULL,
       storage_end_date DATETIME NULL,
       volume BIGINT NOT NULL,
       refrigerator_id BIGINT NOT NULL,
       CONSTRAINT item_PK PRIMARY KEY (id)
) ENGINE=InnoDB charset = utf8mb4;

