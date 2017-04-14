pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "Running springboot "
                sh "chmod +x ./mvn"
                sh "./mvnw install"
            }
        }
    }
}
