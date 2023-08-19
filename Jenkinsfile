def gv = load('script.groovy')

pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                node('Built-In Node') {
                    script {
                        gv.buildApp()
                    }
                }
            }
        }
        
        stage('Test') {
            steps {
                node('Built-In Node') {
                    script {
                        gv.testApp()
                    }
                }
            }
        }
        
        stage('Deploy') {
            steps {
                node('Built-In Node') {
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
