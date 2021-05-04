package RajaTestScripts;
//package Devops;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//
//import org.apache.pdfbox.pdmodel.PDDocument;
//import org.apache.pdfbox.text.PDFTextStripper;
//import org.testng.annotations.Test;
//
//import BaseclassPackage.Baseclass;
//
//public class PDFRead extends Baseclass{
//
//	// static String filepath
//	static String filepath ="C:\\Users\\User\\Downloads\\mentalhealth-160301085212.pdf" ;
//	//static String filepath = "C:\\Users\\User\\Desktop\\Alex_Comp3524_Sony_Projects3524_COI_1603779476.pdf";
//	// static String
//	// filepath="C:\\Users\\User\\Desktop\\Superintendent_Report_1603423155.pdf";
//
////	public static void main(String[] raja) throws IOException {
////		PDFRead pdfread = new PDFRead();
////		pdfread.readcontent(filepath);
////	}
//
//	
//
//	public void readcontent(String filepathofPDF) throws FileNotFoundException {
//
//		File file = new File(filepathofPDF);
//		FileInputStream fis = new FileInputStream(file);
//		PDDocument doc = null;
//
//		try {
//			doc = PDDocument.load(fis);
//			String Output=null;
//			Output = new PDFTextStripper().getText(doc);
//			//System.out.println(Output);
//			String[] strArr = Output.split("MENTAL HEALTH");
//			System.out.println(strArr[1] + "This is a piece of code");
//
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//
//	}
//}
