pipeline{
    agent {
        label 'JAVANODE'
    }
    stages{
        stage("Download the code repo")

        {
            steps{
            git branch: 'main', url: 'https://github.com/arunraju359/studentapp-ui.git'
            }
        }
        stage("Listing")
        {
            steps{
                sh "ls -ltr"
            }
        }
        stage("Want to display the ip")
        {
            steps{
                sh 'uptime'
                sh 'pwd'
                sh 'ls -ltr'
            }
        }

    }
}