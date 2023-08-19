def gv = load('script.groovy')

pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                node {
                    script {
                        gv.testApp()
                    }
                }
            }
        }
        
        stage('Deploy') {
            steps {
                node {
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
