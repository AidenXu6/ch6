public class ques1{

public static void main (String []args){

squareRoot(9);





}
//n=a x=x0 x1=x2

public static double squareRoot(double n){
double x=n/2;
double x1=(x+n/x)/2;
while (Math.abs(x1-x)>=0.0001){
  x=x1;
  x1=(x+n/x)/2;
}
System.out.print(x1);
return x1;

}

}










