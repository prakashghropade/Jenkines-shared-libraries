def call( String Project, String ImageTag, String dockerHubUser ){
echo 'This is pushing the image to dockerhub'
  
withCredentials([usernamePassword( 
                'credentialsId': "af231936-30d5-416e-b6c8-005fd99a1ed0", 
                 passwordVariable:"dockerHubPass", 
                 usernameVariable: "dockerHubUser")]){
                sh 'docker login -u $dockerHubUser -p $dockerHubPass'
                sh 'docker push  $dockerHubUser/${Project}:${ImageTag}'
                }
            }

echo 'This is pushing the image to dockerhub'

  
}
