#!/usr/bin/env groovy

// @library('jenkins-shared-library') // this wont work unless you have defined a global jenkins-shared-library on jenkins's ui for making it available for this project do it as

library identifier: 'jenkins-shared-library@main', retriever: modernSCM(
        [$class: 'GitSCMSource',
        remote: 'https://github.com/Glarez/jenkins-shared-library.git',
        credentialId: 'GitHub']
)

def gv

pipeline {
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage("init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage("build jar") {
            steps {
                script {
                    buildJar()
                }
            }
        }
        stage("build and push image") {
            steps {
                script {
                    buildImage 'glarez/java-maven-app:1.2'
                    dockerLogin ()
                    dockerPush 'glarez/java-maven-app:1.2'

                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
}
