package mgjo.method;

import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    System.out.println("main start");
    String str = callMe();

    System.out.println("넌 " + str + "이야!");

    System.out.println("main end");
  }

  protected static String callMe() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your name: ");
    String name = sc.nextLine();
    float bmi = calculateBmi();
    System.out.println("안녕, BMI " + bmi + "인 " + name + " 반가워!");

    String strWeight;
    if(bmi < 18.5) strWeight = "저체중";
    else if (bmi < 23) strWeight = "정상체중";
    else if (bmi < 25) strWeight = "과체중";
    else strWeight = "비만";
    return strWeight;
  }

  static float calculateBmi() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your height in m: ");
    float height = sc.nextFloat();
    sc.nextLine();
    System.out.println("Please enter your weight in kg: ");
    float weight = sc.nextFloat();
    sc.nextLine();
    float bmi = weight / (height * height);
    return bmi;
  }

}
