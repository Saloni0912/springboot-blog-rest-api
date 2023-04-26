# Springboot Blog REST API
This is a simple Springboot Blog REST API with CRUD operations for REST resources Post, Category, Comments and Authentication. This is a refresher project to brush up my skills using Java and Springboot.
In this app, users can access the REST APIs based on their role. Admin can create, update and delete posts. Authenticated users can fetch posts, categories and add comments.  

## Table of Contents

- [Functionalities](#Functionalities)
- [Technologies](#Technologies)
- [Tools](#Tools)
- [Launch](#Launch)
- [Usage](#Usage)
- [Updates](#Updates)
- [Contact](#Contact)

## Functionalities :
1.  Built CRUD REST APIs
2.  Built Search Post REST API
3.  Added Pagination and Sorting for Posts Resource
4. Custom and Global Exception Handling
5. REST API Validation
6. Spring Security
7. Json Web Token Based Authentication
8. Swagger UI OpenAPI Documentation

## Technologies :
1. Java 17
2. Springboot 3
3. Spring Security 6
4. MySQL
5. Spring Data JPA
6. Lombok Library
7. Docker
8. AWS 
9. Maven

## Tools :
1. IntelliJ IDEA
2. MySQL Server 8
3. MySQL Workbench
4. Postman Rest Client
5. Docker Desktop

## Launch : 
Clone the github repository and let maven install all the necessary dependencies. Activate the ```dev``` profile in ```application.properties``` and run the Springboot app. 
Hibernate will create the database schema based on the JPA repositories and initial data population will be done using the ```data.sql``` file in resources folder.
This creates default admin and user with details given in ```data.sql```. Now the REST API is ready to use locally in Postman.  
The app can be run using docker image uploaded to Docker Hub using the command - ```docker pull saloni95/springboot-blog-rest-api```

## Usage :
The REST API documentation is available at [Swagger UI](http://localhost:8080/swagger-ui/index.html#/). For reference the Postman collection is available in the repository.
1. Login with admin credentials and get the JWT Token. 
2. Use Authorisation to add the JWT Token to add category.
3. Add JWT Token to create post. 
4. Add new user using the register api.
5. Search posts based on title and description. 
6. All the CRUD Operations for Post, Category and Comments can be explored.

## Updates : 
Currently, I am working on adding BDD test framework using ```JUnit 5``` and ```Mockito```.

## Contact
Please reach out to me for any query regarding this repo: 

Saloni Dilip Thakare

salonidthakare@gmail.com

[LinkedIn](https://www.linkedin.com/in/saloni-dilip-thakare-762034105/)

