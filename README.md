# Redis Integration with Spring Boot (Learning)

### What is Redis and purpose of Redis?
Redis is in-memory, fast, open source data structure store. It's often used with database, cache, message broker, and
streaming engine. Redis excels at providing low latency data access by storing data in RAM, making it ideal for application
needing quick response time. 
<br><br>
    In Summary, build highly performant, scalable, & real-time application, addressing common challenges in modern software
development

- **Caching for Performance:**
  - Reduced Database Load: Redis is an incredibly fast in-memory data store. Integrating it allows you to implement caching layers for frequently accessed data reducing the load on your primary database.
  - Faster Response Time: By serving data from cache, your application can respond much quicker to user requests, leading to a better user experience. Spring Boot's `@Cacheable` annotation make this very easy to implement.
- **Session Management:** 
  - Distributed sessions: In a microservice architecture or a horizontally scaled application managing user sessions in-memory on each server is problematic. Redis can act as a centralized session store, allowing users to seamlessly more between different instances of your application without loosing their session state.
- **Real Time Data & Pub/Sub**
  - Real-time Dashboards/ Feeds
  - Inter-service communication
- Rate Limiting
- Distributed Locks
- Queues and Background Jobs
- Data Structures for specific use cases
- Scalability and Resilience

### In this project following dependency, tools we used.
- Docker for Redis container
- Java 21
- Spring Boot 3.5.4 dependencies:
  - starter-data-redis
  - starter-web
  - lombok
- In application.properties host and port are set 
  ```properties
  spring.data.redis.host=localhost
  spring.data.redis.port=6379
    ```
It's simple hands-on project which helps to get basic idea on spring boot integration with redis 