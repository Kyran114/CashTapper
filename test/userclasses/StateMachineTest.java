/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userclasses;

import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

/**
 *
 * @author DenisSilvaMeira
 */
public class StateMachineTest {

    public StateMachineTest() {
    }

    @Test
    public void testInitVars() {
    }

    @Test
    public void testOnMain_MultiButtonAction() {
    }

    @Test
    public void testOnMain_StartBtnAction() {
    }

    @Test
    public void testOnMain_ExitBtnAction() {
    }

    @Test
    public void testBeforeGame() {
    }

    @Test
    public void testPostGame() {
    }

    @Test
    public void testOnGame_ClickerbtnAction() {
    }

    //Buyning Test 1* Bankvalue enough
    @Test
    public void testOnGame_UpgradeOneBuyAction() {
        //Arrange
        int price = 10;
        int oldprice = 10;
        int Bankvalue = 100;
        int ActiveIncome = 0;
        
        //act
        if (Bankvalue >= price) {
            ActiveIncome = ActiveIncome + 1;
            Bankvalue = Bankvalue - price;
            int newprice = oldprice + price;
        } 
        //assert
        assertEquals("Upgrade 1",90,Bankvalue,0.0);
    }

    //Buyning Test 2* Bankvalue too low
    @Test
    public void testOnGame_UpgradeTwoBuyAction() {
        //Arrange
        int price = 10;
        int oldprice = 10;
        int Bankvalue = 9;
        int PassiveIncome = 0;
        
        //act
        if (Bankvalue >= price) {
            PassiveIncome = PassiveIncome + 1;
            Bankvalue = Bankvalue - price;
            int newprice = oldprice + price;
        } else{ Bankvalue = 10000;}
        //assert
        assertEquals("Upgrade 2",10000,Bankvalue,0.0);
    }

    @Test
    public void testOnGame_UpgradeThreeBuyAction() {
    }

    @Test
    public void testOnGame_UpgradeFourBuyAction() {
    }

    @Test
    public void testOnGame_PayoutbtnAction() {
    }

    @Test
    public void testOnGame_ExitlblAction() {
    }

    @Test
    public void testOnGame_OptionslblAction() {
    }

    @Test
    public void testOnOptions_ReturnbtnAction() {
    }

    @Test
    public void testOnOptions_ExitbtnAction() {
    }

    @Test
    public void testOnOptions_LowerVolAction() {
    }

    @Test
    public void testOnOptions_AddVolAction() {
    }

    @Test
    public void testOnOptions_LowerMuscAction() {
    }

    @Test
    public void testOnOptions_AddMuscAction() {
    }

    @Test
    public void testOnEndscreen_ExitBtnAction() {
    }

    @Test
    public void testBeforeEndscreen() {
    }

    @Test
    public void testExitGame() {
    }

}
