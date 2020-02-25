package feb24;

public class StringCharRemove {
    public static void main(String[] args) {
        System.out.println(charRemove("word", 'o'));
    }
    public static String charRemove(String word, char letter){
        String removed="";
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)!=letter){
                removed+=word.charAt(i);

            }
        } return removed;
    }
}
