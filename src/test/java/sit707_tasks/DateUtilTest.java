package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "223418666";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Shreeyut Shrestha";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		DateUtil date = new DateUtil(1, 1, 2024);
        System.out.println("january1ShouldIncrementToJanuary2 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() { 
		DateUtil date = new DateUtil(1, 1, 2024);
        System.out.println("january1ShouldDecrementToDecember31 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());
	}
	
	/*
	 * Write tests for rest months of year 2024.
	 */
	@Test
	public void testJune1ShouldIncrementToJune2() {
		DateUtil date = new DateUtil(1, 6, 1994);
        System.out.println("June1ShouldIncrementToJune2 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2, date.getDay());
	}
	@Test
	public void testJune2ShouldIncrementToJune3() {
		DateUtil date = new DateUtil(2, 6, 1994);
        System.out.println("June2ShouldIncrementToJune3 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(3, date.getDay());
	}
	@Test
	public void testJune15ShouldIncrementToJune16() {
		DateUtil date = new DateUtil(15, 6, 1994);
        System.out.println("June15ShouldIncrementToJune16 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(16, date.getDay());
	}
	@Test
	public void testJune30ShouldIncrementToJuly1() {
		DateUtil date = new DateUtil(30, 6, 1994);
        System.out.println("June30ShouldIncrementToJuly1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	@Test
	public void testJune31shouldbeinvalid() {
		boolean chec= false;
		System.out.println("June31shouldbeinvalid > ");
		try {
		DateUtil date = new DateUtil(31, 6, 1994);
		} catch(Exception e) {
			chec=true;
		}
		Assert.assertTrue(chec);
	}
	@Test
	public void testJanuary15ShouldIncrementToJanuary16() {
		DateUtil date = new DateUtil(15, 1, 1994);
        System.out.println("January15ShouldIncrementToJanuary16 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(16, date.getDay());
	}
	@Test
	public void testFebruary15ShouldIncrementToFebruary16() {
		DateUtil date = new DateUtil(15, 2, 1994);
        System.out.println("February15ShouldIncrementToFebruary16 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(16, date.getDay());
	}
	@Test
	public void testNovember15ShouldIncrementToNovember16() {
		DateUtil date = new DateUtil(15, 11, 1994);
        System.out.println("November15ShouldIncrementToNovember16 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(11, date.getMonth());
        Assert.assertEquals(16, date.getDay());
	}
	@Test
	public void testDecember15ShouldIncrementToDecember16() {
		DateUtil date = new DateUtil(15, 12, 1994);
        System.out.println("December15ShouldIncrementToDecember16 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(16, date.getDay());
	}
	@Test
	public void testJune15_1700ShouldIncrementToJune16_1700() {
		DateUtil date = new DateUtil(15, 6, 1700);
        System.out.println("June15_1700ShouldIncrementToJune16_1700 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(16, date.getDay());
	}
	@Test
	public void testJune15_1701ShouldIncrementToJune16_1701() {
		DateUtil date = new DateUtil(15, 6, 1701);
        System.out.println("June15_1701ShouldIncrementToJune16_1701 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(16, date.getDay());
	}
	@Test
	public void testJune15_2023ShouldIncrementToJune16_2023() {
		DateUtil date = new DateUtil(15, 6, 2023);
        System.out.println("June15_2023ShouldIncrementToJune16_2023 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(16, date.getDay());
	}
	@Test
	public void testJune15_2024ShouldIncrementToJune16_2024() {
		DateUtil date = new DateUtil(15, 6, 2024);
        System.out.println("June15_2024ShouldIncrementToJune16_2024 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(16, date.getDay());
	}
	
	
	@Test
	public void testMinMarch1ShouldDecrementToFebruary29() {
		DateUtil date = new DateUtil(1, 3, 2000);
        System.out.println("March1ShouldDecrementToFebruary29 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
	}
	
	@Test
	public void testMaxFebruary29ShouldIncrementToMarch1() {
		DateUtil date = new DateUtil(29, 2, 2000);
        System.out.println("MaxFebruary29ShouldIncrementToMarch1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(3, date.getMonth());
	}

}
