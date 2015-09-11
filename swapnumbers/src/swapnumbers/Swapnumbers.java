package swapnumbers;

public class Swapnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
        System.out.println("Values of x and y before swapping \nx= "+x+"\ny="+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("Values of x and y after swapping \nx= "+x+"\ny="+y);
        func1();
      }
	
	public static void func1(){
	    int a= 25;
	    int b= 50;
	    int c=0;
	    System.out.println("Values of a and b before swapping \na= "+a+"\nb="+b);
	    c=a;
	    a=b;
	    b=c;
	    System.out.println("Values of a and b after swapping \na= "+a+"\nb="+b);
	}
   }
