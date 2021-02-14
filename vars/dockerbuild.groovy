def call(String project) {

       
  sh 'docker build -t ratnakumar/myapp1:v1.0 .
		   withCredentials([string(credentialsId: 'dockerhub_pass', variable: 'dkr_pass')]) {
     sh 'docker login -u ratnakumar -p $dkr_pass'
	 sh 'docker push ratnakumar/myapp1:v1.0'
}
}
