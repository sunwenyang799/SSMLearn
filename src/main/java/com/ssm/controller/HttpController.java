package com.ssm.controller;

import com.alibaba.fastjson.JSONObject;
import com.ssm.model.Student;
import com.ssm.model.User;
import com.ssm.utils.AbstarctAction;
import com.ssm.utils.HttpUtil;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api/v1")
public class HttpController  extends AbstarctAction{
	
	private static Logger logger =LoggerFactory.getLogger(HttpController.class);
	
	@ResponseBody
	@RequestMapping(value="/testParam",method=RequestMethod.POST,consumes= {"application/json"})
	public JSONObject testParam(@RequestBody Student student) {
		JSONObject jsonObject = new JSONObject();
//		String data = request.getParameter("param");
		jsonObject.put("param", student);
		return jsonObject;
//		this.writeAjaxObject(response, jsonObject);
	}

	//json格式参数
	@ResponseBody
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public String add(@RequestBody User user){
		System.out.println(user.toString());
		return user.toString();
	}

	//表单格式参数
	@ResponseBody
	 @RequestMapping(value ="/add1",method = RequestMethod.POST)
	public String add1(User user){
		System.out.println(user.toString());
		return user.toString();
	}

	@ResponseBody
	@RequestMapping(value = "/test",method = RequestMethod.POST)
	public String test(){
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name","test");
		String res = HttpUtil.doPost("http://127.0.0.1:8080/SSMLearn/api/v1/add1",jsonObject);
		return res;
	}

	@ResponseBody
	@RequestMapping(value = "/test1",method = RequestMethod.POST)
	public String test1(){
		CloseableHttpClient httpClient = HttpUtil.getHttpClient();
		HttpPost httpPost = new HttpPost("http://127.0.0.1:8080/SSMLearn/api/v1/add1");
		List<NameValuePair> paramList = new ArrayList<>();
		paramList.add(new BasicNameValuePair("name","test"));
		String string = "";
		try {
			httpPost.setEntity(new UrlEncodedFormEntity(paramList));
			CloseableHttpResponse response = httpClient.execute(httpPost);
			 string = EntityUtils.toString(response.getEntity());
		} catch (Exception e) {
			logger.error("失败"+e);
		}
		return string;
	}

	//  @RequestParam接收
	@ResponseBody
	@RequestMapping(value = "/test2",method = RequestMethod.POST)
	public String test2(@RequestParam String name){

		return name;
	}

}
