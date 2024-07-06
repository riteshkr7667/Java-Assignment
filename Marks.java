import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Marks {

    public static void main(String[] args) throws FileNotFoundException{

    Marks mks = new Marks();
    mks.result();

    }
    
    public void result() throws FileNotFoundException {
    	
    	
    	
    	  File file = new File("Marks1.txt");
          Scanner scan = new Scanner(file);
          ArrayList<String> list = new ArrayList<>();
          String data1;
          String[] parts;
          String[] temp;
          int mark1=0;
          int total1=0;
          ArrayList<String> names = new ArrayList<String>();
          ArrayList<Integer> subject1 = new ArrayList<Integer>(); 
          ArrayList<Integer> subject2 = new ArrayList<Integer>(); 
          ArrayList<Integer> subject3= new ArrayList<Integer>();
          ArrayList<Integer> subject4= new ArrayList<Integer>();
          ArrayList<Integer> subject5= new ArrayList<Integer>();
          ArrayList<Integer> total = new ArrayList<Integer>();
          
          ArrayList<String>  subjects = new ArrayList<String>();
         
          ArrayList <String> sub1_topper= new ArrayList<String>();
          ArrayList <String> sub2_topper= new ArrayList<String>();
          ArrayList <String> sub3_topper= new ArrayList<String>();
          ArrayList <String> sub4_topper= new ArrayList<String>();
          ArrayList <String> sub5_topper= new ArrayList<String>();
          ArrayList<String> total_topper = new ArrayList<String>();
          


          
          while (scan.hasNextLine()) {
          	total1=0;
              data1 = scan.nextLine();
              list.add(data1);
              parts = data1.split(",");
              names.add(parts[0]);
              
              temp = parts[3].split(":");
              subjects.add(temp[0]);
              mark1=Integer.parseInt(temp[1].trim());
              subject1.add(mark1); 
              total1=total1+mark1;
           
              
              temp=parts[4].split(":");
              subjects.add(temp[0]);
              mark1=Integer.parseInt(temp[1].trim());
              subject2.add(mark1);
              total1=total1+mark1;
              
              temp=parts[5].split(":");
              subjects.add(temp[0]);
              mark1=Integer.parseInt(temp[1].trim());
              subject3.add(mark1);
              total1=total1+mark1;
              
              temp=parts[6].split(":");
              subjects.add(temp[0]);
              mark1=Integer.parseInt(temp[1].trim());
              subject4.add(mark1);
              total1=total1+mark1;
              
              temp=parts[7].split(":");
              subjects.add(temp[0]);
              mark1=Integer.parseInt(temp[1].trim());
              subject5.add(mark1);
              total1=total1+mark1; 
              
              total.add(total1);
          }

          
          ArrayList <String> sub1= new ArrayList<String>();
          sub1.addAll(subjects);
          
          
         

          int max1 = Collections.max(subject1);
          int max2=Collections.max(subject2);
          int max3=Collections.max(subject3);
          int max4=Collections.max(subject4);
          int max5=Collections.max(subject5);
          int max_total=Collections.max(total);

          for (int i = 0; i < names.size(); i++) {
          	if(subject1.get(i)==max1) {
               sub1_topper.add(names.get(i));
          	}
          }   
          for(int i=0; i<names.size();i++) {
          	if(subject2.get(i)==max2) {
          		sub2_topper.add(names.get(i));
          	}
          }
          
          for(int i=0; i<names.size();i++) {
          	if(subject3.get(i)==max3) {
          		sub3_topper.add(names.get(i));
          	}
          }
          for(int i=0; i<names.size();i++) {
          	if(subject4.get(i)==max4) {
          		sub4_topper.add(names.get(i));
          	}
          }
          
          for(int i=0; i<names.size();i++) {
          	if(subject5.get(i)==max5) {
          		sub5_topper.add(names.get(i));
          	}
          }
          
          for(int i=0;i<names.size();i++) {
          	if(total.get(i)==max_total) {
          		total_topper.add(names.get(i));
          	}
          }
          
      System.out.println(total_topper+" is/are Gold medalist with total mark "+ max_total +"\n");
          System.out.println(sub1_topper +" have got "+ max1 +" marks in " + subjects.get(0));
          System.out.println(sub2_topper +" have got "+ max2 +" marks in " + subjects.get(1));
          System.out.println(sub3_topper +" have got "+ max3 +" marks in " + subjects.get(2));
          System.out.println(sub4_topper +" have got "+ max4 +" marks in " + subjects.get(3));
          System.out.println(sub5_topper +" have got "+ max5 +" marks in " + subjects.get(4));
          

          
          scan.close();
    }
}
