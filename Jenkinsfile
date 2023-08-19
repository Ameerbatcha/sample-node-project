def gv = load('script.groovy')

pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                node('testing') {
                    script('testing') {
                        gv.testApp()
                    }
                }
            }
        }
        
        stage('Deploy') {
            steps {
                node('deploying') {
                    script {
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
