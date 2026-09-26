package pdfValidation;

import java.io.IOException;

import org.apache.pdfbox.contentstream.PDContentStream;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class CreatingaNewPdf {

	public static void main(String[] args) throws IOException {
		//1.Pd Document
		PDDocument Document=new PDDocument();
		//2.adding the page
		PDPage page=new PDPage();//here we can mention the sizes 
		
		//3.Connection
		Document.addPage(page);
		//4.content
		PDPageContentStream datas= new PDPageContentStream(Document, page);
		
		//5.size,font
		datas.setFont(PDType1Font.TIMES_BOLD, 10);
		datas.beginText();
		datas.newLineAtOffset(20, 300);
		
		datas.showText("MUHAMMED AASIK");
		datas.newLineAtOffset(20, 400);
		datas.showText("muhanned");
		datas.endText();
			datas.close();
			//6. save
			Document.save(".\\datas\\newpdf.pdf");
			Document.close();
			
			
			
			
		
	}

}
