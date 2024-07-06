import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ConversionHindi {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan2= new Scanner(System.in);
		System.out.println("Enter a Number"+" - एक संख्या लिखें");
		String input0 = scan2.nextLine().replaceAll(",", "");
		int input1=Integer.parseInt(input0);
		if(input1<=999) {
			System.out.println(convert(input1));
		}
		else
		if(input1<=99999) {
     System.out.println(convert2(input1));
		}
		else if(input1<=9999999){
     System.out.println(convert3(input1));
		}else if(input1<=999999999){
		     System.out.println(convert4(input1));
				} else{
				System.out.println("invalid number");
		}
		
	}
	public static String convert4(int input1) throws FileNotFoundException {
		 
		 int part1=(input1/10000000);
			String position1=convert(part1); 

		    int part2= input1%10000000;
			String result1 = convert(part1);
		    if(part2==00) {
		    	return result1 + " करोड़";
		    }
			String position2=convert3(part2); 

		    return position1 + " करोड़ और "+ position2;		 
	 }
 public static String convert3(int input1) throws FileNotFoundException {
		 
		 int part1=(input1/100000);
			String position1=convert(part1); 

		    int part2= input1%100000;
			String result1 = convert(part1);
		    if(part2==00) {
		    	return result1 + " लाख";
		    }
			String position2=convert2(part2); 

		    return position1 + " लाख और "+ position2;		 
	 }
	 public static String convert2(int input1) throws FileNotFoundException {
		 
		 int part1=(input1/1000);
			String position1=convert(part1); 

		    int part2= input1%1000;
		    String result1 = convert(part1);
		    if(part2==00) {
		    	return result1 + " हजार";
		    }
			String position2=convert(part2); 

		    return position1 + " हजार और "+ position2;		 
	 }
	public static String convert(int input1) throws FileNotFoundException {
		ArrayList<Integer> list1= new ArrayList<Integer>();
		ArrayList<String> list2= new ArrayList<String>();

  	  File file = new File("amount_hi.txt");
      Scanner scan = new Scanner(file);
      while (scan.hasNextLine()) {
     String info=scan.nextLine().replaceAll(",", "");
      String[] words=info.split(":");

      list1.add(Integer.parseInt(words[0]));
      list2.add(words[1]);
      }
      HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < list1.size(); i++) {
		map.put(list1.get(i), list2.get(i));
		}
		
		if(input1<=100) {
		int position1=list1.indexOf(input1); 
		
        //System.out.println(list2.get(position1));
		return list2.get(position1);
		}else if(input1<=1000) {
			 int part1=(input1/100);//200
				int position1=list1.indexOf(part1); 

			    int part2= input1%100;
			    if(part2==00) {
			    	int position11=list1.indexOf(input1); 
					
			        //System.out.println(list2.get(position1));
					return list2.get(position11);	
			    }
				int position2=list1.indexOf(part2); 
           
			return list2.get(position1) + " सौ "+list2.get(position2);
		}else {
			
		}
		return null;
			
		

	}

}
