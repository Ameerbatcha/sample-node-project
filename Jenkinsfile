def gv = load('script.groovy')

pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                node('Built-In Node') {
                    gv.buildApp()
                }
            }
        }
        
        stage('Test') {
            steps {
                node('Built-In Node') {
                    gv.testApp()
                }
            }
        }
        
        stage('Deploy') {
            steps {
                node('Built-In Node') {
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
