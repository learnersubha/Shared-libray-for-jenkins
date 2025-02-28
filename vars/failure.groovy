def call(String sender,String receiver){
     emailext to:'${receiver}',
        body: 'Bad news: your build was failed',
        subject: 'build failure'
}
