def gv = load('script.groovy')

pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                script {
                    node('label2') {
                    gv.testApp()
                         }
                }
            }
        }
        
        stage('Deploy') {
            steps {
                script {
                    node('label'){
                    gv.deployApp()
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
}
