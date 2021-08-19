/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rechner.fxml;

/**
 *
 * @author A.Nguyen.inf19
 */
public class ZusatzMethoden {
    
    public double calculateByte(long number1, String operator){
        switch(operator){
            case "Inches":
                return number1 * 39.3701;
            case "Miles":
                return number1 * 0.000621371;
            case "Feet":
                return number1 * 3.28084;
            default: 
                return 0;
        }
}
}