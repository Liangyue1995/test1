package com.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.UserEntity;
import com.service.ActivitiServiceImpl;
import com.service.UserDaoServiceImpl;

public class Test {
	public static void main(String[] args) {
//		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
//		UserDaoServiceImpl dao = (UserDaoServiceImpl) ac.getBean("userDaoServiceImpl");
//		UserEntity user = new UserEntity("王五", "123", "地雷","有");
//		dao.UserAdd(user);
//		//dao.UserUpdate(user);
//		//dao.UserDelete("1");
//		System.out.println("ok");  
		/* UserEntity userfindById = dao.UserfindById("1");
	  System.out.println(userfindById.getUsername());*/
		
		/*List<UserEntity> userfindAll = dao.UserfindAll();
		for (UserEntity userEntity : userfindAll) {
			System.out.println(userEntity.getUsername());
		}*/
		/*UserEntity login = dao.login("李四", "123");
		if (login!=null) {
			System.out.println("ok");
		} else {
			System.out.println("nook");
		}*/
		 
		
		
//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		 ActivitiServiceImpl ser = (ActivitiServiceImpl) ac.getBean("activitiServiceImpl");
//		 //启动流程
//		 Map<String, Object> map = new HashMap<String,Object>();
//		 map.put("u1", "张飞");
//		 map.put("u2", "关羽");
//		 map.put("u3", "刘备");
//		 String key = "leave";
//		 ser.qd(map, key);
		
		//TestVar.deplay();
		    //啓動 82701
			TestVar.qd();
			//李白设置参数
//			Test.szcs();
	        //李白提交
//			Test.tj();
		    //杜甫查看 87702
//			Test.ckcs();
		    
		
	}
	 
}
