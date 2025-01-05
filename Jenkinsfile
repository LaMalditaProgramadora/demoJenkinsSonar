pipeline {
    agent any
    environment {
        JAVA_HOME = "${env.JAVA_HOME_21}"
    }
    tools {
        jdk 'JDK 21'
        maven 'Maven 3.9.6'
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