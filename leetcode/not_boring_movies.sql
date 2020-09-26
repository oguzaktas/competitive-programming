/* Write your T-SQL query statement below */
SELECT * FROM cinema WHERE id % 2 = 1 AND description <> 'boring' ORDER BY rating DESC

/* https://leetcode.com/problems/not-boring-movies/ */