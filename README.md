# Blog server with API exposed
A simple blog server with some API exposed to test the use o kotlin and gradle

## External libraries used:
This libraries need to installed in the proyect, gradle download it.
1) org.springframework.boot:spring-boot-starter-data-jpa
2) org.springframework.boot:spring-boot-starter-mustache
3) org.springframework.boot:spring-boot-starter-web
4) com.fasterxml.jackson.module:jackson-module-kotlin
5) org.jetbrains.kotlin:kotlin-reflect
6) org.jetbrains.kotlin:kotlin-stdlib-jdk8
7) org.springframework.boot:spring-boot-devtools
8) com.h2database:h2

## Run Program
The program will start in the url http://localhost:8080/

## API Exposed
1) GET **/api/user/**: show all users.
2) GET **/api/user/{login}**: check if the user exist.
3) POST **/api/user**: create new user.<br>
**Body:**
```json
{
    "login": "franlis",
    "firstname": "franlis veriozka",
    "lastname": "Araujo Guaricuco",
    "description": "prueba"
}
```
4) GET **/api/article/**: show all articles by user.
5) GET **/api/article/{slug}**: Search an article by index card.
6) POST **/api/article/{login}**: Create article by user.
**Body:**
```json
{
    "title": "Pocholing",
    "headline": "Info Info",
    "content": "InformacionXX"
}
```
## Run App using Docke
docker build -t kotlin . && docker run kotlin
