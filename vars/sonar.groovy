def call(string SonarQubeApi, string projectname, string projectkey) {
    withSonarQubeEnv("${SonarQubeApi}") {
                     sh "$SONAR_HOME/bin/sonar-scanner -Dsonar.projectName=${projectname} -Dsonar.projectKey=${projectkey} -X"
}
