CREATE TABLE IF NOT EXISTS user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255)
)  ENGINE=INNODB;


curl localhost:8080/user/add -d name=First -d email=someemail@someemailp

curl 'localhost:8080/demo/all'