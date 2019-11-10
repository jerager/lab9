import static org.junit.Assert.*;

import org.junit.*;

public class LinkedListJunitTests {

	Student l = new Student();
	Student l2 = new Student();
	Student l3 = new Student();
	Student l4 = new Student();

	Student empty = new Student();


	@Before 
	// Runs before EACH test
	public void setup() {


		l.add("One");
		l.add("Two");
		l.add("One");

		l2.add("One");
		l2.add("Тwo");
		l2.add("Three");
		l2.add("Оne");

		l3.add("One");
		l3.add("Two");
		l3.add("Three");
		l3.add("Four");
		l3.add("Thirteen");

		l4.add("Two");
		l4.add("Three");
		l4.add("Four");
		l4.add("Thirteen");


	}


	// One test of length

	@Test
	public void testLength() {
		assertEquals("Test of method length",l.length(),3);
	}


	// Tests of Odd


	@Test
	public void testOdd1() {
		assertEquals("Test of method odd",l.odd(),false);
	}

	@Test
	public void testOdd2() {
		//System.out.println("AAAA"+l2.odd());
		assertEquals("Test of method odd",l2.odd(),true);
	}

	@Test
	public void testOdd3() {
		assertEquals("Test of method odd",empty.odd(),true);
	}

	/*
	
	@Test
	public void testIth1() {
		assertEquals("Test of ith",l2.ith(3),l2.getNext().getNext().getNext());
	}

	@Test
	public void testIth2() {
		assertEquals("Test of ith",l2.ith(5),null);
	}

	@Test
	public void testIth3() {
		assertEquals("Test of ith",l2.ith(1),l2.getNext());
	}

*/

	@Test
	public void testAddFile() {
		Student lnew = new Student();
		lnew.addFile("TestData.dat");
		assertEquals("testing addList", true, lnew.sameList(l3));

	}

}
