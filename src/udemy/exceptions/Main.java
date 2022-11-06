package udemy.exceptions;

public class Main {
    public static void main(String[] args) {

        try {
            int exceptionTest = 1 / 0;
        }  catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally comment");
        }

        try {
            throw new OwnExecption();
        } catch (OwnExecption exception) {
            exception.printStackTrace();
        }
    }
}
