INSERT INTO myblog.users(email,name,password,username) VALUES('admin@gmail.com','admin','$2a$10$fp5Q8nMcuxGoZqUNWsYaIu8OJ5zXdf62bIIgqgnb.DDHyTP8Di4Ya','admin');
INSERT INTO myblog.users(email,name,password,username) VALUES('saloni@gmail.com','saloni','$2a$10$Hck/3TnXm0QyVQsEoVkASOdRZ1LozNnbZnOkbEWnsG/bYPY9zTQ56','saloni');

INSERT INTO myblog.roles(name) VALUES('ROLE_ADMIN');
INSERT INTO myblog.roles(name) VALUES('ROLE_USER');

INSERT INTO myblog.users_roles VALUES(1,1);
INSERT INTO myblog.users_roles VALUES(2,2);