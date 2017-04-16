pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "Running springboot install"
                sh "mvn clean install"
            }
        }
        stage('deploy') {
            steps {
                ansiblePlaybook(playbook: 'ansible/main.yml')
            }
        }
    }
}
