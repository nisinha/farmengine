# farmengine
This application is written in dropwizard framework
To know more about the framework refer: http://www.dropwizard.io/

Prerequisite

Jdk
Mysql
  Set the username and password in FarmEngine.yml file
Maven: https://maven.apache.org/download.cgi

Necessary details to run the application
Once the prerequisite is installed, go to the root folder and run <b>'mvn package'</b>
Once the package is build, run <b>java -jar target/farm.core-1.0-SNAPSHOT.jar server FarmEngine.yml </b>

Apis
To store farm location in db:<br>
Post:<b> /farm/add </b><br>
request format:
<div bckground-color="orange>
{
  "customerId": "Customer1",
  "farmId": "9b0e0956-c9bf-417d-9ea1-7dddd5d20b91bc",
  "farmName": "My First Farm",
  "latitude": "17.4621407",
  "longitude": "78.34546019999999",
  "radius": "1000"
}
</div>

in mysql create table farmlocation like
 create table farmlocation (farmId varchar(50) not null primary key, farmName varchar(50), customerId varchar(50) not null, latitude varchar(20), longitude varchar(20), radius varchar(10));
 
 
