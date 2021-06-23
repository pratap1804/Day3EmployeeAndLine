public class UserCase3 {

    static int Wage_Per_Hour=20;
    static int Full_Day_Hour=8;
    static int Part_Time_Hour=4;


    public static void main(String[] args) {
        System.out.println("Welcome to the employee wage problem");

        int n =(int)((Math.random()*10)%3);
        if(n == 0) {
            System.out.println("Employee is Absent");
        }
        else if (n ==1) {
            int totalWage = Wage_Per_Hour * Full_Day_Hour;
            System.out.println("Employee is Present");
            System.out.println("Total Wage is: " + totalWage);
        }
        else{
            System.out.println("Employee is PartTime Present");
            int totalWage= Wage_Per_Hour* Part_Time_Hour;
            System.out.println("Total Wage is: " + totalWage);
            }


        }
    }
