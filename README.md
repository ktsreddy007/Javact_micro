This is Project is a basic Java based microservice architecture project where we are trying to implement the CICD flow via Github actions.
Below is the architecture  --- >
                               Web Browser
                                   ↓
                       http://localhost:8081/welcome/1
                                   ↓
              [Aggregator Service on port 8081]
                             ↓
        ┌────────────────────┴────────────────────┐
        ↓                                                      ↓
[user-service:8080]                                   [greeting-service:8080]
http://user-service:8080/user/1                 http://greeting-service:8080/greet?name=Teja

Microservices :
  1) Aggregator Service ---- > Exposed to Public and acts as UI where users can see the content
  2) user-service   ---------> It s a backend service wont be visible to public & will be interacting with Aggregator Service
  3) greeting-service  --------> It s a backend service wont be visible to public & will be interacting with Aggregator Service
