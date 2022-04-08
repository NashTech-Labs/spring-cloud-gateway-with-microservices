# spring-cloud-gateway-with-microservices
This template helps us to spring cloud gateway and its working. The template included the gateway repository and microservices repository. And this gateway routes the requests to specific microservice. 

# first microservice
This is a microservice which is responsible for accepting the request and returns the string in response. It hosts on http://localhost:8081.

# second microservice
This is a microservice which is responsible for accepting the request and returns the string in response. It hosts on http://localhost:8082.

# gateway microservice
This is a microservice which behaves as the gateway to the first microservice and second microservice. It is responsible to route the requests 
 to these microservice and respond with the valid output to the end-user and hosts on http://localhost:8080.

# Endpoints(requests passing through the gateway)
http://localhost:8080/first/microservice/message

http://localhost:8080/second/microservice/message

