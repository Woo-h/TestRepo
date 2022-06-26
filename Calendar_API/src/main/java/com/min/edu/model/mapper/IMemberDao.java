package com.min.edu.model.mapper;

import java.util.List;
import java.util.Map;

import com.min.edu.vo.CalendarVo;

public interface IMemberDao {

	public List<CalendarVo> calenList();
	
	public boolean insertCal(Map<String, Object> map);
	
	public int dragUpdateCal(Map<String, Object> map);
	
}
