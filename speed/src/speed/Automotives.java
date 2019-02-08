package speed;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Automotives {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		
		String ProjectRoot = "C:\\TRIES\\Automotives";
		String editedfiles = "C:\\TRIES\\Automotives\\edits";
		Calendar cal = Calendar.getInstance();
		Date date=cal.getTime();
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		String formattedDate=dateFormat.format(date);
		String InputFile = ProjectRoot+"\\testfile"+formattedDate.replace(":","")+".txt";
		String editedfile = editedfiles+"\\editedtestfile.txt";
		
		
		openfile(InputFile);
        
		File folder = new File(ProjectRoot);
		File[] filelist = folder.listFiles();
		
		int filecount = filelist.length;
		
		System.out.println("No. of Files"+filecount);
		int filecounts = 0;
		int foldercount = 0;
		
		for (File file : filelist) {
		    if (file.isFile()) {
		        System.out.println("File"+file.getName());
		        filecounts++;
		    }
		    if (file.isDirectory()) {
		    	System.out.println("Directory"+file.getName());
		    	foldercount++;
		    }
		}		
		
		System.out.println("File Count is: "+filecounts+"\n");
		System.out.println("Folder count is:"+foldercount+"\n");
		
		/*Fibo.fibonacci();
		Fibo.Prime();
		Fibo.NumberDigits();
		Fibo.palindrome();
		Fibo.reversenumber();*/
		//Fibo.testarray();
		//Jsonfields.jaywaytests();
		//Fibo.calenders();
		Fibo.ymlusers();

	}

	public static File openfile(String openfiles) throws IOException {
		
		File file = new File(openfiles);
        file.createNewFile();
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Some text here for a reason");
        bw.flush();
        bw.close();
		return file;
	}
	
	

}
