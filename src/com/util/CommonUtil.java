/**
 * 
 */
package com.util;

import java.util.UUID;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.repository.Deployment;


/**
 * @author ����
 *
 */
public class CommonUtil {
public static String getUUID(){
	String uuid = UUID.randomUUID().toString().trim().replace("-", "");
	
	return uuid;
	
}
//���̲���
public static void deplay(){
	ProcessEngine processEngine =  ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml").buildProcessEngine();
	   
				Deployment deployment=processEngine.getRepositoryService()
						.createDeployment()
						.addClasspathResource("Activiti/leave.bpmn")
						.addClasspathResource("Activiti/leave.png")
						.deploy();
				System.out.println("���̲���ɹ�����ID"+deployment.getId()+"����name"+deployment.getName());		   
}
public static void main(String[] args) {
	CommonUtil.deplay();
}
}
