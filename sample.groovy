node()
{
    stage("Stage:1 Download")

    {
        git branch: 'main', url: 'https://github.com/arunraju359/terraform-vpc.git'
    }
    stage("Stage:2 Listing")
    {
        sh "ls -l"
    }
}