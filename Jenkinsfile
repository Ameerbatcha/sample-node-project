def gv 

pipeline {
    
agent none
    stages {
           stage('init') {
            steps {
               
                    script {
                       gv = load('script.groovy')
                    }
               
            }
        }
        stage('Build') {
            steps {
               
                    script {
                        gv.buildApp()
                    }
              
            }
        }
        
        stage('Test') {
            steps {
              
                    script {
                        gv.testApp()
                    }
               
            }
        }
        
        stage('Deploy') {
            steps {
               
                    script {
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
