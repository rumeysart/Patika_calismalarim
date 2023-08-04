/*film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?*/
SELECT COUNT(*) FROM film
WHERE LENGTH > 
(
SELECT AVG(LENGTH) FROM film
);


/*film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?*/
SELECT COUNT(*) FROM film
WHERE rental_rate =
(
SELECT MAX(rental_rate) FROM film
);


/*film tablosunda en düşük rental_rate ve en düşün replacement_cost değerlerine sahip filmleri sıralayınız.*/
SELECT * FROM film
WHERE rental_rate = ANY
(
SELECT MIN(rental_rate) FROM film
)
and
replacement_cost =
(
SELECT MIN(replacement_cost) FROM film
);


/*payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.*/
SELECT customer_id, COUNT(*) AS most_payments FROM payment
GROUP BY customer_id
ORDER BY most_payments DESC
