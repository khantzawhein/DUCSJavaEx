class Chap4Block {
    public static void main(String[] args) {
        int a = 5, b = 6, c= a + b;
        if(c>10) {
            System.out.println("c is greater than 10");
            c = 0;
            System.out.println("c is now " + c);
        }
        else {
            System.out.println("c is less than 10");
        }
    }
}