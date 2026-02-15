def call(String ProjectName, String ImageTag, String  DockerHubuser){

   echo 'This is building the image'
  
  sh "docker build -t ${DockerHubuser}/${ProjectName}:${ImageTag} ."

     echo 'Docker image build completed successfully'
}
