pipeline {
    agent any

    stages {
        stage('Clone Repo') {
            steps {
                git branch: 'main', url: 'https://github.com/maver1cks-86/demo-project.git'
            }
        }

        stage('Build Maven Project') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t springboot-demo .'
            }
        }

        stage('Run Docker Container') {
            steps {
                bat 'docker stop springboot-demo || exit 0'
                bat 'docker rm springboot-demo || exit 0'
                bat 'docker run -d --name springboot-demo -p 8080:8080 springboot-demo'
            }
        }
    }
}
