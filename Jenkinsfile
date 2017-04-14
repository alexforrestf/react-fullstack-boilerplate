pipeline {
    agent any

    stages {
        stage('Build 0') {
            steps {
                echo 'Running springboot'
                chmod +x ./mvnw
                sh "./mvnw clean install"
            }
        }
    }
}
