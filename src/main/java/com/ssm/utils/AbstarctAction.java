package com.ssm.utils;

import java.util.Collection;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class AbstarctAction {

	private static final Logger logger = LoggerFactory.getLogger(AbstarctAction.class);

	/**
	 * 写回ajax数据
	 * 
	 * @param data
	 *            字符串内容
	 */
	protected void writeAjaxString(HttpServletResponse response, String data) {
		if (data == null) {
			return;
		}
		response.setContentType("text/html;charset=utf-8");
		try {
			response.getWriter().print(data);

		} catch (Exception e) {
			logger.error("writeAjaxString时出错");
		}

	}

	/**
	 * 写回ajax数据
	 * 
	 * @param data
	 *            list或map对象
	 */
	protected void writeAjaxObject(HttpServletResponse response, Object data) {
		if (data == null) {
			return;
		}
		String str = "";
		if ((data instanceof Collection<?>) || data.getClass().isArray()) {
			str = JSONArray.fromObject(data).toString();
		} else {
			str = JSONObject.fromObject(data).toString();
		}

		this.writeAjaxString(response, str);
	}
	
	/**
	 * 请求失败数据
	 * @param message
	 * 		  失败信息 
	 * */
	protected void sendAjaxErroMessage(HttpServletResponse response, String message) {
		JSONObject data = new JSONObject();
		data.put("success", "false");
		data.put("message", message);
		this.writeAjaxString(response, data.toString());
	}

}
