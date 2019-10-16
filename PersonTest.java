import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest{

	private static final int INITIAL_RATING = 5;

	@Before
	void setUp() throws Exception {
	}

	@Test
	public void testStudent() throws NameException {
		try {
		Student stu = new Student();
		
		Integer rating = stu.getRating();
		Integer expected = INITIAL_RATING;
		
		assertEquals(expected, rating);
		} catch (NameException e) {
		fail("Wrong rating");
		}
	}
	
	@Test
	public void testCompareTo() throws NameException {
		Student firstStudent = new Student("x", "y", 2);
		Student secondStudent = new Student("x", "y", 3);
		
		int actual = secondStudent.compareTo(firstStudent);
		int expected = 1;
		
		assertEquals(expected, actual);
		
		Student student = new Student("x", "y", 3);
		
		expected = -1;
		actual = secondStudent.compareTo(student);
		assertEquals(expected, actual);
		
	}

	@Test
	public void testGet() throws NameException {
		try {
		Integer expected = 4;
		Integer rating = expected;
		String firstName = "Alex";
		String lastName = "Bo";
		Student s = new Student(firstName, lastName, rating);
		Integer actual = s.getRating();
		assertEquals(expected, actual);
		} catch (NameException e) {
			fail("Somethings wrong");
		}
	}
}
