pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "Running springboot "
                sh "chmod +x ./mvnw"
                sh "mvn clean install"
            }
        }
    }
}
