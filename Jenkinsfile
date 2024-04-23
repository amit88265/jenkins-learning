pipeline {
    agent any
    tools{
        gradle 'gradle_8_7'
    }
    stages{
        stage('Build'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: 'main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/amit88265/jenkins-learning']]])
                sh 'gradle clean build'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    sh 'docker build -t jenkins-learning .'
                    sh 'docker run -p 7878:7878 -d jenkins-learning'
                }
            }
        }
    }
}