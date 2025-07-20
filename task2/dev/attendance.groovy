pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building attendance app in DEV'
            }
        }
    }
}
