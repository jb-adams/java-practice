# java-practice

Practice new programming concepts in Java

## How this module works

There is currently no main method for this library, all code is executed via
TestNG.

### Run all tests:
```
./gradlew test
```

### Run all tests from a specific class (template and example):
```
./gradlew test --tests "${FULLY_QUALIFIED_TEST_CLASS}"
./gradlew test --tests "org.jbadams.practice.basics.HelloWorldTest"
```

#### Run a single method from a test class (template and example):
```
./gradlew test --tests "${FULLY_QUALIFIED_TEST_CLASS_METHOD}"
./gradlew test --tests "org.jbadams.practice.basics.HelloWorldTest.verifyGreeting"
```