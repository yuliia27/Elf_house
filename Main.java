public class Main {

    public static void main(String[] args) {
        int john = 5 ;
        int hannah = 2;

        if ( john >= 7 ) {
            hannah = hannah + 3;
            john = john - 3;
        } else if (john < 7 && john > 3) {
            hannah = hannah + 2;
            john = john - 2;
        }

        System.out.println("Dima: " + john);
        System.out.println("Yuliia: " + hannah);
    }

    public static double calculate(int person1, int person2, int days) {
        int resultNoTax = (person1 + person2) * days;
        System.out.println("Result no tax: " + resultNoTax);
        double result = resultNoTax - (resultNoTax * 0.2);
        return result;
    }
}
