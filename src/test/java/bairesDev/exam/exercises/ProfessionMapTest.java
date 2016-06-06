package bairesDev.exam.exercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ProfessionMapTest {

	@Test
	public void addDataToMap() throws Exception {
		ProfessionMap professionMap = new ProfessionMap();
		
		professionMap.addData("Daniel", "Architect");
		
		assertEquals(1, professionMap.getMap().size());
	}
	
	@Test
	public void getProfessionByName() throws Exception {
		ProfessionMap professionMap = new ProfessionMap();
		
		professionMap.addData("Marion", "Engineer");
		professionMap.addData("James", "Doctor");
		
		assertEquals("Doctor", professionMap.getProfessionByName("James"));
	}
}
