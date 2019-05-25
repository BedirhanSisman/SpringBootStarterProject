package com.bedirhansisman.springbootstarter.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	//	Topic t1 = new Topic("1", "Java", "Java Description");
	//	Topic t2 = new Topic("2", "C#", "C# Description");
	//	Topic t3 = new Topic("3", "Spring Boot", "Spring Boot Description");
	//	Topic t4 = new Topic("4", "Javascript", "Javascript Description");
	//	
	//	ArrayList<Topic> listOfTopics = new ArrayList<Topic>();
	//	
	//	listOfTopics.add(t1);
	//	listOfTopics.add(t2);
	//	listOfTopics.add(t3);
	//	listOfTopics.add(t4);
	
	//OR 
	
	private List<Topic> listOfTopics = new ArrayList<>(Arrays.asList(
		new Topic("1", "Java", "Java Description"),
		new Topic("2", "C#", "C# Description"),
		new Topic("3", "Spring Boot", "Spring Boot Description"),
		new Topic("4", "Javascript", "Javascript Description")
	));
	
	public List<Topic> getAllTopics(){
		return listOfTopics;
	}
	
	public Topic getTopic(String id) {
		return listOfTopics.stream().filter(t -> t.getID().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		listOfTopics.add(topic);
	}

	public void updateTopic(String iD, Topic topic) {
		for(Topic t : listOfTopics) {
			if(t.getID().equals(iD)) {
				listOfTopics.set(listOfTopics.indexOf(t), topic);
			}
		}
	}

	public void deleteTopic(String iD) {
		for(Topic t : listOfTopics) {
			if(t.getID().equals(iD)) {
				listOfTopics.remove(listOfTopics.indexOf(t));
			}
		}
	}

}
