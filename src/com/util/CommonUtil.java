/**
 * 
 */
package com.util;

import java.util.UUID;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.repository.Deployment;


/**
 * @author 梁悦
 *
 */
public class CommonUtil {
public static String getUUID(){
	String uuid = UUID.randomUUID().toString().trim().replace("-", "");
	
	return uuid;
	
}
//流程部署
public static void deplay(){
	ProcessEngine processEngine =  ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml").buildProcessEngine();
	   
				Deployment deployment=processEngine.getRepositoryService()
						.createDeployment()
						.addClasspathResource("Activiti/leave.bpmn")
						.addClasspathResource("Activiti/leave.png")
						.deploy();
				System.out.println("流程部署成功流程ID"+deployment.getId()+"流程name"+deployment.getName());		   
}
public static void main(String[] args) {
	CommonUtil.deplay();
}
}
