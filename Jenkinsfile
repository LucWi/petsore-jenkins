pipeline {
    agent { none }
    stages {
        stage('Build') {
            steps {
                   sh 'mvn compile'
                  }
            }
        stage('Test') {
            steps {
                   sh 'mvn surefire:test'
                  }
            post {
                 always {
                        mail to: 'ordina.jenkins@gmail.com', subject: 'The Pipeline ran :)', body: 'I ran :)'
                        }
                }
        }
    }
}