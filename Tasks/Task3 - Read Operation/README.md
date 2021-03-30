## TASK - Read Operation

To get the data using primary key
Steps:

1. Get the SessionFactory and Session.
2. Begin the transaction.
3. Use 'get' method of the session to retrieve the data
   ```
       Student s = session.get(Student.class,primary_key_val);
   ```
4. Get the transaction from the session and commit it.

To Query The Table

- Hibernate uses HQL (Hibernate Query Language) which is similar to SQL.
- Use class names and field names of the entity rather than table name in mysql for HQL.
  Steps:

1. Get the SessionFactory and Session.
2. Begin the transaction.
3. Use 'get' method of the session to retrieve the data
   ```
       resultList = session.createQuery("from Student s where s.lastName='Doe' OR s.firstName='Daffy'")
   				.getResultList();
   ```
4. Get the transaction from the session and commit it.
