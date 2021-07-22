pipeline{
    agent any
    stages{
        stage("Test & Build Jar"){
            steps{
<<<<<<< HEAD
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
=======
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
>>>>>>> jenkins-jobs
}