/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp;


/**
 *
 * @author DenisSilvaMeira
 */
public class Game {

    //Atribute Declaration
    public int ActiveIncome;
    public int PassiveIncome;
    public int Bankvalue;
    private String username;

//////////////////////////////////////////////////////////////////////////////////////
    public Game(int ActiveIncome, int PassiveIncome, int Bankvalue) {
        this.ActiveIncome = ActiveIncome;
        this.PassiveIncome = PassiveIncome;
        this.Bankvalue = Bankvalue;
    }
//////////////////////////////////////////////////////////////////////////////////////

    //Setters
    public void setActiveIncome(int ActiveIncome) {
        this.ActiveIncome = ActiveIncome;
    }

    public void setPassiveIncome(int PassiveIncome) {
        this.PassiveIncome = PassiveIncome;
    }

    public void setBankvalue(int Bankvalue) {
        this.Bankvalue = Bankvalue;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //////////////////////////////////////////////////////////////////////////////////////
    //Getters
    public int getActiveIncome() {
        return ActiveIncome;
    }

    public int getPassiveIncome() {
        return PassiveIncome;
    }

    public int getBankvalue() {
        return Bankvalue;
    }

    public String getUsername() {
        return username;
    }

//////////////////////////////////////////////////////////////////////////////////////
}
