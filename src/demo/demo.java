package demo;

public class demo {
	
	static String previous="";
	final static String newline = "/n";

	public static void main(String[] args) {
		
		String pickup = "D4-->D3-->C3-->B3-->B2-->A2-->A3-->A4-->B4";


		 String[] pickupDirections = pickup.split("-->");
	        

	        
	        for(int i =0;i<pickupDirections.length;i++)
	        {
	        	if(i>1)
	        	{
	        		//
	        		
	        		//System.out.println("@@@@@@@@@@@@@@1: "+pickupDirections[i-1].charAt(0)+" 2 "+pickupDirections[i].charAt(0) +" result: "+ (pickupDirections[i-1].charAt(0)>pickupDirections[i].charAt(0)));
	        		System.out.println(findDirection(pickupDirections[i-1],pickupDirections[i]));
	        	}
	        	else if(i>0)
	        	{
	        		System.out.println("From intersetion "+pickupDirections[0]+" goto intersection "+pickupDirections[1]);
	        		findDirection(pickupDirections[i-1],pickupDirections[i]);
	        	}
	        }

	}

	
	
	static  private String findDirection(String loc1, String loc2)
	 {
		 if(loc1.charAt(0) == loc2.charAt(0))
		 {
			 //System.out.println("inside 1 previous: "+previous);
			 if(loc1.charAt(1) < loc2.charAt(1))
			 {
				 previous = "down";
			 }
			 else
			 {
				 previous = "up";
			 }
			 
			 return "Continue on "+(loc1.charAt(0)+"").toUpperCase()+" street upto intersection "+loc2;
			
		 }
		 else if(loc1.charAt(0) > loc2.charAt(0))
		 {
			 //System.out.println("inside 2 previous: "+previous);
			 if(previous.equals("up"))
			 {
				 previous = "right";
				 return "turn right to intersection "+loc2;
			 }
			 else if(previous.equals("down"))
			 {
				 previous = "left";
				 return "turn left to intersection "+loc2;
			 }
			 else if(previous.equals("straight"))
			 {
				 return "continue straight towards "+loc2;
			 }
			 else
			 {
				 previous = "straight";
				 return "move straight towards "+loc2;
			 }
		 }
		 
		 else
		 {
			 //System.out.println("inside 3 previous: "+previous);
			 
			 if(previous.equals("up"))
			 {
				 previous="left";
				 return "turn left to intersection "+loc2;
			 }
			 else if(previous.equals("down"))
			 {
				 previous = "right";
				 return "turn right to intersection "+loc2;
			 }
			 else if(previous.equals("straight"))
			 {
				 return "continue straight towards "+loc2;
			 }
			 else
			 {
				 previous = "straight";
				 return "move straight towards "+loc2;
			 }
		 }
		 

	 }
}
