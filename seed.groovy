freeStyleJob('example2234421232311234asdfs') {}
freeStyleJob('example1') {

}
freeStyleJob('Sampledemp'){}
freeStyleJob('example-Config') {
    logRotator(-1, 10)
    jdk('Java 8')
   
    
    
}
pipelineJob('sample-pipeline') {  
  configure { flowdefinition ->
    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps') {
      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {
        'userRemoteConfigs' {
          'hudson.plugins.git.UserRemoteConfig' {
            'url'('https://gitlab.com/clouddevops-b47/jenkins.git')
            'credentialsId'('GitLabCred')
          }
        }
        'branches' {
          'hudson.plugins.git.BranchSpec' {
            'name'('*/main')
          }
        }
      }
      'scriptPath'('sample.Jenkinsfile')
      'lightweight'(true)
      }
    }
 }
