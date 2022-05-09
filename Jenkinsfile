pipeline {
    agent any
    tools {
        maven 'M2_HOME'
        jdk 'JAVA_HOME'
    }
    stages {
        stage ('Initialize') {
            steps {
                echo 'Initialize..'
            }
        }
        stage ('Test') {
            steps {
                bat 'mvn test'
            }
            
            post {
                always {
                  junit(
                    allowEmptyResults: true,
                    testResults: '**/test-reports/*.xml'
                  )
                }
            }            
        }
        stage ('Build') {
            steps {
                bat 'mvn -Dmaven.test.failure.ignore=true install' 
            }

        }
    }
}
