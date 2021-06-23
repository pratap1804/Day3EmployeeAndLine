public class UserCase4 {

    static int Wage_Per_Hour=20;
    static int Full_Day_Hour=8;
    static int Part_Time_Hour=4;


    public static void main(String[] args) {
        System.out.println("Welcome to the employee wage problem");

        int n =(int)((Math.random()*10)%3);

        switch(n){
            case 0:
                System.out.println("Employee is Absent");
                System.out.println("Total Wage is: "+0);
                break;
            case 1:
                System.out.println("Employee is Present");
                    int totalWage = Wage_Per_Hour * Full_Day_Hour;
                        System.out.println("Total Wage is: " + totalWage);
                break;
            case 2:
                System.out.println("Employee is PartTime Present");
                    int totalWage1= Wage_Per_Hour* Part_Time_Hour;
                        System.out.println("Total Wage is: " + totalWage1);
            default:
                System.out.println("Unwanted Result");
                break;
                }


        }
    }
