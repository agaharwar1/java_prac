class pyramidstar {

public static void main(String args[]) {

        for(int a=1;a<=8;a++) {
            for (int b = 8; b >= a; b--) {
                System.out.print(" ");

            }
            for (int j = 1; j < (a * 2); j++) {
                if(j>1 && j<(a*2)-1)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");

            }}
            System.out.println();
        }    }
}
