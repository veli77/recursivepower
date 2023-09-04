public class Main {

    static int usAl(int base,int power){
        if (power == 1)
            return base;
        return base * usAl(base,power-1);
    }

    public static void main(String[] args) {
        System.out.println(usAl(4, 3));
    }
}

