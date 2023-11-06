package FlightControl;

import FlightControl.ui.TextUI;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FlightControl flightControl = new FlightControl();
        TextUI ui = new TextUI(flightControl, new Scanner(System.in));
        ui.start();
    }
}