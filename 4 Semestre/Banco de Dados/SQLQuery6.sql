SELECT COUNT(*) FROM IDGameServer

SELECT SUM(Points) FROM Players

SELECT AVG(Points) FROM Players

SELECT MAX(Points), MIN(Points) FROM Players

SELECT SUM(Age) FROM Players WHERE Points >= 100

SELECT COUNT(*) FROM IDGameServer GROUP BY Tipo

SELECT AVG(Points) FROM Players GROUP  BY Age

SELECT COUNT(*) FROM IDGameSerer GROUP BY Tipo HAVING IDGameServer between 1 and 3

SELECT AVG(Points) FROM Players GROUP BY Age HAVING AVG(Points) >= 100

SELECT COUNT(*) FROM Players GROUP BY Age HAVING Players >= 100