public class ppap{

public static void main(String[]args){

//Always have to be in format "I have a blank, I have a blank"
System.out.print(ppap("I have a jyes, I have a no"));

}




public static String ppap(String str){
	
	String obj1="";
	String obj2="";
	
for (int i=0; i<=str.length()/2; i++){
	if (str.substring(0,i).equals("I have a ")){
		obj1=str.substring(i,str.indexOf(","));	
}
}
for (int e=str.indexOf(",")+1; e<str.length(); e++){
	if (str.substring(str.indexOf(",")+1,e).equals(" I have a ")){
		obj2=str.substring(e,str.length());	
}
}

if (!obj2.equals("")) {
    obj2 = obj2.substring(0, 1).toUpperCase() + obj2.substring(1);
}

return "Uh! "+obj2+" "+obj1;

}
}
