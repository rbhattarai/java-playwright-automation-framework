# java-playwright-automation-framework


## Project Structure
java-playwright-cucumber/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/example/
│   │           └── PlaywrightDriverManager.java
│   ├── test/
│   │   ├── java/
│   │   │   └── com/example/steps/
│   │   │       └── LoginSteps.java
│   │   │   └── com/example/
│   │   │       └── RunCucumberTest.java
│   │   └── resources/
│   │       └── features/
│   │           └── login.feature
├── pom.xml
└── run_tests.sh


## How to run

chmod +x run_tests.sh

### Run tests for TEST1 env, SmokeTest tag, admin role
./run_tests.sh TEST1 @SmokeTest admin

### Or for QA1 env, Regression tag, user role
./run_tests.sh QA1 @Regression user


