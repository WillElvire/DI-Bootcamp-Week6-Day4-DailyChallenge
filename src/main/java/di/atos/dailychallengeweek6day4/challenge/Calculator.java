/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.dailychallengeweek6day4.challenge;

/*
 * @author Wilfried koua
 * @description the purpose of this code is to implement a small calculatrice witch can help us to master some bacis of java like class , affectation and other
 */

public class Calculator {
    // write class fields here
    private double firstNumber;
    private double secondNumber;

    public Calculator(double firstNumber, double secondNumber) {
        //write definition here
        this.secondNumber = secondNumber;
        this.firstNumber = firstNumber;
    }

    public double add() {
        //write definition here
        return this.firstNumber + this.secondNumber;
    }

    public double subtract() {
        //write definition here
        return this.firstNumber - this.secondNumber;
    }

    public double multiply() {
        //write definition here
        return this.firstNumber * this.secondNumber;
    }

    public double divide() {
        //write definition here
        return this.firstNumber / this.secondNumber;
    }

}

