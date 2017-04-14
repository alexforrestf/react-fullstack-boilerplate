pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out from source control...'
                git 'https://github.com/alexforrestf/react-fullstack-boilerplate'
            }
        }
        stage('Build') {
            steps {
                echo 'Running springboot'
                sh './mvnw spring-boot:run'
            }
        }
    }
}