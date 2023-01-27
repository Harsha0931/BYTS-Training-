# Write your MySQL query statement below
SELECT T.Department, T.Employee, T.Salary
FROM (
    SELECT Department.Name AS Department, Employee.Name AS Employee, Employee.Salary AS Salary, 
           DENSE_RANK() OVER (PARTITION BY Department.Name ORDER BY Employee.Salary DESC) AS SalaryRank
    FROM   Department JOIN Employee ON Department.Id = Employee.DepartmentId
) AS T
WHERE T.SalaryRank < 4