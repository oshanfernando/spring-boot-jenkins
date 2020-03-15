pipeline {
     agent any
     stages {
        stage("Checkout") {
            steps {
                git url: 'https://github.com/oshanfernando/spring-boot-jenkins.git'
            }
        }
        stage("Compile") {
            steps {
                sh "sudo mvn clean install -DskipTests"
            }
        }
        stage("Deploy") {
            steps {
                sh "sudo systemctl stop deploy-jar"
                sh "sudo cp target/spring-boot-jenkins-01.jar /opt/applications/app.jar"
                sh "sudo systemctl start deploy-jar"
            }
        }
}
}