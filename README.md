<h1># FarmEngine</h1>
This application is written in dropwizard framework<br>
To know more about the framework refer: http://www.dropwizard.io/<br><br>

<h2>Prerequisite</h2>

<b>Jdk</b> <br>
<b>Mysql</b><i>&nbsp;&nbsp;Set the username and password in FarmEngine.yml file<br>
&nbsp;&nbsp;&nbsp;&nbsp;In mysql database, create database 'cropdb' and table 'farmlocation' with the below command <br>
 create database cropdb;<br>
 create table farmlocation (farmId varchar(50) not null primary key, farmName varchar(50), customerId varchar(50) not null, latitude varchar(20), longitude varchar(20), radius varchar(10));
</i>
<b>Maven</b> https://maven.apache.org/download.cgi<br><br>

<h2>Building the application</h2>
Once the prerequisite is installed, go to the root folder of the project and run <br><b>'mvn package'</b><br>
Once the package is build, run <br><b>java -jar target/farm.core-1.0-SNAPSHOT.jar server FarmEngine.yml </b>
<br><br>

<h2>Apis</h2><br>
To store farm location in db:<br>
Post:<b> /farm/add </b><br>
request body:<br>
<i>
{
  "customerId": "Customer1",
  "farmId": "9b0e0956-c9bf-417d-9ea1-7dddd5d20b91bc",
  "farmName": "My First Farm",
  "latitude": "17.4621407",
  "longitude": "78.34546019999999",
  "radius": "1000"
}
</i>


 
 
