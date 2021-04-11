pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('Build') {
            steps {
                   sh 'mvn clean test-compile'
                  }
            }
        stage('UnitTest') {
            steps {
                sh 'mvn surefire:test -Dgroups="unit"'
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
        stage('AcceptenceTest') {
            steps {
                  echo 'acceptenceTest'
                  }
        }
    }
}