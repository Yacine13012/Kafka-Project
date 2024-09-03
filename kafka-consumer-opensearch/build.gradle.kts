plugins {
    id("java")
}

group = "io.conducktor.demos"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.kafka:kafka-clients:3.4.0")
    implementation("org.slf4j:slf4j-api:1.7.36")
    implementation("org.slf4j:slf4j-simple:1.7.36")
    implementation("org.opensearch.client:opensearch-rest-high-level-client:1.2.4")
    implementation("com.google.code.gson:gson:2.9.0")


}

tasks.test {
    useJUnitPlatform()
}