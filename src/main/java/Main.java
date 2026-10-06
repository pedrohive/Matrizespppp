public class Main {

    public static void main (String[] args){

                int[][] A = {{1, 2}, {6, 8}};

                int[][] B = {
                        {5, 5},
                        {7, -1}
                };

                int m = A.length;
                int n = A[0].length;
                int p = B[0].length;

                int[][] C = new int[m][p];

                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < p; j++) {
                        int soma = 0;
                        for (int k = 0; k < n; k++) {
                            soma += A[i][k] * B[k][j];
                        }
                        C[i][j] = soma;
                    }
                }

                // opcional: imprimir resultado
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < p; j++) {
                        System.out.print(C[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
