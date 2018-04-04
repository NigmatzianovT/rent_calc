package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.rentCalc;

public class Test_1 
{

	@Test
	void test() 
	{
		rentCalc t0;
		
		// вводим входные параметры для тестирования
		// первые 5 - тарифы, вторые 5 - объемы
		// gaz, heat, hot, cold, electr, V_gaz, V_heat, V_hot, V_cold, V_electr
		
		t0 = new rentCalc(15,16,17,18,19,5,4,3,2,1);
		
		assertEquals(75, t0.total_houseGas);
		assertEquals(64, t0.total_houseHeating);
		assertEquals(51, t0.total_hotWater);
		assertEquals(36, t0.total_coldWater);
		assertEquals(20, t0.total_houseElectricity);

	}
}

