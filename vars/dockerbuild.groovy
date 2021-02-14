def call(String project) {

       
  sh 'docker build . -t ratnakumar/myapp:$Docker_tag'
		   withCredentials([string(credentialsId: 'dockerhub_pass', variable: 'dkr_pass')]) {
     sh 'docker login -u ratnakumar -p $dkr_pass'
	 sh 'docker push ratnakumar/myapp:$Docker_tag'
}
}
