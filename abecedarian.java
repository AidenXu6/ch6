public class Main {

public static void main(String[]args){
System.out.print(abc("acorsy"));
}


public static boolean abc(String str){
String order="abcdefghijklmnopqrstuvwxyz";
for (int i=0; i<str.length()-1; i++){
    String letter=str.substring(i,i+1);
if (order.indexOf(letter)>order.indexOf(str.substring(i+1,i+2))){
return false;
} 

}
return true;
}
}
