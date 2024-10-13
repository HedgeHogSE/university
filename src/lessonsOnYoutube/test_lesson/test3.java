package lessonsOnYoutube.test_lesson;

public class test3 {
    public static void main(String[] args) {
         String text = "my name is Giovanni Giorgio";
         String newText = text.substring(10).toUpperCase();
         String[] textArray = newText.split(" ");
         int length = 0;
         for (String elText : textArray){
             length = elText.length();
             System.out.print(elText);
             System.out.println(length);
         }
    }
}
