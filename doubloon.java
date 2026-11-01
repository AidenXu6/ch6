public class Main {
    public static void main(String[] args){
        System.out.print(isDoubloon("acorsy"));
    }

    public static boolean isDoubloon(String str){
        String uncap = str.toLowerCase();
        
 
for (char ch = 'a'; ch <= 'z'; ch++) {
 int count = 0;

 for (int i = 0; i < uncap.length(); i++) {
 if (uncap.charAt(i) == ch) {
 count++;
 }
 }
            
 
 if (count != 0 && count != 2) {
   return false;
  }
   }
        
  return true;
    }
}
