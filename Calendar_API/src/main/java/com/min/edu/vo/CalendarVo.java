package com.min.edu.vo;

import java.io.Serializable;

public class CalendarVo implements Serializable{

	private static final long serialVersionUID = 9080359928799495178L;
	
	private int id;
	private int groupid;
	private String title;
	private String writer;
	private String description;
	private String start;
	private String end;
	
	public CalendarVo() {
	}

	public CalendarVo(int id, int groupid, String title, String writer, String description, String start, String end) {
		this.id = id;
		this.groupid = groupid;
		this.title = title;
		this.writer = writer;
		this.description = description;
		this.start = start;
		this.end = end;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGroupid() {
		return groupid;
	}

	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}
	
}
