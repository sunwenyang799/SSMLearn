//package com.ssm.test;
//
//import java.io.File;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import com.ssm.model.TFy;
//import com.ssm.service.IFyService;
//import com.ssm.utils.POIUtil;
//
//public class TestPOI {
//
//	public static void main(String[] args) {
//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		IFyService fyService = (IFyService) ac.getBean("fyService");
//		Map<String, TFy> listFyMap = new HashMap<String, TFy>();
//		POIUtil poiUtil = new POIUtil();
//		String File = "E:\\znsj3.14\\fyCode(1).xls";
//		File file = new File(File);
//		List<TFy> listFy = poiUtil.insert(file);
//		System.out.println("表:" + listFy.size() + "个法院");
//		boolean flag= true;
//		// JSONObject jsonObject = JSONObject.fromObject(listFy);
//		// System.out.println(listFy.size());
//		// System.out.println(jsonObject.size());
//
//		Collections.sort(listFy, new Comparator<TFy>() {
//
//			public int compare(TFy o1, TFy o2) {
//				int i = Integer.parseInt(o1.getBh()) - Integer.parseInt(o2.getBh());
//				// if(i == 0){
//				// return o1.getAge() - o2.getAge();
//				// }
//				return i;
//			}
//		});
//
//		List<TFy> listFy1 = fyService.getAllFY();
//		System.out.println("数据库:" + listFy1.size() + "个法院");
//		for (int i = 0; i < listFy.size(); i++) {
//			if (!listFy.get(i).toString().equals(listFy1.get(i).toString())) {
//				flag = false;
//				System.out.println("表中编号:" + listFy.get(i).getBh()+"与数据库中编号:" + listFy1.get(i).getBh()+"不同");
//			}
//		}
//
//		if(flag) {
//			System.out.println("表中与数据库中数据相同!");
//		}
//		// JSONObject jsonObject1 = JSONObject.fromObject(listFyMap);
//		// System.out.println(listFy1.size());
//	}
//
//}
