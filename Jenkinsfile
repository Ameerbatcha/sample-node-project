def gv

pipeline {
    agent any
   

    stages {
        stage("init") {
            steps {
                script {
               gv = load('script.groovy')['gv']
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
