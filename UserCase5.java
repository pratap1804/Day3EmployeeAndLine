public class UserCase5 {
static int Wage_Per_Hour=20;
    static int Full_Day_Hour=8;
    static int Part_Time_Hour=4;
    static int Working_Day_Per_Month =20;

    public static void main(String[] args) {
        System.out.println("Welcome to the employee wage problem");

        int n =(int)((Math.random()*10)%3);

        switch(n){
            case 0:
                System.out.println("Employee is Absent");
                System.out.println("Total Wage is: "+0);
                break;
            case 1:
                System.out.println("Employee is Full-Time Present");
                    int totalWage = Wage_Per_Hour * Full_Day_Hour*Working_Day_Per_Month;
                        System.out.println("Total Monthly Wage is: " + totalWage);
                break;
            case 2:
                System.out.println("Employee is Part-Time Present");
                    int totalWage1= Wage_Per_Hour* Part_Time_Hour*Working_Day_Per_Month;
                        System.out.println("Total Monthly Wage is: " + totalWage1);
                break;
            default:
                System.out.println("Unwanted Result");
                break;
                }


        }
    }
