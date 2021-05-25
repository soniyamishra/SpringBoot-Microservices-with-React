# SpringBoot-Microservices-with-React
# While implementing Microservices, the following components are the pillar of the architecture:

1. Config servers: To keep the Properties file centralized and shared by all Microservices, we will create a config server which is itself a Microservice, and manages all microservices properties files and  those files are versioned controlled; any change in the properties will automatically publish to all microservices without restarting the services. One thing to remember is that every microservice communicates with the config server to get properties values, so the config server must be a highly available component; if it fails, then all microservices fail because it can't resolute the properties values! So, we should take care of the scenario - the config server should not be an SPF (single point of failure), so we will spin up more than one container for the config server.
2. Eureka Discovery server: The main goal of Microservices is decentralizing the different components based on the business features, so that each component - aka microservice - can be scaled as per need, so for a particular microservice, there are multiple instances and we can add and remove instances as per the need, so the way monoliths do load blancing is not going to work in a microservice paradigm. As it spawns containers on the fly, containers have dymanic IP addresses, so to track all instances of a service, a manager service will be needed, so when the containers are spawned, it registers itself to the manager and the manager keeps the track of the instances; if a service is removed, the manager removes it from the manager's service registry. If other services need to communicate with each other, it contacts a discovery service to get the instance of another service. Again, this is a highly available component; if the discovery service is down, microservices can't communicate with each other, so the discovery service must have multiple instances.
3. Components, aka services: Components are the key ingredients in Microservice architecture. By component, I mean a utility or business feature which can be managed or updated independently. It has a predefined boundary and it exposes an API by which other components can communicate with this service. The idea of microservices is breaking down a complete business functionality into several independent small features which will communicate with each other to produce the total business functionality. If any portion of the functionality changes in the future, we can update or remove that component and add a new component to the architecture. So, Microservice architecture produces a proper modular architecture with proper encapsulation and properly defined boundaries.
4. Gateway Service: A microservice is a collection of independent services which collectively produces a business functionality. Every microservice publishes an API, generally a REST API, so as a client, it is cumbersome to manage so many endpoint URLs to communicate with. Also, think about another perspective: if some application wants to build an authentication framework or security checking, they have to implement across all services, so that would be repeating itself against DRY. If we have a Gateway service, which is internet facing, the client will call only one endpoint and it delegates the call to an actual microservice, and all the authentication or security checking will be done in the gateway service.

# While implementing Docker,
Software Requirements
OS: Ubuntu 20.04.2 LTS
Java: openjdk 
node
npm
Docker: 20.10.3
docker-compose 1.28.2
MySQL is not installed on my Computer, it runs only inside a Docker Container.


