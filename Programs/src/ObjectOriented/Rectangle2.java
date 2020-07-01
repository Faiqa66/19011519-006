package ObjectOriented;

public class Rectangle2 {
   int length;
   int width;
   
   void insert(int l,int w) {
	   length=l;
	   width=w;
   }
   
   void AreaCalculation() {
	   System.out.println(length*width);
   }
   
  public static void main(String[] args) {
	  Rectangle2 r1=new Rectangle2(),r2=new Rectangle2();
	  r1.insert(11, 5);
	  r2.insert(3, 15);
	  
	  r1.AreaCalculation();
	  r2.AreaCalculation();
	  
  }
}
