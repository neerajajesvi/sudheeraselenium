package IOStreams;

import java.io.FileInputStream;




import jxl.Sheet;
import jxl.Workbook;

import org.testng.annotations.Test;

public class Readexceldata {
  @Test
  public String[][] readexcel() throws Exception {
	  FileInputStream f = new FileInputStream("E:\\login_mail.xls");// You have to give the file path as a parameter to fileinputstream
	  Workbook wb = Workbook.getWorkbook(f); 
	  Sheet sh = wb.getSheet(0); 
	 	  String a[][] = new String[2][16];
	  try
	  {
	  for (int j=0;j<sh.getColumns();j++)
		  
	  {
	        for (int i=0;i<sh.getRows();i++)
	          {
	        	
	                  a[j][i]=sh.getCell(j, i).getContents();
	                  System.out.println(j+" and "+i+" "+a[j][i]);//Prints cell content one by one
	          }
	  }


	  }
	  catch(Exception e)
	  {
	          
		  System.out.println(e);
	  }
	  return a;
	  
	  } 
  
  public static void main(String args[])throws Exception
  {
	  Readexceldata re=new Readexceldata();
	  re.readexcel();
	  //re.readexcel();
  }
	  

  }

