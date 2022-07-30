public class atvd6 {

    public static void main(String[] args) {

        int mtrz1[][] = new int[5][7];
        int mtrz2[][] = new int[6][6];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if ((i >= 1) && (i <= 3)) {
                    if ((j >= 1) && (j <= 5)) {
                        mtrz1[i][j] = 2;
                    } else {
                        mtrz1[i][j] = 1;
                    }
                } else {
                    mtrz1[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == j) {
                    mtrz2[i][j] = 1;
                }
                if (mtrz2[i][j] == 0) {
                    mtrz2[i][j] = 3;
                }
            }
            mtrz2[i][5 - i] = 2;
        }

        System.out.println("");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(mtrz1[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(mtrz2[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
