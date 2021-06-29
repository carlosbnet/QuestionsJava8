import java.util.Scanner;

public class CompareString {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str1  = sc.nextLine();

        String str2  = sc.nextLine();

        if (str1.compareTo(str2) > 0 ) {
            System.out.println("Str1 less than Str2");
        }else if (str1.compareTo(str2) < 0 ) {
            System.out.println("Str1 bigger then Str2");
        }else{
            System.out.println("Str1 equals Str2");
        }
        sc.close();
    }


}
