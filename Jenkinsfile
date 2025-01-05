pipeline {
    agent any  // Esto ejecutará el pipeline en cualquier agente disponible, asumiendo que es un agente Windows.
    tools {
        jdk 'JDK 21'
        maven 'Maven 3.9.6'
    }
    stages {
        stage('Build') {
            steps {
                bat 'mvn -B -DskipTests clean package'  // Cambiado 'sh' por 'bat' para ejecutarlo en Windows.
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'  // Cambiado 'sh' por 'bat' para ejecutarlo en Windows.
            }
            post {
                always {
                    junit 'target\\surefire-reports\\*.xml'  // Usa barras invertidas en rutas para Windows.
                }
            }
        }
    }
}