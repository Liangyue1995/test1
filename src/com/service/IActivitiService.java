package com.service;

import java.util.Map;

public interface IActivitiService {
	public void qd(Map<String, Object>map , String key);
	public Map<String, Object> ckdb(String dbr);
	public void szdb(Map<String, Object>map, String dbr);
	public void tj(String taskid );

}
