
public class Thermostat extends Thermo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Thermo t = new Thermo();
		Thermo t1 = t;
		t1.furnace_on();
	}
	
}

class Thermo
{
	float currentTemp;
	float desiredTemp;
	
	public void furnace_on()
	{
		System.out.println("Inside On Func");
	}
	
	public void furnace_off()
	{
		System.out.println("Inside Off Func");
	}
}