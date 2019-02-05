class Chap4MarksMatrix {
    public static void main(String[] args) {
        String students[] = {"Benny","Robin","Sally","Aaron","Simon"};
        int[][] marks = {{89,45,55},
                        {56,86,23},
                        {88,81,73},
                        {35,75,39},
                        {65,62,77}
                    };
        int i = 0;
        int j = 0;

        System.out.println("\nMarks for students: ");
        for(i=0; i<marks.length;i++){
            System.out.println(students[i] + " -> " + "maths=" + marks[i][j] + " "+ "english=" +marks[i][j+1]+" "+ "science=" + marks[i][j+2]);
        }
    }
}