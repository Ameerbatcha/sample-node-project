def gv = load('script.groovy')

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    node {
                        gv.buildApp()
                    }
                }
            }
        }
        
        stage('Test') {
            steps {
                script {
                    node {
                        gv.testApp()
                    }
                }
            }
        }
        
        stage('Deploy') {
            steps {
                script {
                    node {
                        gv.deployApp()
                    }
                }
            }
        }
    }
    
    post {
        success {
            echo "Application configured and pipeline ran successfully"
        }
    }
}
