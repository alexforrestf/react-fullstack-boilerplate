pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "Running springboot "
                chmod +x "./mvn"
                sh "./mvnw install"
            }
        }
    }
}
