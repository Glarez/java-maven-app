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
                    echo "========always Build========"
                }
                success{
                    echo "========Build executed successfully========"
                }
                failure{
                    echo "========Build execution failed========"
                }
            }
        }
        stage("Test"){
                steps{
                    script {
                        gv.testApp()
                    }
                }
                post{
                    always{
                        echo "========always Test========"
                    }
                    success{
                        echo "========Test executed successfully========"
                    }
                    failure{
                        echo "========Test execution failed========"
                    }
                }
            }
            stage("Deploy"){
            steps{
                script {
                    gv.deployApp()
                }
            }
            post{
                always{
                    echo "========always Deploy========"
                }
                success{
                    echo "========Deploy executed successfully========"
                }
                failure{
                    echo "========Deploy execution failed========"
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