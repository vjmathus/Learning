//hello
public class hello {

    public static void main(String[] args) {
        int a = 12;
        int b = 54;
        System.out.println(a + b);
        System.out.println("mojo");
        System.out.println("vijay");
        String c="vijay";
        String d="";
        for(int i=c.length()-1;i>=0;i--){
            d=d+c.charAt(i);

        }
        System.out.println("Reversing string:"+d);
    }
}
