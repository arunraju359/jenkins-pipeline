pipeline{
    agent any
    parameters
    {
        parameters { text(name: 'DEPLOY_TEXT', defaultValue: 'One\nTwo\nThree\n', description: '') }
    }
    stages{
        stage("Downloading the code repo"){
            steps{
                git branch: 'main', url: 'https://github.com/arunraju359/terraform-vpc.git'
                
            }
        }
        stage("Listing")
        {
            steps{
                sh "ls -l"
            }
        }
    }
}