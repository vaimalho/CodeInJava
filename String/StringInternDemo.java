package strings;

public class StringInternDemo {

    public static void main(String[] args) {

        String s = new String("Vaibhav");
        String s1 = new String("Vaibhav");

        System.out.println(s==s1);


        String s2 = new String("Vaibhav").intern();
        String s3 = new String("Vaibhav").intern();

        System.out.println(s2==s3);
        
    }
}
