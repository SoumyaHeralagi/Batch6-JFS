package com.cg.springboot1.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	private List<Topic> topics = Arrays.asList(
			new Topic("spring","spring Framework","spring framework description"),
			new Topic("java","core java ","core java description"),
			new Topic("javascript","javascript","javascript description")
			);
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
