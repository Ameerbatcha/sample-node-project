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
              script{
                gv.build()
              }
            
            }
        }
        
        stage('Test') {
            steps {
                script {
             gv.test()
             }
        } 
            }
        
        
        stage('Deploy') {
            steps {
         script {
            gv.deploy()
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
