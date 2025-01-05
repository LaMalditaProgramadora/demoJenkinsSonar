pipeline {
    agent any
    tools {
        jdk 'JDK 21'
        maven 'Maven 3.9.6'
    }
    environment {
        JAVA_HOME = "${tool 'JDK 21'}"
    }
    stages {
        stage('Verify Environment') {
            steps {
                sh 'echo $JAVA_HOME'
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