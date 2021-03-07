pipeline {
    agent any
    stages {
        stage('Build') {
            withMaven {
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