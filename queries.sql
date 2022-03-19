-- Part 1: Test it with SQL
DESCRIBE job;
-- Part 2: Test it with SQL
SELECT employers FROM techjobs
WHERE Location = "St. Louis City";
-- Part 3: Test it with SQL
DROP TABLE jobs;
-- Part 4: Test it with SQL
SELECT skills,
       jobs
FROM techjobs
WHERE jobs IS NOT NULL
ORDER BY skills ASC;
