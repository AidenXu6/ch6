public class Main {
    public static void main(String[] args){
   System.out.print(spell("acorsy", "geroge")); =
    }

    public static boolean spell(String letters, String word){
        if (letters.length() < word.length()){
       return false;
 }

   for (char ch = 'a'; ch <= 'z'; ch++){
   int letterCount = 0;
   int wordCount = 0;

   for (int i = 0; i < letters.length(); i++){
 if (letters.charAt(i) == ch){
  letterCount++;
   }
 }
  for (int i = 0; i < word.length(); i++){
  if (word.charAt(i) == ch){
    wordCount++;
   }
  }

  if (wordCount > letterCount){
   return false;
  }
 }

  return true;
    }
}
