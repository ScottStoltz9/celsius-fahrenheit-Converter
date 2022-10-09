public class Main {

    public static void main(String[] args) {

        System.out.println(celsiusToFahrenheit(20.2));

        System.out.println(fahrenheitToCelsius(70));

    }

    public static double celsiusToFahrenheit(double celsius) {

        return celsius = (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {

        return fahrenheit = (5.0 / 9) * (fahrenheit - 32);
    }
}