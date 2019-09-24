package rs.itbootcamp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelUtils {
	private static HSSFWorkbook wb = null;
	private static HSSFSheet sheet = null;
	private static String excelPath;
	
//	podesi Excel
	public static boolean setExcel(String path) { // prosledi joj put do excel fajla
		if(wb != null) {  // ako je Excel otvoren
			try {
				wb.close();  // izadji da bi se objekat 'wb' ispraznio (postao null)
			}catch(FileNotFoundException e) {
				System.out.println(e.toString());
				return false;
			}catch(Exception e) {
				System.out.println(e.toString());
				return false;
			}
		}
		File f = new File(path);  // nalazi fajl
		try {
			FileInputStream fis = new FileInputStream(f);  // ubacuje ga u Eclipse
			
			wb = new HSSFWorkbook(fis);  // otvara novi Excel
			excelPath = path;
			return true;
			
		}catch(Exception e) {
			System.out.println(e.toString());
			return false;
		}
	}
	
//	Odabir stranice (sheet-a) u Excel-u
//	1. odabir po indexu, jer se stranice u Excel-u cuvaju kao u nizu
	public static boolean setWorkSheet(int index) {
		try {
			sheet = wb.getSheetAt(index);
		}catch(Exception e) {
			System.out.println(e.toString());
			return false;
		}
		return true;
	}
//	2. odabir po nazivu stranice
	public static boolean setWorkSheet(String name) {
		try {
			sheet = wb.getSheet(name);
		}catch(Exception e) {
			System.out.println(e.toString());
			return false;
		}
		return true;
	}
	
//	Dobavljanje podataka iz Excel tabele
	public static String getDataAt(int row, int column) {
		try {
			HSSFRow r = sheet.getRow(row);  // iz stranice uzima red
			HSSFCell cell = r.getCell(column);	// iz reda uzima kolonu/celiju
			
			return cell.getStringCellValue();  // vraca String vrednost celije
		}catch(NullPointerException e) {
			System.out.println(e.toString());
			System.out.println("Cell at position ["+row+", "+column+"] is empthy!");
		}catch(Exception e) {
			System.out.println(e.toString());
			System.out.println("Error!");
		}
		return "";
	}
	
//	Upisivanje podataka u tabelu
	public static boolean setDataAt(int row, int column, String data) {
		try {
			HSSFRow r = sheet.getRow(row);
			if(r != null) {
				r = sheet.createRow(row);
			}
			HSSFCell cell = r.getCell(column);
			if(cell != null) {
				cell = r.createCell(column);
			}
			cell.setCellValue(data);  // upisuje vrednost u celiju
			
			FileOutputStream fos = new FileOutputStream(excelPath);  // gde izbacuje iz Eclipse-e u Excel fajl
			wb.write(fos);  // upisuje u Excel
			return true;
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		return false;
	}
	
//	Dobavlja broj zuzetih redova u Excel fajlu
	public static int getRowsNum() {
		try {
			return sheet.getLastRowNum()+1;			
		}catch(Exception e) {
			System.out.println(e.toString());
			System.out.println("Error!");
			return -1;
		}
	}
	
//	Zatvara Excel
	public static boolean closeExcel() {
		if(wb != null) {
			try {
				wb.close();
				wb = null;				
			}catch(IOException e) {
				e.printStackTrace();
				wb = null;
				return false;
			}
		}
		return true;
	}

}
