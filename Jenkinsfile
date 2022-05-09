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

        stage ('Build') {
            steps {
                bat 'mvn -Dmaven.test.failure.ignore=true install' 
            }
            post {
                always {
                  junit(allowEmptyResults: false,
                    keepLongStdio: true,
                    testResults: "**/test-results/functional-tests.xml")
                }
            }
        }
    }
}
