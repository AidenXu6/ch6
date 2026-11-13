public class Main{

public static void main(String[]args){

System.out.print(converttobinary(3485345));

}




public static String converttobinary(int num) {
String answer="";
int remainder=234;
while (num>0){
remainder=num%2;
num=num/2;
answer=remainder+answer;


}
return answer;
}

}
