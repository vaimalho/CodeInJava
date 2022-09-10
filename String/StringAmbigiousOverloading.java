package strings;

public class StringAmbigiousOverloading {

    public static void foo(Object s){
        System.out.println("String");
    }

    public void foo(StringBuilder sb){
        System.out.println("String Builder!!");
    }

    public static void main(String[] args) {
        new StringAmbigiousOverloading().foo(null);
    }
}
