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

## TASK - To setup eclipse

1. Create Eclipse Project, create new folder lib.
2. Download Hibernate Files - hibernate.org/orm/
   Extract the zip and copy required folders contents into lib
3. Download MySQL JDBC Driver - mysql.com/downloads/.
   Download the connector zip. Extract the zip and copy the jar in lib.
4. Add Jar files to Eclipse Project i.e Build Path
   Right Click on project -> Java Build Path -> libraries -> Add jars from lib. After this the references library in the project should have all the jar files from the lib.

## TASK - to test JDBC connection

1. Create a package and class in the java project.

   ```
      package com.luv2code.jdbc;

      import java.sql.Connection;
      import java.sql.DriverManager;

      public class TestJdbc {

         public static void main(String[] args) {
            try {
               String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
               String user = "hbstudent";
               String pass = "hbstudent";
               System.out.println("Connecting to database");
               Connection myConn = DriverManager.getConnection(jdbcUrl,user,pass);
               System.out.println("Connection Successful!!");

            }catch(Exception exc){
               exc.printStackTrace();
            }

         }

   }
   ```

## TASK - Hibernate Development Process

1. Add Hibernate Configuration file to src directory.
2. Annotate Java Class.

   1. Map the class to database table.
   2. Map the fields to database columns.

   ```
      @Entity //javax.persistence
      @Table(name="student") //javax.persistence
      public class Student
      {
         //no arg constructor

         @Id // for primary key
         @Column(name="id")
         private int id;

         @Column(name="first_name")
         private String firstName;
      }
   ```

3. Develop Java Code to perform database operations.
