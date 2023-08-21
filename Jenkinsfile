def gv 

pipeline {
    agent any

parameters{
choice(name:'VERSION',choices:['1.1.0','1.1.2','1.1.3'],description:'')
booleanParam(name:'executeTest',defaultValue:'true',description:'')

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
            when {
                expression {
                   BRANCH_NAME == 'dev' && params.executeTest == true
                }
            }
            steps {
                script {
                    node {
                        gv.buildApp()
                    }
                }
            }
        }
        
        stage('Test') {
            steps {
                script {
                    node {
                        gv.testApp()
                    }
                }
            }
        }
        
        stage('Deploy') {
            steps {
                script {
                    node {
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
