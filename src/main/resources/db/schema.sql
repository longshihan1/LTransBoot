create table if not exists user (
`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
 name varchar(35),
 PHONE varchar(35)
);
create table if not exists traceTime (
`id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
tag varchar(200),
 methodName varchar(200),
 cost integer ,
 datetime varchar(35)
);