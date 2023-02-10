
/*If the bill was $150.00, split between 5 people, with 12% tip. 
#Each person should pay (150.00 / 5) * 1.12 = 33.6
#Format the result to 2 decimal places = 33.60
#Tip: There are 2 ways to round a number. You might have to do some Googling to solve this.💪

#Write your code below this line 👇
*/
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to the tip calculator");
    Scanner sc = new Scanner(System.in);
    System.out.print("What was the total Bill? $");
    Float totalBill = sc.nextFloat();
    System.out.print("What percentage tip would you like to give? 10, 12 or 15? ");
    int percentTip = sc.nextInt();
    System.out.print("How many people to split the bill? ");
    int numPeople = sc.nextInt();
    Float eachPays = (totalBill / numPeople) *
        ((percentTip + 100) / 100);
    System.out.printf("Each person should pay:%.2f", eachPays);
    sc.close();
  }
}