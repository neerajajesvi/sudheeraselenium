package IOStreams;



import java.io.FileOutputStream;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.testng.annotations.Test;




public class writeExcel {
  @Test
  public void f() throws Exception {
	  FileOutputStream f = new FileOutputStream("E:\\writeexcel.xls");
	  WritableWorkbook wb=Workbook.createWorkbook(f);
	  WritableSheet ws=wb.createSheet("Results", 0);
	  Label un=new Label(0,0,"Username");
	  Label pw=new Label(1,0,"Password");
	  Label rs=new Label(2,0,"Results");
	  ws.addCell(un);
	  ws.addCell(pw);
	  ws.addCell(rs);
	  wb.write();
	  wb.close();
  }
}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
	  
	  
	  
	  
	 

      

