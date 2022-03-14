package in.nit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class exam {
	@Test
	@Tag("dev")
	public void testA() {
		System.out.println("HI TestA");
	}
	@Test
	@Tag("prod")
	public void testB() {
		System.out.println("HI TestB");
	}
	@Test
	public void testMultiple()
	{
		assertEquals("A","A");
	}

}
