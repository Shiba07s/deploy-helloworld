pipeline{
    agent any
    
    tools{
        maven 'local_maven'
    }
     
    stages{
         stage("clone code"){
            steps {
                echo "clone the code into github"
                git url:"https://github.com/Shiba07s/deploy-helloworld.git", branch:"master"
            }
            
        }
        stage ('Build'){
            steps{
                echo "successfully creating war file"
                sh 'mvn clean package'
            }
            post{
                success{
                    echo 'Archiving the Artifacts'
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        }
        stage('Deploy') {
            steps {
                 //deploy adapters: [tomcat9(credentialsId: 'tomcat', path: '', url: 'http://16.171.54.78:8090/')], contextPath: 'hello-app', war: '**/*.war'
            }
        }
}
}
