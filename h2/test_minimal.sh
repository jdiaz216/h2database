#!/bin/bash
# Build without tests
./mvnw -DskipTests package
# Run the tests using H2's own test framework
echo "=== Running TestIssue701 ===" 
java -cp "target/classes:target/test-classes" org.h2.test.db.TestIssue701
