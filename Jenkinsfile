#!/usr/bin/env groovy

pipeline{
    agent any
    stages{
        stage("Test & Build Jar"){
            steps{
                script {
                    echo "========executing A========"
                    echo "Testing for $BRANCH_NAME branch"
                }
                
            }
        }
        stage("Build Docker Image"){
            when {
                    expression {
                        BRANCH_NAME == 'main'
                    }
            }
            steps{
                script {
                    echo "========executing A========"
                    echo "Testing for $BRANCH_NAME branch"
                }
            }
        }
         stage("Deploy App"){
            steps{
                echo "========executing C========"
                def dockerCmd = 'docker run -d -p 3080:3080 glarez/java-maven-app:1.0 '
                sshagent(['aws-ec2']) {
                sh "ssh -o StrictHostKeyChecking=no ec2-user@52.67.250.214 ${dockerCmd}"
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