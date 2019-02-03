class Diamond {
    public static void printShape(int line){
        for (int i=1; i<=line; i++) {
            for (int j=0; j<(2*line-1-i); j++)
                System.out.print(" ");
            for (int j=0; j<(2*i-1); j++)
                System.out.print("1");
            System.out.println();
        }

        for (int i=1; i<=line-1; i++) {
            for (int j=0; j<line-1-i; j++)
                System.out.print(" ");
            for (int j=0; j<line; j++)
                System.out.print("1");
            for (int j=0; j<(2*i-1); j++)
                System.out.print(" ");
            for (int j=0; j<line; j++)
                System.out.print("1");
            System.out.println();
        }

        for (int i=1; i<=line-2; i++) {
            for (int j=0; j<i; j++)
                System.out.print(" ");
            for (int j=0; j<line; j++)
                System.out.print("1");
            for (int j=0; j<((2*line-3)-2*i); j++)
                System.out.print(" ");
            for (int j=0; j<line; j++)
                System.out.print("1");
            System.out.println();
        }
        for (int i=1; i<=line; i++) {
            for (int j=0; j<line-2+i; j++)
                System.out.print(" ");
            for (int j=0; j<((2*line+1)-2*i); j++)
                System.out.print("1");
            System.out.println();
        }
    }
    public static void main(String[] args){
        printShape(11);
    }
}
