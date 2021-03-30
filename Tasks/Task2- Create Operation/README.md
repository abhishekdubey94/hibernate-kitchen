## TASK - To Create Objects

To work with hibernate, we need to use SessionFactory Interface.

- SessionFactory is an interface. SessionFactory can be created by providing Configuration object, which will contain all DB related property details pulled from either hibernate.cfg.xml file or hibernate.properties file. SessionFactory is a factory for Session objects.

- We can create one SessionFactory implementation per database in any application. If your application is referring to multiple databases, then you need to create one SessionFactory per database.

- The SessionFactory is a heavyweight object; it is usually created during application start up and kept for later use. The SessionFactory is a thread safe object and used by all the threads of an application.

From SessionFactory we get Session.

- A Session is used to get a physical connection with a database. The Session object is lightweight and designed to be instantiated each time an interaction is needed with the database. Persistent objects are saved and retrieved through a Session object.

- The session objects should not be kept open for a long time because they are not usually thread safe and they should be created and destroyed them as needed. The main function of the Session is to offer, create, read, and delete operations for instances of mapped entity classes.

- If you want to start the id with some specific value, use
  ```
      ALTER TABLE db_name.table_name AUTO_INCREMENT=value_to_start;
  ```
- To reset the table
  ```
      TRUNCATE db_name.table_name;
  ```

STEPS:

1. Create a SessionFactory Object.
   ```
       SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
                   .buildSessionFactory();
   ```
2. Create a Session from SessionFactory.
   ```
      Session session = factory.getCurrentSession();
   ```
3. Begin the transaction of the session object.
   ```
       session.beginTransaction();
   ```
4. Save the object
   ```
       session.save(new Student("A","B"));
   ```
5. Get the transaction from the session and commit.
   ```
       session.getTransaction().commit();
   ```
6. Close the factory.
   ```
       factory.close();
   ```
