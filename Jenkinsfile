def gv = load('script.groovy')

pipeline {
    agent none

    stages {
        stage('Build') {
            steps {
                node('your-agent-label') {
                    script {
                      def  gv.buildApp()
                    }
                }
            }
        }
        
        stage('Test') {
            steps {
                node('your-agent-label') {
                    script {
                      def  gv.testApp()
                    }
                }
            }
        }
        
        stage('Deploy') {
            steps {
                node('your-agent-label') {
                    script {
                      def  gv.deployApp()
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
