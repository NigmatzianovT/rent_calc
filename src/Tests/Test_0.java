package Tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.rentCalc;

class Test_0 {

	@Test
	void test() 
	{
		rentCalc t0;
		
		t0 = new rentCalc(10,10,10,10,10,1,2,3,4,5);
		assertEquals(20, t0.total_houseHeating);

	}

}

