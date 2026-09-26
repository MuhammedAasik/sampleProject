package pdfValidation;

import java.io.File;
import java.io.IOException;

//import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadPdfFile {

	public static void main(String[] args) throws IOException {
		//step 1 : Add dependency
		
		//step 2: Add the location & load the PdfFile
		
		
		File file1=new File(".//datas//SamplePdf.pdf");
		
		PDDocument pdfFile=PDDocument.load(file1) ;//--2.29
		
		//PDDocument pdfFile=
		
		//Read the Datas in pdf File 
		PDFTextStripper Read=new  PDFTextStripper();
		String Text=Read.getText(pdfFile);
		String pagestart=Read.getPageStart();
		System.out.println(Text);
		pdfFile.close();

	}

}
