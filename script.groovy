def testApp() {
  echo "TEST completed successfully "
  echo "Calling credentials ${PROVIDED_CREDENTIALS} "
}

def buildApp() {
  echo "Build generated successfully FOR VERSION ${params.VERSION}"
}

def deployApp() {
  echo " ${params.VERSION} Application VERSION is Deployed"
}

return this


