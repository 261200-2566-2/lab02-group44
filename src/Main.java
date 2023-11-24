import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        AirPurifier air1 = new AirPurifier("2022","5055");
        String currentInput;
        System.out.println("________________________");
        System.out.println("Hello my name is Airmi. Do you want my help?(y/n)");
        Scanner helpInput = new Scanner(System.in);
        currentInput= helpInput.nextLine();
        if("y".equals(currentInput.toLowerCase()))
        {
            System.out.println("Power on (press '1') | AirPurifier detail (press '2') ");
            Scanner detailInput = new Scanner(System.in);
            currentInput= detailInput.nextLine();
            if(currentInput.equals("1"))
            {
                air1.TurnOn();
                while(true) {
                    System.out.println("Change volume ('1') | Turn off ('2')");
                    System.out.println("______••Running••______");
                    Scanner volInput = new Scanner(System.in);
                    currentInput = volInput.nextLine();
                    if (currentInput.equals("1")) {
                        System.out.println("what level do you want?(0-100)");
                        Scanner levelInput = new Scanner(System.in);
                        try {
                            int intCurrentInput = levelInput.nextInt();
                            if (intCurrentInput > 0 && intCurrentInput <= 100) {
                                air1.ChangeVolume(intCurrentInput);
                            } else {
                                System.out.println("________________________");
                                System.out.println("try later!");
                                System.out.println("________________________");
                            }
                        } catch (Exception e) {
                            System.out.println("________________________");
                            System.out.println("You key wrong!");
                            System.out.println("________________________");
                        }


                    } else if (currentInput.equals("2")) {
                        air1.TurnOff();
                        break;
                    }
                }
            }else if(currentInput.equals("2"))
            {
                air1.ShowDetail();

            }
            else
            {
                System.out.println("________________________");
                System.out.println(currentInput+" is not the answer!");
                System.out.println("________________________");
            }
        }else if("n".equals(currentInput.toLowerCase()))
        {
            System.out.println("________________________");
            System.out.println("byebye ♥");
            System.out.println("________________________");
        }
        else
        {
            System.out.println("________________________");
            System.out.println(currentInput+" is not the answer!");
            System.out.println("________________________");
        }

        }
    }
