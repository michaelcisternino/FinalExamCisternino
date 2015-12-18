package QuestionC;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Rectangle_Test {

	Rectangle r;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test (expected = IllegalRectangle.class)
	// throws exception, doesn't recognize
	public void IllegalRectangleTest() {
	try {
		final Rectangle r = new Rectangle(-2, 1);
	} catch (IllegalRectangle e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		e.getIllegal();
	}
	}
	/*
	@Test
	public void Rectangle_Test1() {
		
		Rectangle r2 = new Rectangle(5, 10);
		assertTrue(r2.ComputeArea() == 50);
	}
	
	@Test
	public void Rectangle_Test2() {
		
	
		Rectangle r2 = new Rectangle(5, 10);
		assertTrue(r2.ComputeArea() == 50);
	}
	*/

}
