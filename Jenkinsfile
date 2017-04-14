pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Running springboot'
                chmod +x mvnw
                sh "mvnw clean install"
            }
        }
    }
}
