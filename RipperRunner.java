
/**
 * Write a description of class RipperRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RipperRunner
{
    public static void main ( String[] args )
	{
		StringRipper demo = new StringRipper("chicken");
		System.out.println(demo.ripString(3,6));
		System.out.println(demo);
		
		demo.setString("alligator");
		System.out.println(demo.ripString(3,8));
		System.out.println(demo);		

		demo.setString("COMPUTER SCIENCE IS THE BEST!");
		System.out.println(demo.ripString(9,12));
		System.out.println(demo.ripString(0,12));
		System.out.println(demo.ripString(5,20));				
		System.out.println(demo);	

		demo.setString("I like fried chicken and mashed potatoes!");
		System.out.println(demo.ripString(0,7));
		System.out.println(demo.ripString(7,15));
		System.out.println(demo.ripString(15,26));
		System.out.println(demo.ripString(22,26));						
		System.out.println(demo);		
	}

}
