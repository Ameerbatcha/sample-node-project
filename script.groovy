def testApp() {
  echo "TEST completed successfully"
}

def buildApp() {
  echo "Build generated successfully FOR VERSION ${params.VERSION}"
}

def deployApp() {
  echo " ${params.VERSION} Application VERSION is Deployed"
}

return this


