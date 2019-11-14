/*
 * The Methods code for the Destriers
 * Created by Team Members Josh Faber
 */


package org.firstinspires.ftc.teamcode;
import java.lang.*;
import java.util.*;
import java.lang.Math;

public class Mech {

    //find the power for the front right and back left motors
    public static double FRBL (double x, double y)
        {
            double theta;
            try {
                theta = java.lang.Math.atan(y / x);
                if (x < 0) {
                    theta = theta + Math.PI;
                }
            } catch (Exception e) {
                if (y < 0) {
                    theta=-Math.PI/2;
                } else {
                    theta=Math.PI/2;
                }
            }

            theta=theta-(Math.PI/4);
            double power=java.lang.Math.sin(theta);

            return power;
        }


    //find the power for the front left and back right motors
    public static double FLBR (double x, double y)
    {
        double theta;
        try {
            theta = java.lang.Math.atan(y / x);
            if (x < 0) {
                theta = theta + Math.PI;
            }
        } catch (Exception e) {
            if (y < 0) {
                theta=-Math.PI/2;
            } else {
                theta=Math.PI/2;
            }
        }

        theta=theta-(Math.PI/4);
        double power=java.lang.Math.cos(theta);

        return power;
    }


}

