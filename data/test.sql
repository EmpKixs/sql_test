SELECT nick_name, COUNT(*) FROM `user1` GROUP BY nick_name ORDER BY CHAR_LENGTH(nick_name) ASC;

SELECT nick_name, COUNT(*) AS num FROM `user1` GROUP BY nick_name ORDER BY num DESC;

SELECT SUM(t.num) AS nick_name_num FROM (SELECT nick_name, COUNT(*) AS num FROM `user1` GROUP BY nick_name) t WHERE t.num > 1;

SELECT phone, COUNT(*) AS num FROM `user1` GROUP BY phone ORDER BY num DESC;

SELECT SUM(t.num) AS phone_num FROM (SELECT phone, COUNT(*) AS num FROM `user1` GROUP BY phone) t WHERE t.num > 1;

SELECT
*
FROM (
(SELECT SUM(nt.num) AS first_num FROM (SELECT nick_name, COUNT(*) AS num FROM `user1` GROUP BY nick_name) nt WHERE nt.num > 1)
UNION
(SELECT SUM(pt.num) AS first_num FROM (SELECT phone, COUNT(*) AS num FROM `user1` GROUP BY phone) pt WHERE pt.num > 1)
) tt;

DELETE FROM `user1` WHERE nick_name IN (SELECT t.nick_name AS nick_name_num FROM (SELECT nick_name, COUNT(*) AS num FROM `user1` GROUP BY nick_name) t WHERE t.num > 1);
DELETE FROM `user1` WHERE phone IN (SELECT t.phone FROM (SELECT phone, COUNT(*) AS num FROM `user1` GROUP BY phone) t WHERE t.num > 1);

SELECT COUNT(*) FROM `user1`;