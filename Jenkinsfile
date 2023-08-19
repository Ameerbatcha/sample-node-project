def gv = load('script.groovy')

pipeline {
    agent none

    stages {
        stage('Build') {
            steps {
                node('your-agent-label') {
                    script {
                        gv.buildApp()
                    }
                }
            }
        }
        
        stage('Test') {
            steps {
                node('your-agent-label') {
                    script {
                        gv.testApp()
                    }
                }
            }
        }
        
        stage('Deploy') {
            steps {
                node('your-agent-label') {
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
