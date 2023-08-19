def gv = load('/sample-node-project/script.groovy')

pipeline {
    agent any
   

    stages {
       
          
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
