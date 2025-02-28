def call(String email){  
  sh "trivy fs . -o result.json",
     emailext (
            subject: "Trivy Scan Results",
            body: "Please find attached the Trivy scan results.",
            attachmentsPattern: "result.json",
            to: '${email}' 
       )
}
