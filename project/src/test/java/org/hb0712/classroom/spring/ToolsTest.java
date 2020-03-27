package org.hb0712.classroom.spring;

import org.hb0712.classroom.spring.web.Tools;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= "classpath:applicationContext.xml")
public class ToolsTest {
	
	@Autowired
	Tools tools;
	
	@Test
	public void aspectJTest() {
		
		tools.arrayList("arrayList1");
		tools.linkedList("linkedList1");
		
		tools.arrayList("arrayList2");
		tools.linkedList("linkedList2");
		
		tools.arrayList("arrayList3");
		tools.linkedList("linkedList3");
	}
	
	/*
	public static void main(String[] args) {

		ApplicationContext appCtx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

		Tools tools = (Tools) appCtx.getBean("tools");

		tools.arrayList();

		tools.linkedList();

	}
	*/
}
