class Chap3CondOp {
    public static void main(String[] args) {
        String colour = new String("");
        boolean depressed = true;
        colour = (depressed ? "red" : "black");
        System.out.println("Colour is now " + colour);

        depressed = false;
        colour = (depressed ? "red" : "black");
        System.out.println("Colour is now " + colour);
    }
}