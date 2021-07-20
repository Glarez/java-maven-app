def buildApp() {
    echo "Building the app ${params.VERSION}"

}

def testApp() {
    echo "Testing the app"
    when {
                expression{
                    params.executeTest == true // this will execute test if in the section parameters/boolean above the default is true
                }

}

def deployApp() {
    echo "Deploying the app ${params.VERSION}"

}
return this