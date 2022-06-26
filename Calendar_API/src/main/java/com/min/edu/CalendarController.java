package com.min.edu;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.min.edu.model.service.IMemberService;
import com.min.edu.vo.CalendarVo;

@Controller
public class CalendarController {

	private static final Logger logger = LoggerFactory.getLogger(CalendarController.class);

	@Autowired
	private IMemberService iService;

	@RequestMapping(value = "/calendar.do", method = RequestMethod.GET)
	public String list() {
		logger.info("CalendarController list");
		return "calendar";
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/calendarAjax.do", method = RequestMethod.GET)
	@ResponseBody
	public JSONArray date(Model model) {
			List<CalendarVo> lists = iService.calenList();
			System.out.println("datedatedatedatedate" + lists.toString());
			JSONArray arr = new JSONArray();
			for (CalendarVo vo : lists) {
				JSONObject obj = new JSONObject();
				obj.put("id", vo.getId());
				obj.put("title", vo.getTitle());
				obj.put("groupid", vo.getGroupid());
				obj.put("description", "테스트입니다~");
				obj.put("start", vo.getStart());
				obj.put("end", vo.getEnd());
				arr.add(obj);
			}
			logger.info("JSONArray 파싱한 값 : {}", arr);

			// return 형태
			// [{},{},{}....]
			return arr;
		
	}

	/**
	 * 일정 등록
	 * @param map 받아오는 form의 값 : 작성자, 일정명, 내용, 그룹, 시작일, 종료일
	 * @return 성공 : true / 실패 : false
	 */
	@RequestMapping(value = "/calendarInsert.do", method = RequestMethod.POST)
	@ResponseBody
	public boolean calendarInsert(@RequestParam Map<String, Object> map) {
			boolean isc = iService.insertCal(map);
			logger.info("CalendarController calendarInsert 성공여부 : {}", isc);
			return isc;
	}

	/**
	 * 드래그 일정 수정
	 * @param map 받아오는 값 : start, end, id
	 * @return String  "true" / "false"
	 */
	@RequestMapping(value = "/uadateDragAjax.do", method = RequestMethod.POST)
	@ResponseBody
	public String updateAjax(@RequestParam Map<String, Object> map) {
		logger.info("CalendarController updateAjax 받아온 값 : {}", map);
		String isc = "false";
			if (iService.dragUpdateCal(map) > 0) {
				isc = "true";
				System.out.println(isc);
			}
		return isc;
	}

}
