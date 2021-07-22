pipeline{
    agent any
    stages{
        stage("Test & Build Jar"){
            steps{
                echo "========executing A========"
            }
        }
        stage("Build Docker Image"){
            steps{
                echo "========executing B======="
            }
        }
         stage("Deploy App"){
            steps{
                echo "========executing C========"
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