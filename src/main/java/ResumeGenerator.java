import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ResumeGenerator {
   private String PATH="C:\\Users\\ideapad\\Desktop\\java\\toik\\toik-lab7\\Resume.pdf";
   private  final Font TIMES_ROMAN_32=new Font(Font.FontFamily.TIMES_ROMAN, 32, Font.NORMAL);
   private  final Font TIMES_ROMAN_14=new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.NORMAL);
   private PdfPTable table;
   private Document document;
   private PersonalData personalData;

    public ResumeGenerator() {
        table = new PdfPTable(2);
        table.setWidthPercentage(100);
    }

    public void generate(PersonalData personalData) throws FileNotFoundException, DocumentException {
        this.personalData=personalData;
        document=new Document();
        PdfWriter.getInstance(document, new FileOutputStream(PATH));
        document.open();
        addTitlePage(document);
        ceateTable(document);
    }

    private void addTitlePage(Document document) throws DocumentException {
        Paragraph preface = new Paragraph();

        preface.add(new Paragraph("Resume",TIMES_ROMAN_32));
        preface.setAlignment(Element.ALIGN_CENTER);
        for (int i = 0; i < 5; i++) {
            preface.add(new Paragraph(" "));
        }
        document.add(preface);
    }


    private void ceateTable(Document document) throws DocumentException {


        PdfPCell pdfPCell = new PdfPCell(new Phrase("First Name",TIMES_ROMAN_14));
        pdfPCell.setPadding(15);
        table.addCell(pdfPCell);

        pdfPCell.setPhrase(new Phrase(personalData.getName(),TIMES_ROMAN_14));
        table.addCell(pdfPCell);

        pdfPCell.setPhrase(new Phrase("Last Name",TIMES_ROMAN_14));
        table.addCell(pdfPCell);

        pdfPCell.setPhrase(new Phrase(personalData.getSurnamename(),TIMES_ROMAN_14));
        table.addCell(pdfPCell);

        pdfPCell.setPhrase(new Phrase("Profession",TIMES_ROMAN_14));
        table.addCell(pdfPCell);

        pdfPCell.setPhrase(new Phrase(personalData.getProfession(),TIMES_ROMAN_14));
        table.addCell(pdfPCell);

        pdfPCell.setPhrase(new Phrase("Education",TIMES_ROMAN_14));
        table.addCell(pdfPCell);

        String tmp=new String("");
        for(String str:personalData.getEducation()){
            tmp+=str;
            tmp+="\n";
        }
        pdfPCell.setPhrase(new Phrase(tmp,TIMES_ROMAN_14));
        table.addCell(pdfPCell);

        pdfPCell.setPhrase(new Phrase("Summary",TIMES_ROMAN_14));
        table.addCell(pdfPCell);

        pdfPCell.setPhrase(new Phrase(personalData.getSummary(),TIMES_ROMAN_14));
        table.addCell(pdfPCell);

        document.add(table);

        // close the document
        document.close();
    }
}
