pipeline {
    agent any
    environment {
        JDK_HOME = tool name: 'JDK 21', type: 'JDK'
    }
    tools {
        maven 'Maven 3.8.5'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}