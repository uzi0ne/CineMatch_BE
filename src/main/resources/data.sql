INSERT INTO movies (movie_id, title, genres)
SELECT * FROM CSVREAD('classpath:data/movies.csv');
/*
 1. http://localhost:8080/h2-console/ 접속
 2. jdbc:h2:mem:swtestdb; 입력
 3. connect
 */