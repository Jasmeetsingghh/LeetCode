/* Write your PL/SQL query statement below */
-- select firstName,lastName, city ,state from person p left join Address a on p.personId=a.personId where p.personId !=a.personId;

SELECT p.firstName, p.lastName, a.city, a.state
FROM person p
LEFT JOIN Address a ON p.personId = a.personId;
