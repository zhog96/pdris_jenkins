node {
    stage('git clone') {
        git branch: 'main',
            url: 'https://github.com/zhog96/pdris_jenkins/'
            
    }
    stage('build') {
        sh 'mvn -f java/pom.xml clean verify'
    }
    stage('test') {
        sh 'mvn -f java/pom.xml test allure:report'
    }
    stage('allure') {
        allure([
                includeProperties: false,
                jdk: '',
                properties: [],
                reportBuildPolicy: 'ALWAYS',
                results: [[path: 'java/taget/allure-results']]
            ])
    }
}
