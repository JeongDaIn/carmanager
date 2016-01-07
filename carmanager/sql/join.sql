-- garage, refuel 조인
select g.c_nick, r.rno, r.grno, r.ref_dt, r.mile, r.cost, r.liter
from garage g join refuel r on g.grno = r.grno
where g.grno = 1;
