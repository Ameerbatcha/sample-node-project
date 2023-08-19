import groovy.transform.NonCPS

@NonCPS
def testApp() {
  echo "TEST done successfully"
}

@NonCPS
def buildApp() {
  echo "Build generated successfully FOR VERSION "
}

@NonCPS
def deployApp() {
  echo "Application Deployed successfully"
}


