# Patients-Api
 SpringBoot REST api service that incorporates Spring-Security and uses H2 to store the data in memory. 

## Specifications
Created a table called 'patient' using H2 (in-memory database) containing the following columns:
* id (int auto increment)
* firstName (varchar 50)
* lastName (varchar 50)
* dataOfBirth (date)

Table is populated using a data.sql file with 10 unique records at startup.

A ‘patients’ controller utilizing 4 RESTful endpoints:
* Get all patients
* Get patient by ID
* Create patient
* Delete patient

These endpoints are protected with Spring Security. The endpoints use an in-memory authentication mechanism. 
Errors are handled when retrieving or deleting patients and an incorrect ID is used. Both error responses return a standard 404.
