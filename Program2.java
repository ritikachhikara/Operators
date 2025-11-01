
class Program2 {

    public static void main(String[] args) {
        int a = 12;
        int b = ++a;
        a++;
        int c = a++ + ++b - --a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
