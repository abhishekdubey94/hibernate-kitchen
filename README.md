## HIBERNATE

- JPA (Java Persistence API) is a standard notation, Hibernate is an implementation of the JPA specification. Hibernate implements all of the JPA annotations. The Hibernate team recommends the use of JPA annotations as a best practice.
- Hibernate can generate database tables based on the Java code. (https://www.dineshonjava.com/hibernate/hbm2ddl-configuration-and-name/)

To build Hibernate Applications, we need

1. Java Integrated Development Environment(IDE)
2. Database server
3. Hibernate JAR and JDBC Driver

- Hibernate uses JDBC in background to interact with databases.
- The hibernate config file has the JDBC url, userid and password
- Entity Class - Java Class that is mapped to a database table. It is a simple java class which has getters/setters with annotation to map it to a table in the database.
- For primary key with auto increment, there are various strategies.
- Our own implementation can be done using IdentifierGenerator.
