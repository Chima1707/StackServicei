# StackService

A simple service that implements a stack for each user of the service

## Install

To install the project please do the following:

1. Make sure you have installed [Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
2. Make sure you have installed [Maven](http://maven.apache.org/)
3. Clone the service git `git clone https://github.com/Chima1707/StackService`
4. Cd into StackService `cd StackService`
5. Run `mvn package && java -jar target/stack-service-0.1.0.jar` to start the service
6. Open `http://localhost:8080/` on your browser to view the client app

## Testing
run `mvn test` to run the server app test

## Run on Docker

1. Make sure you have docker installed and configured properly [Docker](https://docs.docker.com/engine/installation/)
2. Run `docker pull xhimat/stack-service`
3. Run  `docker run -p 8080:8080 -t xhimat/stack-service`