import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Employee{
	String name;
	String designation;
	int year;
	boolean isBoss;
	ArrayList<Employee> under;
	 Employee(String nm, String d, int y){
		 name= nm;
		 designation =d;
		 year = y;
		 isBoss = false;
	 }
	 
	 public void isBoss(){
		 this.isBoss = true;
	 }
	 
	 public void addEmployee(Employee e){
		 under.add(e);
	 }
	 
	 public Employee get() {
		 return this;
	 }
}
public class Hierarchy
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\shruti\\Dropbox\\workspace\\LearnDS\\src\\org_chart_sample.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("org_chart_sample_java.out"));
        
        int numCases = Integer.parseInt(reader.readLine());
        ArrayList<String> arrList = new ArrayList();
        for (int caseNum = 1; caseNum <= numCases; caseNum++)
        {
        	String eachCase = reader.readLine();
            String[] total = eachCase.split("--");
            for(int i=0; i<total.length;i++){
            	String[] employee = total[i].split(",");
            	if(employee[1] == "NULL"){
            		writer.write("Case #" + caseNum + "\n");
            		writer.write(employee[0] + "("+employee[2]+")"+employee[3]+ "\n");
            		arrList.add(employee[0].toString());
            	}
            	else{
            		
            	}
            		
            	
            }
            
            writer.write("Case #" + caseNum + "\n");
            //writer.write( + "\n");
        }
        
        writer.close();
        reader.close();
    }
}
