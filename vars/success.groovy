def call(String sender,String receiver){
   emailext to:'${receiver}',
        body: 'Good news: your build was successful',
        subject: 'build successful'
}
