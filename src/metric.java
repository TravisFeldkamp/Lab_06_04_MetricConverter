import java.util.Scanner;//import scanner
public class metric {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meterMeas = 0;//initialize variable
        double inchesMeas = 0;//initialize variable
        double milesMeas = 0;//initialize variable
        double feetMeas = 0;//initialize variable
        String trash = "";// variable for invalid input


        System.out.println("Enter your measurement in meters");//output to user
        if (in.hasNextDouble()) {//if a double is inputed do this code block
            meterMeas = in.nextDouble();//user input stored as meterMeas
        }
        else {//if an invalid input is entered do this code block
            trash = in.nextLine();//user input stored as trash
            System.out.println("you have entered an invalid input: " + trash);//tell user they have entered invalid input and show the input
            System.out.println("rerun the program and try again");//output to user try again
            System.exit(0);//safely exit the program
        }
        inchesMeas = meterMeas * 39.37;//conversion of meter to inches
        feetMeas = inchesMeas / 12;//conversion of inches to feet
        milesMeas = feetMeas / 5280;//conversion of feet to miles
        System.out.println(meterMeas + " meters is " + inchesMeas + " inches");//output of inches
        System.out.println(meterMeas + " meters is " + feetMeas + " feet");//output of feet
        System.out.println(meterMeas+ " meters is " + milesMeas + " Miles" );//output of miles






    }

}