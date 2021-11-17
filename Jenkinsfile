node {
    stage('git clone') {
        git branch: 'main',
            url: 'https://github.com/zhog96/pdris_jenkins/'
            
    }
    stage('build') {
        sh 'mvn -f java/pom.xml -X clean verify'
    }
    stage('test') {
        sh 'mvn -f java/pom.xml -X test'
    }
}
