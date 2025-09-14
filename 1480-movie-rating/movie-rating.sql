# Write your MySQL query statement below
(SELECT Users.name AS results FROM users JOIN MovieRating ON
Users.user_id = MovieRating.user_id GROUP BY name
ORDER BY Count(name) DESC, name LIMIT 1)

UNION ALL

(SELECT Movies.title AS results FROM movies JOIN MovieRating ON
Movies.movie_id = MovieRating.movie_id WHERE
created_at>='2020-02-01' AND created_at<'2020-03-01' GROUP BY movies.title
ORDER BY AVG(MovieRating.rating) DESC, Movies.title LIMIT 1)