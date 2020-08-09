import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TestPredicate {

	public static void main(String[] args) {
		Predicate<Integer> gtTen = i -> (i > 10);
		
		List<Integer> list = Arrays.asList(1,2,2,45,34)
				             .stream().filter(gtTen)
				             .collect(Collectors.toList());
		
		System.out.println(list);
		
		List<String> stringList = new ArrayList<String>();

		stringList.add("One flew over the cuckoo's nest");
		stringList.add("To kill a muckingbird");
		stringList.add("Gone with the wind");

		Stream<String> stream = stringList.stream();

		Optional<String> reduced = stream.reduce((value, combinedValue) -> {
		    return combinedValue + " + " + value;
		});

		System.out.println(reduced.get());

	}

}
