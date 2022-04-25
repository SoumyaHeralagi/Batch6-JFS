package in.nit.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@DisplayName("Testing Employee Task")
public class TestEmp{
	
	@BeforeEach
	public void setup(){
		System.out.println("From Setup");
	}
	@Test
	@DisplayName("Testing Save Method")
	public void testSave() {
		System.out.println("Hello-Save");
	}
	@DisplayName("Testing Update Method")
	@Test
	public void testUpdate() {
		System.out.println("Hello-update");
	}
	@AfterEach
	public void clear() {
		System.out.println("Hello-clear ");
	}
	@BeforeAll
	public static void setupOnce() {
		System.out.println("From One time Onesetup ");
	}
	@AfterAll
	public static void closeAll() {
		System.out.println("Once At End");
	}
	@RepeatedTest(value=3,name="{displayName}-{currentRepetition}/{totalRepettion}")
	@DisplayName("Multiple Test")
	public void testManyTimes(TestInfo info) {
		//System.out.println("Hello "+info.getTestClass().get().getName());
		//System.out.println("Hello "+info.getTestMethod().get().getName());
		System.out.println("Hello "+info.getDisplayName());
	}
	
}




