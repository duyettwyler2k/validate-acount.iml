import java.util.Scanner;

public class TestAccount {

    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };
    public static void main(String[] args) {

        AcountExemple acountExemple=new AcountExemple();
        for (String acount:validAccount){
            boolean isvaild= acountExemple.validate(acount);
            System.out.println(acount+isvaild);
        }
        for (String acount:invalidAccount){
            boolean isvaild= acountExemple.validate(acount);
            System.out.println(acount+isvaild);
        }

    }
}
