def gv

pipeline{
    agent any
    tools {
        maven 'Maven'
    }
    stages{
        stage("Init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage("Build Jar"){
            steps {
                script {
                   gv.buildJar()
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
                steps {
                    script {
                        gv.buildImage()
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
                steps {
                    script {
                        gv.deployApp()
                    }
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