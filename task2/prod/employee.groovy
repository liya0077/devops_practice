pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building employee app in PROD'
            }
        }
    }
}
