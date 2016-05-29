
public class MethodReturnsArray {

	
	
	static String cars []  = {"camry","civic","maxima"};
	public static void main(String args[])
	{
		MethodReturnsArray objectone = new MethodReturnsArray();
		System.out.println(objectone.calculateCars(cars[0])[1]);
		
		
		//System.out.println(calculateCars(honCivic));
		//System.out.println(calculateCars(nisMax));
		//System.out.println(calculateCars("ford"));
		
	}

	private  String[] calculateCars(String carType) {
		
		
		String returnmessages[] = {"welcome,You car is ",carType};
		if(carType==null)
		{
		  return returnmessages;	
		}
		if(carType.equals("camry"))
		{
			return returnmessages;
		}
		if(carType.equals("civic"))
		{
			return returnmessages;
		}
		
		if(carType.equals("maxima"))
		{
			return returnmessages;
		}
		
		return returnmessages;
		
	}

	
}
