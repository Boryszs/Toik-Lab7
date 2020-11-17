import com.itextpdf.text.DocumentException;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        List<String> education=new LinkedList<String>();
        education.add("2018-PWSZ w Tarnowie");
        education.add("2014-2018 -IT technical college");
        education.add("2011-2014 -junior high school");
        education.add("2004-2010 -primary school");
        PersonalData personalData=new PersonalData("Damian","Mierzyński","Student",education,"Student computer science for three years");
        ResumeGenerator resumeGenerator=new ResumeGenerator();
        resumeGenerator.generate(personalData);
    }
}
