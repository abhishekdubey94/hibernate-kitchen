## TASK 1 - Set Up

1. Create a user in the database.
   ```
   CREATE USER 'hbstudent'@'localhost' IDENTIFIED BY 'hbstudent';
   GRANT ALL PRIVILEGES ON *.* TO 'hbstudent'@'localhost';
   ```
2. Create a new connection in MySQL Workbench using above user.
3. Login with the above user.
4. Create a new database table.

   ```
    CREATE DATABASE IF NOT EXISTS `hb_student_tracker`;
    USE `hb_student_tracker`;

    DROP TABLE IF EXISTS `student`;

    CREATE TABLE `student` (
    `id` integer NOT NULL AUTO_INCREMENT,
    `first_name` varchar(45) DEFAULT NULL,
    `last_name` varchar(45) DEFAULT NULL,
    `email` varchar(45) DEFAULT NULL,
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

   ```
