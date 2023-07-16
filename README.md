# Game List Project
Backend project developed during Nelio Alves' Dev Immersion.

## 🖥️ Overview
![dslist-model](https://github.com/lcssathler/game-list/assets/115672410/71e09f2d-bf38-4ae8-a7cc-da79735a70bd)

## 🛠️ Technologies
[![My Skills](https://skills.thijs.gg/icons?i=java,mysql,spring,postgres,docker,postman,git)](https://skills.thijs.gg)

## 🪧 About
Develop a Rest API that has five different endpoints: all games, search for games by id, list of game genres, search for games of the same genre and relocation of games within their genre list.
<div>
  <img src="https://github.com/lcssathler/lcssathler/assets/115672410/0bec71ca-cf08-4d8f-a96b-c89c3cbe03bb" alt="Primeira Imagem" width="300" height="413">
  <img src="https://github.com/lcssathler/lcssathler/assets/115672410/044abf06-d99b-461e-8e9e-73bac97cf445" alt="Segunda Imagem" width="300" height="413">
</div>

## 📖 Methodologies
* Spring Rest
* Entities and ORM
* Database seeding
* Layer development pattern: Controller, service, repository, DTO
* N:N Entity relationships
* SQL queries in Spring Data JPA
* Projections
* Docker Compose
* Local homologation

## 👀 Notes
* The seeding in the database was done through a SQL file
* The database has a list of games organized according to their genre
* The H2 database was used for tests
* The Postgres database was used to homologate the project in production
* The remapping of a game to a new index is done through a request made in Postman, defining the parameters inside the endpoint
