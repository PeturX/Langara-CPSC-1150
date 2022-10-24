public class Quiz1{
	public static void main(String[] args){
		double a=1.85, b=1.34;
		double x=0,y=0;
		
        x = (Math.pow(a, 3) + Math.sqrt(Math.pow(b, 3.5) + (Math.sqrt(b)) / (1 + Math.pow(a, 2)))) / (1 + (Math.sqrt(Math.pow(b, 2) + 1)) / (a));

        y = (Math.sin(a * b) + Math.cos(Math.pow(b, 2.5))) / (Math.PI * Math.cos(Math.pow(a, 0.6)));

		System.out.println("x= "+x);
        System.out.println("y= "+y);
	}
}