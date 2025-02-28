def call(String sender,String receiver){
     emailext from: '${sender}', 
        to:'${receiver}',
        body: 'Bad news: your build was failed',
        subject: 'build failure'
}
