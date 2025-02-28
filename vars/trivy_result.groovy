def call(String email){
     emailext (
            subject: "Trivy Scan Results",
            body: "Please find attached the Trivy scan results.",
            attachmentsPattern: "result.json",
            to: "${email}" 
    )
}
