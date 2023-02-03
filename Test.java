import java.util.Scanner;
public class Test {
    public static void main(String args[]) {
        int count = 0;
        System.out.println("Enter a sentence :");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        boolean a ,e,i,o,u ;
        a = e = i = o = u = false;

        for (int j = 0; j < sentence.length(); j++)
        {
            char ch = sentence.charAt(j);
            if (ch == 'a' || ch == 'A')
                a = true;
            if (ch == 'e' || ch == 'E')
                e = true;
            if (ch == 'i' || ch == 'I')
                i = true;
            if (ch == 'o' || ch == 'O')
                o = true;
            if (ch == 'u' || ch == 'U')
                u = true;

        }


        if (a == true)
            System.out.println("A is used in sentence");
        if (e == true)
            System.out.println("E is used in sentence");
        if (i == true)
            System.out.println("I is used in sentence");
        if (o == true)
            System.out.println("O is used in sentence");
        if (u == true)
            System.out.println("U is used in sentence");

    }
}
