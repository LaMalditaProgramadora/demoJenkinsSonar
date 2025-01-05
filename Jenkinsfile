pipeline {
    agent any
    tools {
        jdk 'JDK 17'
        maven 'Maven 3.9.6'
    }
    stages {
        stage('Verify Environment') {
            steps {
                sh 'echo $JAVA_HOME'
                sh 'echo $PATH'
                sh 'java -version'
            }
        }
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