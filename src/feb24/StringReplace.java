package feb24;

public class StringReplace {
    public static void main(String[] args) {
        System.out.println(replaceString("Hello", 'o','a'));
    }
    public static String replaceString( String text, char lookup, char newchar){
        String replaced="";
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)==lookup){
                replaced+=newchar;
            }
            else{
                replaced +=text.charAt(i);
            }
        }
return replaced;
    }
}
