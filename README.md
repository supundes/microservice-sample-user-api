<h1>A sample microservice written using Spring Boot</h1>

A guide for getting started with Spring Boot microservices can be found in http://securityinternal.com/2017/01/a-quick-start-guide-for-writing.html

<h2>Instructions for Running the Sample</h2>

1. If you wish to build the project from source, you can use Maven. (eg: mvn clean install)
2. If not you can directly run the application from the jar file available in target directory.
3. Use following command to run the application. (you can change the port number as you wish)

<table aligh="center"><tr><td>java -jar sample-1.0-SNAPSHOT.jar --server.port=8081</td></tr></table>

4. Once the application starts, you can send HTTP requests to the URL http://localhost:8081/api/user for calling the user operation methods exposed.

<table aligh="center">
<tr><td>
<b>List User =></b>
curl -X GET http://localhost:8081/api/user
<b>=> response</b> : { method : "list user called successfully"}
</td></tr>
<tr><td>
<b>Add User =></b>
curl -X POST http://localhost:8081/api/user
<b>=> response</b> : 
{ method : "add user called successfully"}
</td></tr>
<tr><td>
<b>Update User =></b>
curl -X PUT http://localhost:8081/api/user
<b>=> response</b> : { method : "update user called successfully"}
</td></tr>
<tr><td>
<b>Delete User =></b>
curl -X DELETE http://localhost:8081/api/user
<b>=> response</b> : { method : "delete user called successfully"}
</td></tr></table>
