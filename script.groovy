def buildJar() {
        echo "========executing Maven Build========"
        sh "mvn package"
}

def buildImage() {
          echo "========Building the Docker image========"
            withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
            sh 'docker build -t glarez/java-maven-app:1.0 .'
            echo "echo $PASS | docker login -u $USER --password-stdin"
            sh 'docker push glarez/java-maven-app:1.0'
            }
}

def deployApp() {
        echo "========Deploying Java App========"
}

return this