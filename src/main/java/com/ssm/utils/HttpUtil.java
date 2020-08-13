package com.ssm.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

public final class HttpUtil {

	private static Logger logger = LoggerFactory.getLogger(HttpUtil.class);

	private static PoolingHttpClientConnectionManager manager = new PoolingHttpClientConnectionManager();

	static {
		manager.setMaxTotal(300);
		manager.setDefaultMaxPerRoute(10);
	}

	private HttpUtil() {
		throw new IllegalStateException("HttpUtil.class");
	}

	/**
	 * post请求
	 * 
	 * @param 
	 * 
	 * @return {@link JSON}
	 */
	public static String doPost(String url, JSONObject jsonParam) {

		JSONObject jsonResult = null;
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		String str = "";
		if (null != jsonParam) {
			StringEntity entity = new StringEntity(jsonParam.toString(), StandardCharsets.UTF_8);
			entity.setContentEncoding("UTF-8");
			httpPost.setHeader("content-type",ContentType.APPLICATION_JSON.toString());
			entity.setContentType("application/json");
			httpPost.setEntity(entity);
		}
		try {
			HttpResponse result = httpClient.execute(httpPost);
			if (result.getStatusLine().getStatusCode() == 200) {
				str = EntityUtils.toString(result.getEntity(), StandardCharsets.UTF_8);
				logger.info(str);

			}
		} catch (Exception e) {
			logger.error("获取响应失败" + e);
		}
		return str;
	}
	
	/**
	 * get请求
	 * @param 
	 * @return {@link JSONObject}
	 * */
	public static JSONObject doGet(String url, JSONObject jsonParam) {
		JSONObject jsonResult = null;
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet(url);
		try {
			HttpResponse response = httpClient.execute(httpGet);
			if (response.getStatusLine().getStatusCode() == 200) {
				String str = "";
				str = EntityUtils.toString(response.getEntity());
				logger.info(str);
				jsonResult = JSON.parseObject(str);
			}
		} catch (Exception e) {
			logger.error("获取响应失败" + e);
		}
		return jsonResult;

	}

	public static CloseableHttpClient getHttpClient(){
		RequestConfig config = RequestConfig.custom().setConnectionRequestTimeout(3000)
				.setConnectTimeout(3000).build();
		CloseableHttpClient httpClient = HttpClients.custom().setConnectionManager(manager).setDefaultRequestConfig(config).build();
		return httpClient;
	}

}
