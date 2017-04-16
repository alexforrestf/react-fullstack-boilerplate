pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "Running springboot install"
                sh "chmod +x ./mvnw"
                sh "./mvnw clean install"
            }
        }
        stage('deploy') {
            steps {
                ansiblePlaybook(playbook: 'ansible/main.yml')
            }
        }
    }
}
