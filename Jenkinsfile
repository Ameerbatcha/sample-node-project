def gv 

pipeline {
    agent none

    stages {
           stage('init') {
            steps {
                node {
                    script {
                       gv = load('script.groovy')
                    }
                }
            }
        }
        stage('Build') {
            steps {
                node {
                    script {
                        gv.buildApp()
                    }
                }
            }
        }
        
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
