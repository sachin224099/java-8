import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapAndFlatMap {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("a", "sds", "dfds", "dfd", "dfd");
		List<String> flatList = l.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(flatList);

		List<List<String>> l1 = Arrays.asList(Arrays.asList("wew", "ewe", "ee"), 
				                                  Arrays.asList("fd", "fd", "d"),
				                           Arrays.asList("dsfds","ee","fd")                                  
				);
		Set<String>flatmaplIst = l1.stream()
				                    .flatMap(List :: stream)
				                    .map(String :: toUpperCase)
				                    //.distinct()
				                    .collect(Collectors.toSet());
	    System.out.println(flatmaplIst);
	}

}
