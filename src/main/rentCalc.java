package main;

public class rentCalc
{
	
    private double houseGas = 0;
    private double houseHeating = 0;
    private double hotWater = 0;
    private double coldWater = 0;
    private double houseElectricity = 0;
    
    private double V_houseGas = 0;
    private double V_houseHeating = 0;
    private double V_hotWater = 0;
    private double V_coldWater = 0;
    private double V_houseElectricity = 0;
    
    public double total_houseGas = 0;
    public double total_houseHeating = 0;
    public double total_hotWater = 0;
    public double total_coldWater = 0;
    public double total_houseElectricity = 0;
    public double total_sum = 0;
    
    public rentCalc (double gaz, double heat, double hot, double cold, double electr, double V_gaz, double V_heat, double V_hot, double V_cold, double V_electr) 
    {
        houseGas = gaz;
        houseHeating = heat;
        hotWater = hot;
        coldWater = cold;
        houseElectricity = electr;
        
        V_houseGas = V_gaz;
        V_houseHeating = V_heat;
        V_hotWater = V_hot;
        V_coldWater = V_cold;
        V_houseElectricity = V_electr;
        
        Calc();
    }
 
    void Calc()		//расчет квартплаты
    {
    	total_houseGas = houseGas * V_houseGas;
        total_houseHeating = houseHeating * V_houseHeating;
        total_hotWater = hotWater * V_hotWater;
        total_coldWater = coldWater * V_coldWater;
        total_houseElectricity = houseElectricity * V_houseElectricity;
        total_sum = total_houseGas + total_houseHeating + total_hotWater + total_coldWater + total_houseElectricity;
    }
    

}
