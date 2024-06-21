package MiPaquete;

public class QuizInt {
    public static void main(String[] args) {
        int[] sizes = { 4, 18, 5, 20 };
        for (int tamaños : sizes) {
            if (tamaños > 16) {
                break;
            }
            System.out.println("Size: " + tamaños + ", ");
        }
    }
}
