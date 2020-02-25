package feb24;

public class bgt {
    public static void main(String[] args) {
        charRemove("mobile", 'i');
    }

    public static void charRemove(String a, char b) {
       char letter = 'x';
        for (int i = 0; i <= a.length() - 1; i++) {
            letter = a.charAt(i);
            if (letter== b) {

                System.out.print(" ");

            } else {
                System.out.print(letter);
            }
        }

    }
}




