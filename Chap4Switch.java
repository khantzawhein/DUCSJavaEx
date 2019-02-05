class Chap4Switch {
    public static void main(String[] args) {
        int currentValue = Integer.parseInt(args[0]);
        int colour = currentValue;
        switch(colour) {
            case 0 : System.out.println("red");
                    break;
            case 1 : System.out.println("Amber");
                    return;
            case 2 : System.out.println("green");
            default: System.out.println("error");
        }
        System.out.println("out of switch");
    }
}