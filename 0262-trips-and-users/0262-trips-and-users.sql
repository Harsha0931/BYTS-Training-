# Write your MySQL query statement below
with unbanned_trips as (
  select * from Trips t
  where not exists (
      select 1 from Users u 
      where (u.Users_id = t.Client_Id or u.Users_id = t.Driver_Id) and u.Banned = 'Yes'
  )
)
select Request_at as Day,
    round(sum(if(Status = 'cancelled_by_driver' or Status = 'cancelled_by_client', 1, 0)) / count(*), 2) 
        as "Cancellation Rate"
from unbanned_trips
where Request_at >= '2013-10-01' and Request_at <= '2013-10-03'
group by Request_at