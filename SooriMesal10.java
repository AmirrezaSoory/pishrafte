
public class SooriMesal10 {
	public static void main(String[] args)
	{
	   String str = "Hello amir";
	   int width = 15;
	   String s =  stringFormatter.leftAdjust(str, width);
	   System.out.println("Left justify string is: " + s);
	   s = stringFormatter.rightAdjust (str, width) ;
	   System.out.println("Right justify string is: " + s);
	   s = stringFormatter.center(str, width) ;
	   System.out.println("Middle justify string is: " + s);
	}
}
