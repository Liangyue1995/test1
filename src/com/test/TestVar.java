package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;

public class TestVar {
	
	public static void deplay(){
		ProcessEngine processEngine=ProcessEngineConfiguration
				.createProcessEngineConfigurationFromResource("activiti.cfg.xml")
				.buildProcessEngine();
		System.out.println(processEngine);
		System.out.println(processEngine);
		Deployment deployment=processEngine.getRepositoryService()
				.createDeployment()
				.addClasspathResource("Activiti/leave.bpmn")
				.addClasspathResource("Activiti/leave.png")
				.deploy();
		System.out.println("����ID"+deployment.getId());
		System.out.println("����name"+deployment.getName());
		
   } 
	public static void qd() {		
		 //��������
		ProcessEngine processEngine=ProcessEngineConfiguration
				.createProcessEngineConfigurationFromResource("activiti.cfg.xml")
				.buildProcessEngine();
		System.out.println(processEngine);
		//��������
		//������
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("u1", "���");//�ύ
		map.put("u2", "�Ÿ�");//����
		map.put("u3", "������");//����
		//��������
		 ProcessInstance pi = processEngine.getRuntimeService()
                 .startProcessInstanceByKey("leave",map);
		//��������id 32701
		System.out.println("��������id:"+pi.getId());
		System.out.println("����ActivityId:"+pi.getActivityId());
	}

	
	public static void szcs(){
		ProcessEngine processEngine=ProcessEngineConfiguration
				.createProcessEngineConfigurationFromResource("activiti.cfg.xml")
				.buildProcessEngine();
		System.out.println(processEngine);
		//���̴��� 32707
		//�鿴��
		String dbz="���";
//		��ȡ�����б�
		TaskService service=processEngine.getTaskService();
		Task task=service.createTaskQuery()
				        .taskAssignee(dbz)
				        .singleResult();
		//���ñ���  2 Լ�� now
//		service.setVariable(task.getId(), "���ԭ��", "Լ��");
//		service.setVariable(task.getId(), "����", 2);
//		service.setVariable(task.getId(), "��ʼʱ��", new Date());
		Map<String, Object> var=new HashMap<String, Object>();
		var.put("���ԭ��", "Լ��");
		var.put("����", 2);
		var.put("��ʼʱ��", "2018-01-01");
		service.setVariables(task.getId(), var);
		
//		Map<String, Object> map=service.getVariables(task.getId());
//		Set<String> set=map.keySet();
//		for (String key : set) {
//			System.out.println("key "+key+" value:"+map.get(key));
//		}
//		service.setVariable(task.getId(), "����1", "Լ��Լ��Լ��");
//		//����
	    System.out.println("����id:"+task.getId());
	    System.out.println("��������:"+task.getName());
	}
	
	public static void tj(){
		ProcessEngine processEngine=ProcessEngineConfiguration
				.createProcessEngineConfigurationFromResource("activiti.cfg.xml")
				.buildProcessEngine();
		System.out.println(processEngine);
	    //��������
	    processEngine.getTaskService().complete("92702");
	}

	public static void ckcs(){
		ProcessEngine processEngine=ProcessEngineConfiguration
				.createProcessEngineConfigurationFromResource("activiti.cfg.xml")
				.buildProcessEngine();
		System.out.println(processEngine);
		//���̴��� 32707
		//�鿴��
		String dbz="������";
//		��ȡ�����б�
		TaskService service=processEngine.getTaskService();
		Task task=service.createTaskQuery()
				        .taskAssignee(dbz)
				        .singleResult();
		
		Map<String, Object> map=service.getVariables(task.getId());
		Set<String> set=map.keySet();
		for (String key : set) {
			System.out.println("key "+key+" value:"+map.get(key));
		}
		service.setVariable(task.getId(), "����2", "Լ��Լ��Լ��");
//		//����
	    System.out.println("����id:"+task.getId());
	    System.out.println("��������:"+task.getName());

	}

}
