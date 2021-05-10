package fifthteen_Overload.itogovie.patterni;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }
    public static Planet thePlanet;

    static {
     readKeyFromConsoleAndInitPlanet();
    }
    public static void readKeyFromConsoleAndInitPlanet(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            if(s.equals(Sun.SUN))
            {
                Planet sun = new Sun();
                thePlanet=sun;
            }
            else if(s.equals(Sun.EARTH))
            {
                Planet earth = new Earth();
                thePlanet=earth;
            }
            else if(s.equals(Sun.MOON))
            {
                Planet moon = new Moon();
                thePlanet=moon;
            }
            else
                thePlanet = null;

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
