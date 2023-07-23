**Task 4**

**Questions** 

1. Create an SQL Query which retrieves the id, name and surname of all registered users under
country Malta.
2. Create an SQL Query which retrieves the id, name, surname of all registered users that are
   NOT registered under country Portugal and France.
3. Create an SQL Query which retrieves the id, name and surname of all registered users which
   are still active.
4. Create an SQL Query which retrieves the name, surname and emails of all registered users
   which requires a reset password.


**Answers**


1. SELECT id, name, surname
FROM users
WHERE country = 'Malta';


2. SELECT id, name, surname
FROM users
WHERE country NOT IN ('Portugal', 'France');


3. SELECT u.id, u.name, u.surname
FROM users u
LEFT JOIN user_cred uc ON u.id = uc.id
WHERE us.failed_logins = 0 OR us.failed_logins = 1;


4. SELECT u.name, u.surname, u.email
FROM users u
LEFT JOIN user_cred uc ON u.id = uc.id
WHERE uc.required_reset_required = 1;