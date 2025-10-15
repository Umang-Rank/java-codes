package sorting;

import java.util.Comparator;

public class IdSort implements Comparator<Employee>{
	
	public int compare(Employee e1,Employee e2) {
		return Integer.compare(e1.getId(),e2.getId());
	}

}
