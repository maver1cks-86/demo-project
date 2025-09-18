pipeline {
    agent any

    stages {
        stage('Clone Repo') {
            steps {
                git 'https://github.com/maver1cks-86/demo-project.git'
            }
        }

        stage('Build Maven Project') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t springboot-demo .'
            }
        }

        stage('Run Docker Container') {
            steps {
                sh 'docker stop springboot-demo || true'
                sh 'docker rm springboot-demo || true'
                sh 'docker run -d --name springboot-demo -p 8080:8080 springboot-demo'
            }
        }
    }
}
