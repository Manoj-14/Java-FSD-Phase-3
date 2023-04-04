## Key points and Commands

- Download and extract Kafka Zip file
- Open Command prompt in extracted folder ex:`D:Kafka`
- then run the zookeeper using below command `.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties`
- then run the kafka server `.\bin\windows\kafka-server-start.bat .\config\server.properties`

- We can create the topic either in command prompt or from java configuration as in this repository
- command to create topic in command prompt `.\bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --create --partitions 1 --topic myfirsttopic`
- command to list the topics `.\bin\windows\kafka-topics.bat --bootstrap-server localhost:9092 --list`
- command to run consumer in command prompt `.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic <topic-name>`
- command to run producer in command prompt `.\bin\windows\kafka-console-producer.bat --bootstrap-server localhost:9092 --topic <topic-name>`