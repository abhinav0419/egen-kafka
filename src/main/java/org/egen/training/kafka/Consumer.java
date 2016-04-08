//package org.egen.training.kafka;
//
//import java.util.Arrays;
//import java.util.Properties;
//
//import org.apache.kafka.clients.consumer.ConsumerRecords;
//import org.apache.kafka.clients.consumer.KafkaConsumer;
//import org.apache.kafka.clients.consumer.RoundRobinAssignor;
//
//public class Consumer {
//
//	public static void main(String[] args) throws Exception {
//		final Properties props = new Properties();
//		
//        props.put("bootstrap.servers",              "192.168.99.100:9092");
//        props.put("group.id",                       "test");
//        props.put("session.timeout.ms",             "30000");
//        props.put("enable.auto.commit",             "true");
//        props.put("auto.commit.interval.ms",        "10000");
//        props.put("key.deserializer",               "org.apache.kafka.common.serialization.StringDeserializer");
//        props.put("value.deserializer",             "org.apache.kafka.common.serialization.StringDeserializer");
//        props.put("partition.assignment.strategy",  RoundRobinAssignor.class.getName());
//        
//        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(props);
//        consumer.subscribe(Arrays.asList("test"));
//        
//        while(true) {
//        	try {
//	        	ConsumerRecords<String, String> records = consumer.poll(30000);
//	        	records.forEach(record -> {
//	        		final Object message = record.value();
//	                System.out.println("Received message: " + message.toString());
//	        	});
//        	} catch(Exception e) {
//        		System.out.println("No more messages found. Exiting...");
//        		break;
//        	}
//        }
//        consumer.close();
//	}
//}
