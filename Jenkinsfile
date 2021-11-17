node {
    stage('git clone') {
        git branch: 'main',
            url: 'https://github.com/zhog96/pdris_jenkins/'
            
    }
    stage('build') {
        sh 'mvn clean verify'
    }
    stage('test') {
        sh 'mvn test'
    }
}
