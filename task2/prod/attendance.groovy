pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building attandeace app in PROD'
            }
        }
    }
}
