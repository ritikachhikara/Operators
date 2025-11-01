
class Program3 {

    public static void main(String[] args) {
        int x = 23;
        x--;
        int y = --x + ++x;
        int z = y++ + ++y + x++;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

}
