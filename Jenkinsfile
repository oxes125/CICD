pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh './gradlew check'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }       
    }
    post {
        always {
            junit 'build/reports/**/*.xml'
        }
    }     
}
