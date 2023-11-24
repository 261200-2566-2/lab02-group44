import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class AirPurifier {
    String model;
    String serialNo;
    boolean power;
    void TurnOn() { power = true;
        System.out.println("________________________");
        System.out.println("Power on 50% power•••");
    }


    void TurnOff(){
        power = false;
        System.out.println("________________________");
        System.out.println("Thank for using me♥");
        System.out.println("________________________");
    }

    void ShowDetail(){
        System.out.println("________________________");
        System.out.println("AirMi's air purifier");
        System.out.println("Year - "+model);
        System.out.println("Serial no - "+serialNo);
        System.out.println("Dimension - 50*50*100 cm^3");
        System.out.println("@Tayakorn Aowrattanakul");
        System.out.println("________________________");
    }

    void ChangeVolume(int vol){
        System.out.println("Updated");
        System.out.println("________________________");
        System.out.println("Power on "+vol+"% power•••");
    }


    public AirPurifier(String model, String serialNo){
        this.model = model;
        this.serialNo = serialNo;
    }

}
