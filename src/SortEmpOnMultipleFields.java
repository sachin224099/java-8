import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class EmpClass{
	private int id;
	private String firstName;
	private String lastName;
	
	public EmpClass(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "EmpClass [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
public class SortEmpOnMultipleFields {

	public static void main(String[] args) {
		List<EmpClass> list = new ArrayList<>();
		list.add(new EmpClass(1, "A", "C"));
		list.add(new EmpClass(1, "A", "B"));
		list.add(new EmpClass(1, "A", "D"));
		list.add(new EmpClass(1, "A", "D"));
		
		System.out.println(list);
		Collections.sort(list, Comparator.comparing(EmpClass :: getFirstName).thenComparing(EmpClass :: getLastName));
		
		System.out.println(list);

	}

}
