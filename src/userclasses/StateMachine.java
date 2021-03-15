/**
 * Your application code goes here<br>
 * This file was generated by <a href="https://www.codenameone.com/">Codename
 * One</a> for the purpose of building native mobile applications using Java.
 */
package userclasses;

import com.codename1.io.Storage;
import com.codename1.ui.*;
import static com.codename1.ui.CN.exitApplication;
import com.codename1.ui.events.*;
import com.codename1.ui.list.DefaultListModel;
import com.codename1.ui.util.Resources;
import com.codename1.ui.util.UITimer;
import com.mycompany.myapp.Game;
import generated.StateMachineBase;
import java.util.HashMap;
import static jdk.nashorn.internal.runtime.JSType.toInteger;
/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {

    private Game game;
    private List<Game> gamelist;
    private UITimer timer;

    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }

    /**
     * this method should be used to initialize variables instead of the
     * constructor/class scope to avoid race conditions
     */
    @Override
    protected void initVars(Resources res) {
        game = new Game(1, 0, 0);
        //gamelist = new ArrayList<>();
        timer = new UITimer(() -> {
            findCounterlbl().setText(game.getBankvalue() + game.getPassiveIncome() + "");
            findCounterlbl().getParent().revalidate();

        });
    }

    //Object game Class Game
//////////////////////////////////////////////////////////////////////////////////////
    //Main Form Methods
    @Override
    protected void onMain_MultiButtonAction(Component c, ActionEvent event) {
        game.setUsername(findLogintxtfield().getText());
    }

    @Override
    protected void onMain_StartBtnAction(Component c, ActionEvent event
    ) {
        if (game.getUsername() != null && !"".equals(game.getUsername())) {
            showForm("Game", null);
        } else {
            showForm("Main", null);
        }
    }

    @Override
    protected void onMain_ExitBtnAction(Component c, ActionEvent event
    ) {
        exitApplication();
    }
//////////////////////////////////////////////////////////////////////////////////////
    //Game Form Methods

    @Override
    protected void beforeGame(Form f
    ) {

        findActivePlaceholderlbl().setText(game.getActiveIncome() + "");
        findPassivePlaceholderlbl().setText(game.getPassiveIncome() + "");
        findCounterlbl().setText(game.getBankvalue() + "");
        findUsernamelbl().setText("Username: " + game.getUsername());
    }

    @Override
    protected void postGame(Form f) {
        timer = new UITimer(() -> {
            game.setBankvalue(game.getBankvalue() + game.getPassiveIncome());
            findCounterlbl().setText(game.getBankvalue() + "");
            findCounterlbl().getParent().revalidate();

        });
        timer.schedule(1000, true, f);
    }

    @Override
    protected void onGame_ClickerbtnAction(Component c, ActionEvent event
    ) {
        game.Bankvalue = game.ActiveIncome + game.Bankvalue;
        findCounterlbl().setText(game.getBankvalue() + "");
    }

    @Override
    protected void onGame_UpgradeOneBuyAction(Component c, ActionEvent event
    ) {
        int price;
        price = toInteger(findUpgradePrice1().getText());
        if (game.Bankvalue >= price) {
            game.ActiveIncome = game.ActiveIncome + 1;
            game.Bankvalue = game.Bankvalue - price;
            findActivePlaceholderlbl().setText(game.getActiveIncome() + "");
            findCounterlbl().setText(game.getBankvalue() + "");
            int oldprice = toInteger(findUpgradePrice1().getText());
            int newprice = oldprice + price;
            findUpgradePrice1().setText(newprice + "");
        } else {
        }
    }

    @Override
    protected void onGame_UpgradeTwoBuyAction(Component c, ActionEvent event
    ) {
        int price;
        price = toInteger(findUpgradePrice2().getText());
        if (game.Bankvalue >= price) {
            game.PassiveIncome = game.PassiveIncome + 5;
            game.Bankvalue = game.Bankvalue - price;
            findPassivePlaceholderlbl().setText(game.getPassiveIncome() + "");
            findCounterlbl().setText(game.getBankvalue() + "");
            int oldprice = toInteger(findUpgradePrice2().getText());
            int newprice = oldprice + price;
            findUpgradePrice2().setText(newprice + "");
        } else {
        }
    }

    @Override
    protected void onGame_UpgradeThreeBuyAction(Component c, ActionEvent event
    ) {
        int price;
        price = toInteger(findUpgradePrice3().getText());
        if (game.Bankvalue >= price) {
            game.ActiveIncome = game.ActiveIncome + 10;
            game.Bankvalue = game.Bankvalue - price;
            findActivePlaceholderlbl().setText(game.getActiveIncome() + "");
            findCounterlbl().setText(game.getBankvalue() + "");
            int oldprice = toInteger(findUpgradePrice3().getText());
            int newprice = oldprice + price;
            findUpgradePrice3().setText(newprice + "");
        } else {
        }
    }

    protected void onGame_UpgradeFourBuyAction(Component c, ActionEvent event) {
        int price;
        price = toInteger(findUpgradePrice4().getText());
        if (game.Bankvalue >= price) {
            game.PassiveIncome = game.PassiveIncome + 50;
            game.Bankvalue = game.Bankvalue - price;
            findPassivePlaceholderlbl().setText(game.getPassiveIncome() + "");
            findCounterlbl().setText(game.getBankvalue() + "");
            int oldprice = toInteger(findUpgradePrice4().getText());
            int newprice = oldprice + price;
            findUpgradePrice4().setText(newprice + "");
        } else {
        }
    }

    @Override
    protected void onGame_PayoutbtnAction(Component c, ActionEvent event) {
        saveStorageData();
        showForm("Endscreen", null);
    }

    @Override
    protected void onGame_ExitlblAction(Component c, ActionEvent event) {
        exitApplication();

    }

    @Override
    protected void onGame_OptionslblAction(Component c, ActionEvent event) {
        showForm("Options", null);
        timer.cancel();

    }
