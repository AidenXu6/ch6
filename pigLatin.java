public class Main{

public static void main(String[]args){

System.out.print(pigLatin("i am NOT a vegetarian i love meat a lot"));

}




public static String pigLatin(String str) {
String answer="";
 int spaceplace=0;
 str=str+" ";

if (str.length()<=2){
    answer=str;
}

if (!str.contains(" ")&&str.length()>2){
answer=str.substring(1,str.length())+str.substring(0,1)+"ay";
}

if (str.contains(" ")&&str.length()>2){
for (int i=0; i<str.length(); i++){
    if (str.indexOf(" ",spaceplace)==i){
        if (i-spaceplace<=2){
        answer=answer+str.substring(spaceplace,i)+" ";
        spaceplace=i+1;
        }
                if (i-spaceplace>2){
        answer=answer+str.substring(spaceplace+1,i)+str.substring(spaceplace,spaceplace+1)+"ay ";
        spaceplace=i+1;
        }
    }
}
}

return answer;
}

}
