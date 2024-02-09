"# RestAPISimpleProject" 

### Spring REST API Basic Application ###

It's simple Project , that explains how REST full application can be created by leaveraging JPA , MYSQL dependencies. Helps you in getting hands on all API methods

### Steps to run the Project
1. Download the project from GITHub
2. Import the Project as Spring using STS
3. Do Maven Force Update (Right click on Project > Maven > Update Project > Check the Force Update > click on Update
4. Do a Maven Build (clean & Install) (Right click on Project > Run  As > Maven Clean & Maven Install 
5. Wait Until project downloads all required files
6. Make sure you have SQL installed and Schema (springrestapi) is created at Root (check application.properties for configuration)
6. Once build is successfull , Run project as spring boot application

### API Documention is done using Swagger
Once your Project is running successfully , run below URL in Chrome for API Documention
Swagger are build using SwaggerDoc.org dependency , Not Mandatory as far project concerned
http://localhost:8080/api/sprint-tutorial/swagger-ui/index.html#/student-accounts-api-controller-impl/getDepartmentDetails

### Pre - Requesites (Since its Jave based application , Assuming Java is installed)

1 Must be aware of MAVEN Projects , Maven Repositories , How it works
2 Must Have MYSQL installed in your PC / Laptop
3 Must have basic understanding of Spring and its functionalities
4 Spring Tool Suite (STS) should be installed
5 Must have PostMan Installed , to test the API's
5 Once Project is Downloaded , Kindly Import project to STS using Import Option present in File(STS)
6 Make use of Curl command to pull the API specification




### Things Covered in this Project 
1 Understanding the Structure of Project, and Roles and responsibilities of each Layers (Controller , Service , Repository)
2 Understand each Dependencies and there use in the Project (MYSQL , JPA ,Lombok etc) , all Dependencies are present in Pom.xml file
3 Pom.xml file is where all dependencies are mentioned , soo that it can be used for project
4 Any required dependencies can be taken from Maven Repository.com , add that in pom.xml to leverage the use of it
5 Understand Annotations in Spring project and There usage
6 Exception Handlings at Global level , How to create custom business Exception (such as Form validations), Contraint Validaion exceptions etc
7 How to create Entites , and also how to create auto generated Id's based on @GeneratedValue annotation
8 Mappers , How can we map DTO to Entites or Vise versa by just using @Mapper annotation
9 How to Connect to data Base (MYSQL in this Case) (can connect to different DB , based on your configuration)
10 Application.properties is where we define all DB properties or application related properties (such DB configuration , using custom post , JPA configuration etc)

Thanks 
for Any Clarification Kindly feel Free to Mail @ pruthvi28994@gmail.com
Happy Coding
