## TASK - Delete Operation

Steps:

1. Get the object from the database using primary key.
2. Update the retrieved object.

   ```
       student.setFirstName("Scooby");
   ```

   ```
   	session.createQuery("update Student set email='foo@gmail.com'").executeUpdate();
   ```

3. Commit the transaction.
   Note: No need to save the the session.
