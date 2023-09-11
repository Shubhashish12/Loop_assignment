import java.util.Scanner;

public class result_subject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many subjects?");
        float subjects = sc.nextFloat();

        float marks = 0;
        for (int i = 0; i < subjects; i++)
        {
            System.out.println("Enter the marks in subjects");
            marks = marks + sc.nextFloat();
        }

        System.out.println("Total marks: " + marks);
        System.out.println("Assuming, full marks is " + subjects * 100);

        int percentage = (int) ((marks /(subjects * 100)) * 100);

        System.out.println("Your total marks in percentage is " + percentage + "%");

        if (percentage < 25)
        {
            System.out.println("Your Grade : D");
        }

        else if (percentage >= 25 && percentage < 50)
        {
            System.out.println("Your Grade : C ");
        }
        else if (percentage >= 50 && percentage < 75)
        {
            System.out.println("Your Grade : B ");
        }
        else if (percentage >= 75 && percentage < 90)
        {
            System.out.println("Your Grade : A");
        }

        else if (percentage >= 90 && percentage <= 100)
        {
            System.out.println("Your Grade : A+");
        }
        else
        {
            System.out.println("Invalid Percentage");
        }
    }
}
