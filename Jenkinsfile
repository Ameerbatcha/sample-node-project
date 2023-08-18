def gv

pipeline {
    agent any
   
   environment {
      NEW_VERSION = "1.1.3"
   }

    stages {
        stage('init') {
            steps {
                script {
               gv = load "script.groovy"
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
            echo "application configured and pipeline ran successfully"
        }
    }
}
