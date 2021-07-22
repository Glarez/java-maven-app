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
               when {
                    expression {
                        BRANCH_NAME == 'main'
                    }
               }
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