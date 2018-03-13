package Tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.rentCalc;

class Test_3 {

	@Test
	void test() 
	{
		rentCalc t0;
		
		// gaz, heat, hot, cold, electr, V_gaz, V_heat, V_hot, V_cold, V_electr
		t0 = new rentCalc(2.74,32,22.21,20.47,1.92,0,62,4.3,3.2,0.9);
		assertEquals(0, t0.total_houseGas);
		assertEquals(1984, t0.total_houseHeating);
		assertEquals(95.503, t0.total_hotWater);
		assertEquals(65.504, t0.total_coldWater);
		assertEquals(1.728, t0.total_houseElectricity);

	}

}

