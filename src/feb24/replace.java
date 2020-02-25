package feb24;

public class replace {
    public static void main(String[] args) {
replaceGivenLetters("Hello", 'o','a');
    }
    public static void replaceGivenLetters(String text, char a, char b){

        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)==a){
                System.out.println(b);
            }
            else
            {
                System.out.print(text.charAt(i));
            }
        }

    }
}
