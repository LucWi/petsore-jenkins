pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('Build') {
            steps {
                   sh 'mvn clean compile'
                  }
            }
        stage('Test') {
            steps {
                sh 'ls -a'
                sh 'cat src/test/java/ip/swagger/petstore/PetStoreTest.java'
                sh 'mvn test'
                }
            post {
                 always {
                        junit 'target/surefire-reports/*.xml'
                        emailext to: 'ordina.jenkins@gmail.com',
                        subject: 'The Pipeline ran :)',
                        body: '${FILE,path="target/surefire-reports/ip.swagger.petstore.PetStoreTest.txt"}'
                        }
                }
        }
    }
}