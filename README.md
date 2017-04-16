# basic-recommendator-mahout
The code is based from Alura online course. The main objective of this Java application is to show in action a recommendation algorithm using Mahout.

# Unitary & Integration Tests
In this project was added unitary & integration tests with 100% of coverage.

# Jacoco & Sonar
In pom.xml was configured the surefire plugin and failsafe plugin to collect unitary test reports & integration tests reports, with the aim to send this information to sonar 

# Running the tests

First run unit test:

```
mvn clean install
```

Second run integration test

```
mvn verify -Pintegration-tests
```

Third deploy to sonar

```
mvn sonar:sonar
```

