import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataSortingMain {
		public static final String VALIDATION_OF_ABSOLUTE_PATH = "([a-zA-Z]:)?(\\\\[^<>:\"\\/|\\?\\*].+)+\\\\?";
		
		public static void main(String args[]) throws IOException   {  
			Scanner sc= new Scanner(System.in);
			BufferedReader br = null;
			BufferedWriter bw = null;
			String readedFromFile= null; 
			//String enteredName = getFileName(sc);
			br = new BufferedReader(new FileReader("test.txt"));
			try {		
				while((readedFromFile = br.readLine()) != null){
				//System.out.println(readedFromFile);
					separatingPeople(readedFromFile);
				}			
			}catch(FileNotFoundException e){
				System.out.println("Please enter the file path again");
			}finally {
				if (br != null) {
					br.close();        
				}
				if (bw != null) {
					bw.close();
				}
			}
			System.out.println("Info Sorted...");	 
		}
	
 

	public static void separatingPeople(String readedFromFile){
	
		String[] splitted = readedFromFile.split("\\*");
		Person[] array = new Person[splitted.length/4];
		System.out.println(array.length);
		for (int i = 0, j=0; i < splitted.length; i = i + 4) {
			Integer.parseInt(splitted[i]);
			array[j]=new Person(Integer.parseInt(splitted[i]), splitted[i+1], splitted[i+2], Integer.parseInt(splitted[i+3]));
		    System.out.println(splitted[i]);
		    j++;
		}
		sortingPeople(array);
	}
public static void sortingPeople(Person[] array){
	int i, j;
	Person swap;
	
	for(i=0; i<(array.length-1); i++){
		for(j=0; j<(array.length)-i-1; j++){
			if(array[j].getNumber()>array[j+1].getNumber()){
				swap = array[j];
				array[j]= array[j+1];
				array[j+1]=swap;
			}
		}
	}
    
	for(i=0; i<array.length; i++){
		System.out.println("The number is: " +array[i].getNumber());
		System.out.println("The name is: " + array[i].getName());
		System.out.println("The surname is: " + array[i].getSurname());
		System.out.println("Born in: " +array[i].getYearOfBirth());
	}
	
}


	public static String getFileName(Scanner console){
		String enteredName;
		Pattern pattern = Pattern.compile(VALIDATION_OF_ABSOLUTE_PATH);
		Matcher matcher;
        
		do{
			System.out.println("Enter the path to the file:  ");
		enteredName = console.nextLine();
		matcher = pattern.matcher(enteredName);
		}while(matcher.matches() == false);
        
		return enteredName;
	}
}