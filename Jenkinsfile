pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Running springboot'
                chmod 777 ./mvnw
                sh "./mvnw clean install"
            }
        }
    }
}
