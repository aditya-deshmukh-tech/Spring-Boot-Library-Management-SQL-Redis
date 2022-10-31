# Library-Management-SQL-Redis
This is production ready library-management app developed for future reference for production projects
This application uses SQL databases and Redis cache to insert, update, delete books

## Technologies and libraries used
1. Spring security
2. JWT
3. Spring Data JPA
4. MySql connector (for this project)
5. Spring Data redis
6. Jedis Client
7. Spring Data Cache

## Data Structures Used
3. ArrayList

## How to install
To clone repository use following command
```shell
https://github.com/aditya-deshmukh-tech/Spring-Boot-Library-Management-SQL.git
```

once cloned create jar of project
```shell
mvn clean install -DskipTests
```
## Environment variables
This project requires 4 environment variables export them using following commands
1. jwt_secret = for hashing of jwt
2. jwt_validity = for validity of jwt token
3. jwt_refreshTokenValidity = validity of refresh token
4. jwt_expiredTokenValidity = validity of expired token
5. sql_url = setting sql url
6. sql_username = setting sql username
7. sql_password = setting sql password
8. driver_class = for setting sql driver class
9. database_dialect = for setting database dialect

validities should be mentioned in milliseconds as default
```shell
export jwt_secret=random jwt_validity=60000 jwt_refreshTokenValidity=60000 jwt_expiredTokenValidity=120000 sql_url=jdbc:h2:mem:library sql_username=sa sql_password=pass123 driver_class=org.h2.Driver database_dialect=org.hibernate.dialect.H2Dialect
```
## Run the project
Once environment variables set run jar using following command
```shell
java -jar target/LibraryManagement-0.0.1-SNAPSHOT.jar
```
## Security APIs
For security apis you can use `security-api-curls` file where all curls command are present for each security api