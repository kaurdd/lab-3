import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int num;

    System.out.println("Enter a number to count down or up from: ");
    num = s.nextInt();


    {

    if (num >= 0)
    System.out.println();
    else if (num <= 0)
    System.out.println();

    }

    int c = (num);
    while(c > 0)
    {
      System.out.println(c);
      c -= 1;
     
    }

    
    while (c <= 0)
    {
      System.out.println(c);
      c += 1;
    }

    System.out.println("Blast off!");

  }
}
