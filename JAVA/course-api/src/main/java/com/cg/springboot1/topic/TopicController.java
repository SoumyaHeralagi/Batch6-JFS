package com.cg.springboot1.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

//	@RequestMapping("/topics")
//	public String getAllTopics() {
//		
//			return "All topics";
//			
//		}
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		
//		return Arrays.asList(
//				new Topic("spring","spring Framework","spring framework description"),
//				new Topic("java","core java ","core java description"),
//				new Topic("javascript","javascript","javascript description")
//				);
		
		return topicService.getAllTopics();
	}
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		
		return topicService.getTopic(id);
	}
}
