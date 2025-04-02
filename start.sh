pkill -f 'java -jar' || echo "No app running"

nohup /usr/bin/java -jar /home/ec2-user/todoApp-0.0.1-SNAPSHOT.jar > /home/ec2-user/app.log 2>&1 &