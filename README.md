# Spring GraphQL Exercise

This repository contains a Spring Boot application that implements a GraphQL API to manage vessels and companies data.

## Getting Started

### Prerequisites

- Completing the course "GraphQL - From zero to hero (day 1)" ([Link](https://docs.google.com/presentation/d/1J8llgpHgjqWmB3rK7Mh7p6x391ijsjnWg5bFUN_syXk/edit#slide=id.p1))
- Java 17
- Maven
- IntelliJ IDEA (recommended)

### Setting Up the Project

1. Clone the repository
   ```bash
   git clone https://github.com/adijesori/graphql-java-workshop.git
   cd graphql-java-workshop
   ```

2. Build the project
   ```bash
   mvn clean install
   ```

3. Run the tests to ensure everything is working
   ```bash
   mvn test
   ```

4. Start the application
   ```bash
   mvn spring-boot:run
   ```

**Using IntelliJ:**
- You can also run Maven commands directly from IntelliJ's Maven tool window
- To run the application, right-click on the project and select "Run" or find the main application class and run it directly

## Validating Setup with the Hello World Example

Enable GraphiQL playground using what we learned in the course. Then, to verify that your setup is working correctly, access the GraphiQL playground at:
```
http://localhost:8080/graphiql
```

Run the following query:
```graphql
query {
  hello(name: "world")
}
```

**If everything goes well, you are ready to build your first ever Spring GraphQL Service! 🎉**

## Project Requirements

In this exercise, you'll build a GraphQL service that manages data about vessels and companies, including the relationships between them:
- Each vessel can have only one company that owns it
- A company can own multiple vessels

### Data Models

**Vessel Properties:**
- id
- name
- length
- class (one of: "Tanker", "Cargo", "Pleasure", or "Unknown")
- ownerId

**Company Properties:**
- id
- name
- address

## Exercise Steps

### Basic Queries

Your service should support the following basic queries:
1. Fetch all the vessels in the repository
2. Fetch all the companies in the repository
3. Fetch vessel info by id
4. Fetch company info by id

### Implementing the basic API

Let's start with the implementation using what we've learned in the course:
- First, define your GraphQL SDL. Make sure to choose proper types, and consider what should be required or not.
- Don't forget to add SDL documentation for your endpoints and types.
- Implement your SDL schema using the Spring GraphQL annotations.

### Testing Your Endpoints

1. Run your queries in the GraphiQL playground
2. Verify your documentation is displayed correctly in the GraphiQL playground
3. Test query number 4 (company by id) using GraphQlTester:
   - Add test for a valid query
   - Add test for passing wrong input which returns an error

### Modifying Data

We would like to add new company to the repository and attach it to a vessel. 
- Create one or more endpoints to support this requirement.
- Test your flow of adding and fetching the newly added data using GraphQlTester

### Entity Connections

Now let's add some connections between the entities:

1. On the vessel type add special key for getting the vessel Owner to support the following query:
   ```graphql
   query {
     vessels {
        owner {
           name
        }
     }
   }
   ```

2. On the companies type, add special key for getting the vessels owned by the company to support the following query:
   ```graphql
   query {
     companies {
        vessels {
           name
        }
     }
   }
   ```

3. **Consider the N+1 Problem**
    - When running the above queries, think about the N+1 problem
    - If you've addressed it already, great job!
    - If not, fix the issue using the appropriate techniques we learned in the course

### Bonus Challenge

Create a script (in any language you want) that:
- Triggers your API
- Simulate both valid responses and error responses and see how your code behaves

## Certification

Once you've completed all the steps above, you can consider yourself a GraphQL master certified! 🎓

## Checklist

For your convenience here is a short checklist for the exercise important steps:

- [ ] Validating Setup with the Hello World Example
- [ ] Implementing the basic API
- [ ] Testing Your Endpoints
- [ ] Modifying Data
- [ ] Entity Connections addressing the N+1 problem
- [ ] Bonus Challenge


### Good luck and enjoy exercise!