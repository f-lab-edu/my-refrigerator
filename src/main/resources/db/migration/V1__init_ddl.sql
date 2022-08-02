#refrigerator
#refrigerator
CREATE TABLE `refrigerator` (
        `id` bigint NOT NULL AUTO_INCREMENT,
        `name` varchar(100) NOT NULL UNIQUE KEY,
        `created_time` datetime DEFAULT NULL,
        `modified_time` datetime DEFAULT NULL,
        `deleted_time` datetime DEFAULT NULL,
        `limited_volume` bigint NOT NULL,
        PRIMARY KEY (`id`)
) ENGINE=InnoDB charset = utf8mb4;



#item
CREATE TABLE item (
       id BIGINT auto_increment NOT NULL,
       name varchar(100) NOT NULL UNIQUE KEY,
       storage_start_date DATETIME NULL,
       storage_end_date DATETIME NULL,
       volume BIGINT NOT NULL,
       refrigerator_id BIGINT NOT NULL,
       CONSTRAINT item_PK PRIMARY KEY (id),
      CONSTRAINT `item_FK` FOREIGN KEY (`refrigerator_id`) REFERENCES `refrigerator` (`id`)
) ENGINE=InnoDB charset = utf8mb4;

#냉장고 데이터
INSERT INTO refrigerator.refrigerator
(id, name, created_time, modified_time, deleted_time, limited_volume)
VALUES(1, '냉장고A', '2022-08-01 21:24:31', '2022-08-01 21:24:31', NULL, 100);
INSERT INTO refrigerator.refrigerator
(id, name, created_time, modified_time, deleted_time, limited_volume)
VALUES(2, '냉장고B', '2022-08-02 22:30:31', '2022-08-02 22:30:31', NULL, 200);
#아이템 데이터
INSERT INTO refrigerator.item
(id, name, storage_start_date, storage_end_date, volume, refrigerator_id)
VALUES(1, '아이템A', '2022-07-31 00:00:00', '2022-08-29 00:00:00', 30, 1);
INSERT INTO refrigerator.item
(id, name, storage_start_date, storage_end_date, volume, refrigerator_id)
VALUES(2, '아이템B', '2022-07-31 00:00:00', '2022-08-29 00:00:00', 30, 1);
INSERT INTO refrigerator.item
(id, name, storage_start_date, storage_end_date, volume, refrigerator_id)
VALUES(3, '아이템C', '2022-07-31 00:00:00', '2022-08-29 00:00:00', 30, 1);
INSERT INTO refrigerator.item
(id, name, storage_start_date, storage_end_date, volume, refrigerator_id)
VALUES(4, '아이템D', '2022-07-31 00:00:00', '2022-08-29 00:00:00', 10, 2);
INSERT INTO refrigerator.item
(id, name, storage_start_date, storage_end_date, volume, refrigerator_id)
VALUES(5, '아이템E', '2022-08-02 00:00:00', '2022-08-27 00:00:00', 30, 2);
INSERT INTO refrigerator.item
(id, name, storage_start_date, storage_end_date, volume, refrigerator_id)
VALUES(6, '아이템F', '2022-08-03 00:00:00', '2022-08-28 00:00:00', 20, 2);
INSERT INTO refrigerator.item
(id, name, storage_start_date, storage_end_date, volume, refrigerator_id)
VALUES(7, '아이템G', '2022-08-04 00:00:00', '2022-08-29 00:00:00', 40, 2);
