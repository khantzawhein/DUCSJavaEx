class Chap4StudentMarksArray {
    public static void main(String[] args) {
        String student[] = {"Benny","Robin","Sally","Aaron","Simon"};
        int mark[] = new int[5];
        mark[0] = 89;
        mark[1] = 56;
        mark[2] = 88;
        mark[3] = 35;
        mark[4] = 65;
        int i = 0;
        System.out.println("\nMarks for students: ");
        
        for(i= 0; i<student.length;i++) {
            System.out.println(student[i]+" -> "+ mark[i]);
        }
    }
}