import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class JavaStream {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ajeet");
		names.add("Negan");
		names.add("Aditya");
		names.add("Steve");
		
		Predicate<String> p = str -> str.length() < 6;
		//Using Stream and Lambda expression
		long count = names.stream().filter(p).count();
		System.out.println("There are "+count+" strings with length less than 6");

		  Stream.iterate(1, count1 -> count1 + 1)  
	        .filter(number -> number%3 ==0)  
	        .limit(6)  
	        .forEach(System.out::println); 
		  
		  List<String> names1 = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

	        List<String> longnames = names1.stream()    // converting the list to stream
	                .filter(str -> str.length() > 6)   // filter the stream to create a new stream
	                .collect(Collectors.toList());  // collect the final stream and convert it to a List

	        longnames.forEach(System.out::println);     
	        
	        List<Integer> num = Arrays.asList(1,2,3,4,5,6);
	        List<Integer> squares = num.stream()
	        		.map(n -> n * n)
	        		.collect(Collectors.toList());
	        System.out.println(squares);        

	}

}
