# CRUD API

The REST API performs CRUD operations on Student objects as described below.

## Installation
- Get the project
    - clone
  
        `git clone https://github.com/uncg-csc340/f24-crud-api-jpa.git`
    - download zip.
- Open the project in IntelliJ.
- [`/src/main/resources/application.properties`](https://github.com/uncg-csc340/f24-crud-api-jpa/blob/8f6ea1be819075df59ed06bd5b8975eccb636712/src/main/resources/application.properties) file  is the configuration for the MySQL database on your localhost.
  - the database name is on the `datasource.url` property between the last `/` and the `?`. In this case the database name is `f24-340`.
  - You MUST have the database up and running before running the project! 
    - Open your XAMPP Control Panel.
    - Start the Apache server.
    - Start MySQL.
    - Click on MySQL "Admin" to open up the DBMS.
    - Ensure the database that you need is available.
- Build and run the main class. You should see 2 new tables created in the aforementioned database.

## API Endpoints
Use POSTMAN to try the following endpoints:

## Get list of Animals

### Request

    `GET /animals/all`

    `http://localhost:8080/animals/all`


## Get a specific Animal

### Request

`GET /animal/{animalID}`

`http://localhost:8080/animal/2`

     
## Create a new Animal

### Request

    `POST /animal/new`
    
    `http://localhost:8080/animal/new` --data '{ "name": "sample4", "habitat": "home", "species": "species"}'


## Get Animal by species

### Request

    `GET /animal?species=species`

    `http://localhost:8080/animal?species=species`


## Get matching names of animals

### Request

    `GET /animal/name?gpa=sample4`

    `http://localhost:8080/animals/name?contains=sample`



## Update an existing Student

### Request

    `PUT /animal/update/{studentId}`
    
    `http://localhost:8080/animal/update/1` --data '{ "name": "sampleUpdated", "habitat": "home", "species": "species"}'


## Delete an existing Student

### Request

    `DELETE /animal/delete/{animalID}`
    
    `http://localhost:8080/animal/delete/1`
