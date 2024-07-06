import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;
public class A {

	public static void main(String[] args) {

		List<Integer> number=Arrays.asList(2,3,6,7,5,8);
		Integer[] number2= {3,45,23,49,15};
		
		List<Integer> even=number.stream().filter(x->x%2==0).collect(Collectors.toList());
		List<Integer> sorted=number.stream().sorted().collect(Collectors.toList());
		
		
		System.out.println(even);

		System.out.println(sorted);
		
		
		//number.stream().map(x->x*x).forEach(y->System.out.println(y));
		
		Arrays.sort(number2, Comparator.reverseOrder());
		
		for(int y: number2) {
		System.out.println(y);
   
		}
	}

}
