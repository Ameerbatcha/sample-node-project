node {
    def gv = load('script.groovy')

    pipeline {
        agent any

        stages {
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
}
