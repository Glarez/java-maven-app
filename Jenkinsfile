def gv

pipeline{
    agent any

    parameters {
        choice(name: 'VERSION', choices: ['1.0', '1.1', '1.2'], description: 'Some description for version')
        booleanParam(name: 'executeTest', defaultValue: true, description: 'Some description for test') // this is for being used as parameters like in Test stage
    }
    stages{
        stage("init"){
            steps{
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage("Build"){
            steps{
                script {
                    gv.buildApp()
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
        stage("Build"){
                steps{
                    script {
                        gv.buildApp()
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