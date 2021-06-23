public class UserCase2 {

    static int Wage_Per_Hour=20;
    static int Full_Day_Hour=8;
    public static void main(String[] args) {
        System.out.println("Welcome to the employee wage problem");

        int n =(int)((Math.random()*10)%2);
        if(n == 0) {
            System.out.println("Employee is Absent");
        }
        else {
            int totalWage = Wage_Per_Hour * Full_Day_Hour;
            System.out.println("Employee is Present");
            System.out.println("Total Wage is: " + totalWage);
        }
        }
    }
