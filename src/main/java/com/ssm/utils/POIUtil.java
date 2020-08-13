//package com.ssm.utils;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.apache.commons.lang.StringUtils;
//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//
//import com.ssm.model.TFy;
//
///**
// * PoiUtil
// *
// * @author Administrator
// * @version 1.0
// *
// */
//public class POIUtil {
//
//	public List<TFy> insert(File file) {
//		List<TFy> fyList = new ArrayList<TFy>();
//		Map<String,TFy> fyMap = new HashMap<String,TFy>();
//		TFy fy = null;
//		try {
//			// 读取数据流
//			InputStream inp = new FileInputStream(file);
//			// 解析文件簿
//			HSSFWorkbook workBook = new HSSFWorkbook(inp);
//			// 解析工作表
//			// 判断多少个工作表
//			int size = workBook.getNumberOfSheets();
//			// 循环读取每一个工作表中的数据
//			for (int i = 0; i < size; i++) {
//
//				HSSFSheet sheet = workBook.getSheetAt(i);
//				 拿到一个具体的工作表
//				int rowNumber = sheet.getPhysicalNumberOfRows();
//				int rowNumber  = 3602;
//				// int rowNumber = 30;
//				for (int rowIndex = 0; rowIndex < rowNumber; rowIndex++) {
//					fy = new TFy();
//					if (rowIndex < 3433) {
//						continue;
//					}
//					HSSFRow row = sheet.getRow(rowIndex);
//					for (int cellIndex = 0; cellIndex < 6; cellIndex++) {
//
//						HSSFCell cell = row.getCell(cellIndex);
//						switch (cellIndex) {
//						case 0:
//							if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
//								break;
//							} else {
//								fy.setBh(String.valueOf((int) cell.getNumericCellValue()));
//								break;
//							}
//						case 1:
//							if(cell == null||cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
//								break;
//							}else {
//
//								fy.setpBh(String.valueOf((int) cell.getNumericCellValue()));
//								break;
//							}
//						case 2:
//							if(cell == null) {
//								break;
//							}else if(cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
//								fy.setFjm(cell.getStringCellValue());
//							}else {
//								fy.setFjm(String.valueOf((int) cell.getNumericCellValue()));
//								break;
//							}
//						case 3:
//								if(cell!=null) {
//									fy.setMc(cell.getStringCellValue());
//								}
//							break;
////						case 4:
////							break;
//						case 5:
//							if(cell!=null &&cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
//
//								fy.setSzsf(cell.getStringCellValue());
//							}
//							break;
//						}
//
//					}
//					if (StringUtils.isNotBlank(fy.getBh())) {
//
//						fyList.add(fy);
//					}
//				}
//
//			}
//
//		} catch (Exception e) {
//
//			e.printStackTrace();
//		}
//		return fyList;
//
//	}
//}
