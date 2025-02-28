def call(String credId,String imagename){
   withCredentials([usernamePassword(
                    credentialsId: "${credId}",
                    passwordVariable: "dockerhubpass",
                    usernameVariable: "dockerhubuser"
                )]) {
                    sh "docker login -u ${env.dockerhubuser} -p ${env.dockerhubpass}"
                    sh "docker image tag ${imagename} ${env.dockerhubuser}/${imagename}:latest"
                    sh "docker push ${env.dockerhubuser}/${imagename}:latest"
                }
}
