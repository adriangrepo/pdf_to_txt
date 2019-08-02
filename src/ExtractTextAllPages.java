import com.snowtide.PDF;
import com.snowtide.pdf.Document;
import com.snowtide.pdf.OutputTarget;
 
public class ExtractTextAllPages {
  public static void main (String[] args) throws java.io.IOException {
    String pdfFilePath = args[0];
 
    Document pdf = PDF.open(pdfFilePath);
    StringBuilder text = new StringBuilder(1024);
    pdf.pipe(new OutputTarget(text));
    pdf.close();
    System.out.println(text);
  }
}