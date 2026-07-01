# Write your MySQL query statement below
select project_id, avg(experience_years)as average_years from 
Project p inner join Employee e on
p.employee_id=e.employee_id
group by p.project_id;