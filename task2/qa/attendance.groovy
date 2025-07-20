pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building attedance app in QA'
            }
        }
    }
}
