import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TesteToCelsius {
	ToCelsius tocelsius = new ToCelsius();

	@Test
	public void test() {
		
		double result = tocelsius.conversion();
		
		Assertions.assertEquals(result, tocelsius.conversion());		
		
	}

}
