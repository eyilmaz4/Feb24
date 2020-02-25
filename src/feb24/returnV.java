package feb24;

public class returnV {
    public static void main(String[] args) {
returnValue("Hello", 1, 3);
    }

    public static void returnValue(String text, int i, int j){
      String letter=" ";
        for(int a=0; a<text.length(); a++){

           if(a==i || a==j){
               System.out.print(" ");}
           else
           {
               System.out.print(text.charAt(a));
           }

        }
    }

}
