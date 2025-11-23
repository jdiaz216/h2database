# Build without tests
./mvnw -DskipTests package
./mvnw -Dtest=org.h2.test.db.TestMinimalJUnit test

