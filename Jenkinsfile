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
<<<<<<< HEAD
        stage("test"){
                when {
                    expression{
                        params.executeTest == true // this will execute test if in the section parameters/boolean above the default is true
                    }
                steps{
                    script {
                        gv.testApp()
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
    stage("deploy"){
=======
        stage("Build"){
>>>>>>> parent of 991f309 (Added logic trough groovy script and renamed Jenkins decalrative way file to spam a new one II)
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
}