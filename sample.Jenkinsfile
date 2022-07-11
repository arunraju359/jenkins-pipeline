pipeline{
    agent any
    stages{
        stage("Downloading the code repo"){
            steps{
                git branch: 'main', url: 'https://github.com/arunraju359/terraform-vpc.git'
                sh "ls -l"
            }
        }
    }
}