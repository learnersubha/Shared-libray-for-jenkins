def call(String credId,String imagename){
   withCredentials([usernamePassword(
                    credentialsId: "${credId}",
                    passwordVariable: "dockerhubpass",
                    usernameVariable: "dockerhubuser"
                )]) {
                    sh "echo ${env.dockerhubpass} | docker login -u ${env.dockerhubuser} --password-stdin"
                    sh "docker image tag ${imagename} ${env.dockerhubuser}/"${imagename}":latest"
                    sh "docker push ${env.dockerhubuser}/${imagename}:latest"
                }
}
