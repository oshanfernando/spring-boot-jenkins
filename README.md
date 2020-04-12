# spring-boot-jenkins
Simple Spring Boot application using jenkins


1. Copy the deply-jar.service file to /etc/systemd/system

2. Install it as a System Service using the command sudo systemctl start deply-jar.service

3. Change the git url in Jenkinsfile to your own repo

4. Configure Jenkins to use the Jenkinsfile
