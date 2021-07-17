pipeline {
    agent any
    stages {
        stage {
                build("build") {
                    steps {
                        echo "Building the app"
                    }
                }
        stage {
                build("test") {
                    steps {
                        echo "Testing the app"
                    }
                }
        stage {
                build("deploy") {
                    steps {
                        echo "Deploying the app"
                    }
                }
    }
}