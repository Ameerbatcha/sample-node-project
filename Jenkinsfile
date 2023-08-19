def testApp() {
    echo "TEST done successfully"
}

def buildApp() {
    echo "Build generated successfully FOR VERSION "
}

def deployApp() {
    echo "Application Deployed successfully"
}

pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                script {
                    testApp()
                }
            }
        }
        
        stage('Deploy') {
            steps {
                script {
                    deployApp()
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
