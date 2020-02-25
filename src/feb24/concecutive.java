package feb24;

import org.w3c.dom.ls.LSOutput;

public class concecutive {
    public static void main(String[] args) {
        Cons("aaabccc");
    }

    public static void Cons(String word){
word+=" ";
        for(int i=0; i<word.length()-1; i++){
            if(word.charAt(i)!=word.charAt(i+1)){
                System.out.print(word.charAt(i));
            }

                //System.out.print(word.charAt(i+1));

            }
        }

    }

