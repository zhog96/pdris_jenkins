node {
    stage('git clone') {
        git branch: 'main',
            url: 'https://github.com/zhog96/pdris_jenkins/'
            
    }
    stage('build') {
        sh 'mvn clean validate compile'
    }
    stage('test') {
        sh 'mvn test'
    }
}
