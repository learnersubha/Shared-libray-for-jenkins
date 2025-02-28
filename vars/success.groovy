def call(email sender, email receiver){
   emailext from:'${sender}',
        to:'${receiver}',
        body: 'Good news: your build was successful',
        subject: 'build successful'
}
