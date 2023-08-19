def gv

pipeline {
    agent any
   

    stages {
        stage("init") {
            steps {
                script {
               gv = load('script.groovy')
               }
            }
        }
          
        stage("Build") {
            steps {
              script {
                gv.testApp()
              }
            
            }
        }
        
        stage("Test") {
            steps {
                script {
             gv.testApp()
             }
        } 
            }
        
        
        stage("Deploy") {
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
