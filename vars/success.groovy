def call(String sender,String receiver){
   emailext from:'${sender}',
        to:'${receiver}',
        body: 'Good news: your build was successful',
        subject: 'build successful'
}
