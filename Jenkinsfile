pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "Running springboot"
                sh "./mvnw install"
            }
        }
    }
}
