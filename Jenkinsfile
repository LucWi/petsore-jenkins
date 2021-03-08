pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('Build') {
            steps {
                   sh 'mvn compile'
                  }
            }
        stage('Test') {
            steps {
                   sh 'mvn surefire: test'
                  }
            post {
                 always {
                        mail to: 'ordina.jenkins@gmail.com', subject: 'The Pipeline ran :)', body: 'I ran :)'
                        }
                }
        }
    }
}