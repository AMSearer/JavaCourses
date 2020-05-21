/**
   A square with integer dimensions.
*/
public class Square
{
   private int width;

   /**
      Constructs a new square with integer dimensions.
      @param w width
   */
   public Square(int w)
   {
      width = w;
   }

   /**
      Computes the area of the square.
       @return the area
   */
   public int getArea()
   {
      //implement a recursive method
	  if (width==1) 
	  {
		  return 1;
	  }
	  else
	  {
		  Square smallerSquare = new Square(width - 1);
		  return (2 * width - 1 + smallerSquare.getArea());
	  }
   }
   
   /*
   public static void main(String[] args)
   {
	   Square test = new Square(4);
	   int out;
	   out = test.getArea();
	   
	   System.out.println(out);
   }
   */
}
