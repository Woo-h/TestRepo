package com.min.edu.model.service;

import java.util.List;
import java.util.Map;

import com.min.edu.vo.CalendarVo;

public interface IMemberService {

	public List<CalendarVo> calenList();
	
	public boolean insertCal(Map<String, Object> map);
	
	public int dragUpdateCal(Map<String, Object> map);
	
}
