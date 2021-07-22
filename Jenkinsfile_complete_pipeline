def gv

pipeline{
    agent any
    tools {
        maven 'Maven'
    }
    stages{
        stage("Build Jar"){
            steps{
                script {
                    echo "========executing Maven Build========"
                    sh "mvn package"
                }
            }
            post{
                always{
                    echo "========always========"
                }
                success{
                    echo "========Build executed successfully========"
                }
                failure{
                    echo "========Build execution failed========"
                }
            }
        }
        stage("Bulid Docker Image"){
                steps{
                    script {
                    echo "========Building the Docker image========"
                        withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
                        sh 'docker build -t glarez/java-maven-app:1.0 .'
                        echo "echo $PASS | docker login -u $USER --password-stdin"
                        sh 'docker push glarez/java-maven-app:1.0'
                    }
                    }
                }
                post{
                    always{
                        echo "========always========"
                    }
                    success{
                        echo "========Build executed successfully========"
                    }
                    failure{
                        echo "========Build successfully failed========"
                    }
                }
            }
        stage("Deploy"){
                steps{
                    echo "========executing Deploy========"
                }
                post{
                    always{
                        echo "========always========"
                    }
                    success{
                        echo "========A executed successfully========"
                    }
                    failure{
                        echo "========A execution failed========"
                    }
                }
            }
    }
    post{
        always{
            echo "========always========"
        }
        success{
            echo "========pipeline executed successfully ========"
        }
        failure{
            echo "========pipeline execution failed========"
        }
    }
}