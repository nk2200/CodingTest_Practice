-- 코드를 입력하세요
select a.user_id, a.nickname, b.sum_price as total_sales
from used_goods_user a
right join (SELECT writer_id, sum(price) as sum_price
from USED_GOODS_BOARD
where status = 'DONE'
group by writer_id
having SUM(price) >= 700000) b
on a.user_id = b.writer_id
order by total_sales;