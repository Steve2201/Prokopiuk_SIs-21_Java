import java.util.Random;

class Determinant3x3 {
    public static void main(String[] args) {
        double[][] m = new double[3][3];
        Random rnd = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = rnd.nextDouble();
            }
        }

        double det =
                m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1]) -
                        m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0]) +
                        m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);

        System.out.println("Матриця:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%.4f ", m[i][j]);
            }
            System.out.println();
        }

        System.out.printf("Визначник = %.6f%n", det);
    }
}