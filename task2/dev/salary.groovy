pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building salary app in DEV'
            }
        }
    }
}
