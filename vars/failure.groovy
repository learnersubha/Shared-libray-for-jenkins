def call(email sender, email receiver){
     emailext from:'${sender}',
        to:'${receiver}',
        body: 'Bad news: your build was failed',
        subject: 'build failure'
}
