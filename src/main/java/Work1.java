import java.util.Scanner;

public class Work1 {

    public static double bmi;
    public static int height;
    public static int feet;
    public static int inches;
    public static int weight;
    public static String status;


    public static void convertToInches (){

        height = feet * 12 + inches;

    }
    public static void bmiCalculator (){

        bmi = (weight * 703) / (height * height);


    }
    public static void weightStatus () {



        if (bmi < 18.5){
            status = "underweight";
        }
        else if (bmi <= 24.9){
            status = "normal";
        }
        else if (bmi <= 29.9){
            status = "overweight";
        }
        else if (bmi >= 30){
            status = "obese";
        }
    }

    public static void main (String[] args) {

        System.out.println("Put your height in ft and inches");
        Scanner sc = new Scanner(System.in);
        feet = sc.nextInt();
        inches = sc.nextInt();

        System.out.println("Put your weight in pounds");
        weight = sc.nextInt();


        System.out.println("Height: " + feet + " feet, " + inches + " inches");
        System.out.println("Weight: " + weight + " pounds");
        // call corresponding method to calculate:

        convertToInches();
        bmiCalculator();
        weightStatus();
        // now all of those method are executed.

        System.out.println("Your BMI is " + bmi );
        System.out.println(status);


    }}
