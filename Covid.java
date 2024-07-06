
import java.util.*;
import java.util.ArrayList;
public class Covid {
    public static void main (String[]args){
        ArrayList<String>cities=new ArrayList<>();
        ArrayList<Double>lat1=new ArrayList<>();
        ArrayList<Double>long1=new ArrayList<>();
        ArrayList<Double>distance=new ArrayList<>();
        cities.add("NewYork");
        cities.add("Chicago");
        cities.add("Denver");
        cities.add("Los Angeles");
        lat1.add(40.7128);
        lat1.add(41.8781);
        lat1.add(39.7392);
        lat1.add(34.0522);
        long1.add(74.0060);
        long1.add(87.6298);
        long1.add(104.9903);
        long1.add(118.2437);
       double  lat_pat=28.5383;
       double long_pat=81.3792;
       double temp1,temp2,temp3;
       for(int i=0;i<4;i++){
            temp1=Math.pow((lat1.get(i)-lat_pat),2);
            temp2=Math.pow((long1.get(i)-long_pat),2);
            temp3=Math.pow(temp1+temp2, 0.5);
            distance.add(temp3);   
       }
        System.out.println(distance);
        double min1=9999999.0;
       double temp4=Collections.min(distance);
       int position=distance.indexOf(temp4);
        System.out.println(cities.get(position));  
    }
}