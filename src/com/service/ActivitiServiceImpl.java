package com.service;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class ActivitiServiceImpl implements IActivitiService {
	ProcessEngine processEngine =  ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml").buildProcessEngine();
	
	@Override
	public void qd(Map<String, Object> map, String key) {
		  ProcessInstance pi = processEngine.getRuntimeService().startProcessInstanceByKey(key,map);
		   System.out.println("流程启动成功: "+pi.getId());
			 
	}
	@Override
	public Map<String, Object> ckdb(String dbr) {
		 TaskService taskService = processEngine.getTaskService();
		   Task task = taskService.createTaskQuery().taskAssignee(dbr).singleResult();
		   System.out.println("---->taskId"+task.getId());
		   Map<String, Object> map1 = taskService.getVariables(task.getId());

		   if (map1!=null) {
			   return map1;
		}
		return null;
	}

	@Override
	public void szdb(Map<String, Object> map, String dbr) {
		TaskService taskService = processEngine.getTaskService();
		   Task task = taskService.createTaskQuery().taskAssignee(dbr).singleResult();
		   
		   if (map!=null) {
				if (map.size()!=0) {
					taskService.setVariables(task.getId(), map);;
				}
		}
		   System.out.println("当前任务"+task.getId());
	}
	@Override
	public void tj(String taskid) {
		processEngine.getTaskService().complete(taskid );
		   System.out.println("ok：办理完成！");
	}
public static void main(String[] args) {
	ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	 ActivitiServiceImpl ser = (ActivitiServiceImpl) ac.getBean("activitiServiceImpl");
	 //启动流程
//	 Map<String, Object> map = new HashMap<String,Object>();
//	 map.put("u1", "张飞");
//	 map.put("u2", "关羽");
//	 map.put("u3", "刘备");
//	 String key = "leave";  
//	 ser.qd(map, key);
	 //设置流程参数
//	 Map<String, Object> map1 =new HashMap<String,Object>();
//	 map1.put("请假时间", "2天");
//	 map1.put("请假原因", "约会");
//	 map1.put("请假开始时间", "2017-10-10");
//	 ser.szdb(map1, "张飞");
//	 System.out.println(map1);
	 //查看任务
//	 Map<String, Object> map2=ser.ckdb("刘备");
//	 System.out.println(map2);
	 //提交任务
	 ser.tj("12502");
			 
	 
	 
}


}
