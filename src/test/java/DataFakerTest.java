import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataFakerTest {

	@BeforeClass
	public void setUpClass() {
		System.out.println("BeforeClass: Setup for all tests");
	}

	@AfterClass
	public void tearDownClass() {
		System.out.println("AfterClass: Teardown for all tests");
	}

	@BeforeMethod
	public void setUp() {
		System.out.println("BeforeMethod: Setup before each test");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("AfterMethod: Teardown after each test");
	}

	@Test
	public void testOne() {
		System.out.println("Running testOne");
		assert 1 + 1 == 2;
	}

	@Test
	public void testTwo() {
		System.out.println("Running testTwo");
		assert "abc".toUpperCase().equals("ABC");
	}

	@Test
	public void testThree() {
		System.out.println("Running testThree");
		assert Math.max(5, 10) == 10;
	}

	@Test
	public void testFour() {
		System.out.println("Running testFour");
		assert "hello".length() == 5;
	}

	@Test
	public void testFive() {
		System.out.println("Running testFive");
		assert new int[] {1,2,3}.length == 3;
	}
}