//////////////////////////////////////////////////////////////////////////////////////
    //Options Form Methods not used because Mediamanger was not being a bitch in Codename One and didn't want to read mp3 or wav files.

    @Override
    protected void onOptions_ReturnbtnAction(Component c, ActionEvent event) {
        showForm("Game", null);
    }

    @Override
    protected void onOptions_ExitbtnAction(Component c, ActionEvent event) {
        exitApplication();
    }

    @Override
    protected void onOptions_LowerVolAction(Component c, ActionEvent event) {

    }

    @Override
    protected void onOptions_AddVolAction(Component c, ActionEvent event) {

    }

    @Override
    protected void onOptions_LowerMuscAction(Component c, ActionEvent event) {

    }

    @Override
    protected void onOptions_AddMuscAction(Component c, ActionEvent event) {

    }
//////////////////////////////////////////////////////////////////////////////////////
    // Exit Form Methods

    @Override
    protected void onEndscreen_ExitBtnAction(Component c, ActionEvent event) {
        exitApplication();
    }
//////////////////////////////////////////////////////////////////////////////////////
    //Display all Objects Game in gamelist List

    private void readStorageData() {
        gamelist = (List<Game>) (java.util.List<Game>) Storage.getInstance().readObject("gamelist");
        if (gamelist == null) {
            gamelist = new List<>();
        }
    }
//save Object game on Storage

    private void saveStorageData() {
        Storage.getInstance().writeObject("game", gamelist);
    }

    @Override
    protected void beforeEndscreen(Form f) {
        readStorageData();
        
    }

    // used for Dataoutput into multilist
    protected boolean initListModelHighscoreList(List cmp) {
        readStorageData();
        DefaultListModel model = new DefaultListModel();

        for (Game highscore : (java.util.List<Game>) Storage.getInstance().readObject("gamelist")) {
            HashMap entry = new HashMap<String, Object>();
            entry.put("Line1", highscore.getUsername());
            entry.put("Line2", highscore.getBankvalue());
            entry.put("gamelist", highscore);
            model.addItem(entry);

        }
        cmp.setModel(model);
        return true;

    }

    @Override
    protected void exitGame(Form f) {
        saveStorageData();
    }
}
