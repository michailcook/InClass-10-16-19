import java.util.Comparator;

public class CompareLastFirstName implements Comparator<Student>{

	
	public int CompareLastFirstName(Student first, Student last) {
		String firstName = first.getFirstName();
		String lastName = first.getLastName();
		String firstNameLast = last.getFirstName();
		String lastNameLast = last.getLastName();
		if(firstName.compareTo(firstNameLast) < 0) {
			return -1;
		}
		
		else if(firstName.compareTo(firstNameLast) == 0) {
			if(lastName.compareTo(lastNameLast) < 0) {
				return -1;
			}
			else if(lastName.compareTo(lastNameLast) == 0) {
			
			}
			else {
				return -1;
				
			}
		}
	
	
		else {
			return 1;
		
	}
	}
	

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	}

