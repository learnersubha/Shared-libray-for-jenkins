def call(String sender, String receiver){
   emailext from:'sender',
        to:'receiver',
        body: 'Godde news: your build was successful',
        subject: 'build successful'
}
