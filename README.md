# farmengine
Prereqisite

Install jdk
Install mysql
  Set the username and password in FarmEngine.yml file
program arguments: server FarmEngine.yml
Main class: com.farmengine.FarmEngineApplication

Apis

To store farm location in db:
Post: /farm/add
requst format: 
{
  "customerId": "Customer1",
  "farmId": "9b0e0956-c9bf-417d-9ea1-7dddd5d20b91bc",
  "farmName": "My First Farm",
  "latitude": "17.4621407",
  "longitude": "78.34546019999999",
  "radius": "1000"
}

in mysql create table farmlocation like
 create table farmlocation (farmId varchar(50) not null primary key, farmName varchar(50), customerId varchar(50) not null, latitude varchar(20), longitude varchar(20), radius varchar(10));
 
 
