/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.events.*;
import com.codename1.ui.plaf.*;
import com.codename1.ui.util.*;
import java.util.Hashtable;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("MultiList", com.codename1.ui.list.MultiList.class);
        UIBuilder.registerCustomComponent("SpanLabel", com.codename1.components.SpanLabel.class);
        UIBuilder.registerCustomComponent("MultiButton", com.codename1.components.MultiButton.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Main";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("Tabs", com.codename1.ui.Tabs.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("MultiList", com.codename1.ui.list.MultiList.class);
        UIBuilder.registerCustomComponent("SpanLabel", com.codename1.components.SpanLabel.class);
        UIBuilder.registerCustomComponent("MultiButton", com.codename1.components.MultiButton.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Main");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.components.SpanLabel findUpgradePrice3(Component root) {
        return (com.codename1.components.SpanLabel)findByName("UpgradePrice3", root);
    }

    public com.codename1.components.SpanLabel findUpgradePrice3() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("UpgradePrice3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("UpgradePrice3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findUpgradePrice4(Component root) {
        return (com.codename1.components.SpanLabel)findByName("UpgradePrice4", root);
    }

    public com.codename1.components.SpanLabel findUpgradePrice4() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("UpgradePrice4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("UpgradePrice4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findUpgradePrice1(Component root) {
        return (com.codename1.components.SpanLabel)findByName("UpgradePrice1", root);
    }

    public com.codename1.components.SpanLabel findUpgradePrice1() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("UpgradePrice1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("UpgradePrice1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findUpgradePrice2(Component root) {
        return (com.codename1.components.SpanLabel)findByName("UpgradePrice2", root);
    }

    public com.codename1.components.SpanLabel findUpgradePrice2() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("UpgradePrice2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("UpgradePrice2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findInfolbl(Component root) {
        return (com.codename1.components.SpanLabel)findByName("Infolbl", root);
    }

    public com.codename1.components.SpanLabel findInfolbl() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("Infolbl", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("Infolbl", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findGameTitlelbl(Component root) {
        return (com.codename1.components.SpanLabel)findByName("GameTitlelbl", root);
    }

    public com.codename1.components.SpanLabel findGameTitlelbl() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("GameTitlelbl", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("GameTitlelbl", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findMMainCon(Component root) {
        return (com.codename1.ui.Container)findByName("MMainCon", root);
    }

    public com.codename1.ui.Container findMMainCon() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("MMainCon", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("MMainCon", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findAddVol(Component root) {
        return (com.codename1.components.MultiButton)findByName("AddVol", root);
    }

    public com.codename1.components.MultiButton findAddVol() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("AddVol", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("AddVol", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findSpacing1(Component root) {
        return (com.codename1.components.SpanLabel)findByName("Spacing1", root);
    }

    public com.codename1.components.SpanLabel findSpacing1() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("Spacing1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("Spacing1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findExitbtn(Component root) {
        return (com.codename1.ui.Button)findByName("Exitbtn", root);
    }

    public com.codename1.ui.Button findExitbtn() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Exitbtn", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Exitbtn", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findBackgroundCon(Component root) {
        return (com.codename1.ui.Container)findByName("BackgroundCon", root);
    }

    public com.codename1.ui.Container findBackgroundCon() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("BackgroundCon", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("BackgroundCon", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findUpgradesList(Component root) {
        return (com.codename1.ui.Container)findByName("UpgradesList", root);
    }

    public com.codename1.ui.Container findUpgradesList() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("UpgradesList", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("UpgradesList", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findUpgradeThreeBuy(Component root) {
        return (com.codename1.components.MultiButton)findByName("UpgradeThreeBuy", root);
    }

    public com.codename1.components.MultiButton findUpgradeThreeBuy() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("UpgradeThreeBuy", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("UpgradeThreeBuy", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findPassivelbl(Component root) {
        return (com.codename1.components.SpanLabel)findByName("Passivelbl", root);
    }

    public com.codename1.components.SpanLabel findPassivelbl() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("Passivelbl", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("Passivelbl", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findAddMusc(Component root) {
        return (com.codename1.components.MultiButton)findByName("AddMusc", root);
    }

    public com.codename1.components.MultiButton findAddMusc() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("AddMusc", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("AddMusc", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findHighscoreListCon(Component root) {
        return (com.codename1.ui.Container)findByName("HighscoreListCon", root);
    }

    public com.codename1.ui.Container findHighscoreListCon() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("HighscoreListCon", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("HighscoreListCon", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findCounterlbl(Component root) {
        return (com.codename1.components.SpanLabel)findByName("Counterlbl", root);
    }

    public com.codename1.components.SpanLabel findCounterlbl() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("Counterlbl", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("Counterlbl", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findTopCon(Component root) {
        return (com.codename1.ui.Container)findByName("TopCon", root);
    }

    public com.codename1.ui.Container findTopCon() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("TopCon", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("TopCon", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.list.MultiList findMultiList(Component root) {
        return (com.codename1.ui.list.MultiList)findByName("MultiList", root);
    }

    public com.codename1.ui.list.MultiList findMultiList() {
        com.codename1.ui.list.MultiList cmp = (com.codename1.ui.list.MultiList)findByName("MultiList", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.list.MultiList)findByName("MultiList", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findSpanLabel(Component root) {
        return (com.codename1.components.SpanLabel)findByName("SpanLabel", root);
    }

    public com.codename1.components.SpanLabel findSpanLabel() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findVolumelbl(Component root) {
        return (com.codename1.components.SpanLabel)findByName("Volumelbl", root);
    }

    public com.codename1.components.SpanLabel findVolumelbl() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("Volumelbl", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("Volumelbl", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findLowCon(Component root) {
        return (com.codename1.ui.Container)findByName("LowCon", root);
    }

    public com.codename1.ui.Container findLowCon() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("LowCon", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("LowCon", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findLowerVol(Component root) {
        return (com.codename1.components.MultiButton)findByName("LowerVol", root);
    }

    public com.codename1.components.MultiButton findLowerVol() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("LowerVol", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("LowerVol", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findCRlbl(Component root) {
        return (com.codename1.ui.Label)findByName("CRlbl", root);
    }

    public com.codename1.ui.Label findCRlbl() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("CRlbl", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("CRlbl", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findVolume(Component root) {
        return (com.codename1.ui.Container)findByName("Volume", root);
    }

    public com.codename1.ui.Container findVolume() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Volume", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Volume", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findMusiclbl(Component root) {
        return (com.codename1.components.SpanLabel)findByName("Musiclbl", root);
    }

    public com.codename1.components.SpanLabel findMusiclbl() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("Musiclbl", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("Musiclbl", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findLbl(Component root) {
        return (com.codename1.components.SpanLabel)findByName("lbl", root);
    }

    public com.codename1.components.SpanLabel findLbl() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("lbl", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("lbl", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findCBlbl(Component root) {
        return (com.codename1.ui.Label)findByName("CBlbl", root);
    }

    public com.codename1.ui.Label findCBlbl() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("CBlbl", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("CBlbl", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Tabs findTabs(Component root) {
        return (com.codename1.ui.Tabs)findByName("Tabs", root);
    }

    public com.codename1.ui.Tabs findTabs() {
        com.codename1.ui.Tabs cmp = (com.codename1.ui.Tabs)findByName("Tabs", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Tabs)findByName("Tabs", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findReturnbtn(Component root) {
        return (com.codename1.ui.Button)findByName("Returnbtn", root);
    }

    public com.codename1.ui.Button findReturnbtn() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Returnbtn", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Returnbtn", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findUpgradeDesc1(Component root) {
        return (com.codename1.components.SpanLabel)findByName("UpgradeDesc1", root);
    }

    public com.codename1.components.SpanLabel findUpgradeDesc1() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("UpgradeDesc1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("UpgradeDesc1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.list.MultiList findHighscoreList(Component root) {
        return (com.codename1.ui.list.MultiList)findByName("HighscoreList", root);
    }

    public com.codename1.ui.list.MultiList findHighscoreList() {
        com.codename1.ui.list.MultiList cmp = (com.codename1.ui.list.MultiList)findByName("HighscoreList", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.list.MultiList)findByName("HighscoreList", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findUpgradeDesc2(Component root) {
        return (com.codename1.components.SpanLabel)findByName("UpgradeDesc2", root);
    }

    public com.codename1.components.SpanLabel findUpgradeDesc2() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("UpgradeDesc2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("UpgradeDesc2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findPassivePlaceholderlbl(Component root) {
        return (com.codename1.components.SpanLabel)findByName("PassivePlaceholderlbl", root);
    }

    public com.codename1.components.SpanLabel findPassivePlaceholderlbl() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("PassivePlaceholderlbl", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("PassivePlaceholderlbl", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findUpgradeDesc3(Component root) {
        return (com.codename1.components.SpanLabel)findByName("UpgradeDesc3", root);
    }

    public com.codename1.components.SpanLabel findUpgradeDesc3() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("UpgradeDesc3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("UpgradeDesc3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findUpgradeDesc4(Component root) {
        return (com.codename1.components.SpanLabel)findByName("UpgradeDesc4", root);
    }

    public com.codename1.components.SpanLabel findUpgradeDesc4() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("UpgradeDesc4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("UpgradeDesc4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findPayoutbtn(Component root) {
        return (com.codename1.ui.Button)findByName("Payoutbtn", root);
    }

    public com.codename1.ui.Button findPayoutbtn() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Payoutbtn", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Payoutbtn", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findLowerMusc(Component root) {
        return (com.codename1.components.MultiButton)findByName("LowerMusc", root);
    }

    public com.codename1.components.MultiButton findLowerMusc() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("LowerMusc", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("LowerMusc", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findOptionslbl(Component root) {
        return (com.codename1.ui.Button)findByName("Optionslbl", root);
    }

    public com.codename1.ui.Button findOptionslbl() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Optionslbl", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Optionslbl", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findUpgradeName2(Component root) {
        return (com.codename1.components.SpanLabel)findByName("UpgradeName2", root);
    }

    public com.codename1.components.SpanLabel findUpgradeName2() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("UpgradeName2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("UpgradeName2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findPlaceholderlbl(Component root) {
        return (com.codename1.components.SpanLabel)findByName("Placeholderlbl", root);
    }

    public com.codename1.components.SpanLabel findPlaceholderlbl() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("Placeholderlbl", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("Placeholderlbl", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findUpgradeName1(Component root) {
        return (com.codename1.components.SpanLabel)findByName("UpgradeName1", root);
    }

    public com.codename1.components.SpanLabel findUpgradeName1() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("UpgradeName1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("UpgradeName1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findActiveUpgrades(Component root) {
        return (com.codename1.ui.Container)findByName("ActiveUpgrades", root);
    }

    public com.codename1.ui.Container findActiveUpgrades() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("ActiveUpgrades", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("ActiveUpgrades", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findVerslbl(Component root) {
        return (com.codename1.ui.Label)findByName("Verslbl", root);
    }

    public com.codename1.ui.Label findVerslbl() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Verslbl", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Verslbl", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findUpgradeName4(Component root) {
        return (com.codename1.components.SpanLabel)findByName("UpgradeName4", root);
    }

    public com.codename1.components.SpanLabel findUpgradeName4() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("UpgradeName4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("UpgradeName4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findUpgradeName3(Component root) {
        return (com.codename1.components.SpanLabel)findByName("UpgradeName3", root);
    }

    public com.codename1.components.SpanLabel findUpgradeName3() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("UpgradeName3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("UpgradeName3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findGameScreen(Component root) {
        return (com.codename1.ui.Container)findByName("GameScreen", root);
    }

    public com.codename1.ui.Container findGameScreen() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("GameScreen", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("GameScreen", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findUpgradeFourBuy(Component root) {
        return (com.codename1.components.MultiButton)findByName("UpgradeFourBuy", root);
    }

    public com.codename1.components.MultiButton findUpgradeFourBuy() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("UpgradeFourBuy", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("UpgradeFourBuy", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findUsernamelbl(Component root) {
        return (com.codename1.components.SpanLabel)findByName("Usernamelbl", root);
    }

    public com.codename1.components.SpanLabel findUsernamelbl() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("Usernamelbl", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("Usernamelbl", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findMultiButton(Component root) {
        return (com.codename1.components.MultiButton)findByName("MultiButton", root);
    }

    public com.codename1.components.MultiButton findMultiButton() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("MultiButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("MultiButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findOptionCon(Component root) {
        return (com.codename1.ui.Container)findByName("OptionCon", root);
    }

    public com.codename1.ui.Container findOptionCon() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("OptionCon", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("OptionCon", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findPassiveUpgrades(Component root) {
        return (com.codename1.ui.Container)findByName("PassiveUpgrades", root);
    }

    public com.codename1.ui.Container findPassiveUpgrades() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("PassiveUpgrades", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("PassiveUpgrades", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findMidCon(Component root) {
        return (com.codename1.ui.Container)findByName("MidCon", root);
    }

    public com.codename1.ui.Container findMidCon() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("MidCon", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("MidCon", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findExitlbl(Component root) {
        return (com.codename1.ui.Button)findByName("Exitlbl", root);
    }

    public com.codename1.ui.Button findExitlbl() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Exitlbl", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Exitlbl", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findSpacing(Component root) {
        return (com.codename1.components.SpanLabel)findByName("Spacing", root);
    }

    public com.codename1.components.SpanLabel findSpacing() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("Spacing", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("Spacing", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findUpgradeOneBuy(Component root) {
        return (com.codename1.components.MultiButton)findByName("UpgradeOneBuy", root);
    }

    public com.codename1.components.MultiButton findUpgradeOneBuy() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("UpgradeOneBuy", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("UpgradeOneBuy", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findStartBtn(Component root) {
        return (com.codename1.ui.Button)findByName("StartBtn", root);
    }

    public com.codename1.ui.Button findStartBtn() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("StartBtn", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("StartBtn", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findActivePlaceholderlbl(Component root) {
        return (com.codename1.components.SpanLabel)findByName("ActivePlaceholderlbl", root);
    }

    public com.codename1.components.SpanLabel findActivePlaceholderlbl() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("ActivePlaceholderlbl", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("ActivePlaceholderlbl", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findClickerbtn(Component root) {
        return (com.codename1.ui.Button)findByName("Clickerbtn", root);
    }

    public com.codename1.ui.Button findClickerbtn() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Clickerbtn", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Clickerbtn", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findActivelbl(Component root) {
        return (com.codename1.components.SpanLabel)findByName("Activelbl", root);
    }

    public com.codename1.components.SpanLabel findActivelbl() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("Activelbl", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("Activelbl", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findSpanLabel1(Component root) {
        return (com.codename1.components.SpanLabel)findByName("SpanLabel1", root);
    }

    public com.codename1.components.SpanLabel findSpanLabel1() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findUpgradeTwoBuy(Component root) {
        return (com.codename1.components.MultiButton)findByName("UpgradeTwoBuy", root);
    }

    public com.codename1.components.MultiButton findUpgradeTwoBuy() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("UpgradeTwoBuy", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("UpgradeTwoBuy", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findMusic(Component root) {
        return (com.codename1.ui.Container)findByName("Music", root);
    }

    public com.codename1.ui.Container findMusic() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Music", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Music", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findUserInt(Component root) {
        return (com.codename1.ui.Container)findByName("UserInt", root);
    }

    public com.codename1.ui.Container findUserInt() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("UserInt", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("UserInt", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.SpanLabel findSpanLabel2(Component root) {
        return (com.codename1.components.SpanLabel)findByName("SpanLabel2", root);
    }

    public com.codename1.components.SpanLabel findSpanLabel2() {
        com.codename1.components.SpanLabel cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.SpanLabel)findByName("SpanLabel2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findMTopCon(Component root) {
        return (com.codename1.ui.Container)findByName("MTopCon", root);
    }

    public com.codename1.ui.Container findMTopCon() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("MTopCon", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("MTopCon", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findLogintxtfield(Component root) {
        return (com.codename1.ui.TextField)findByName("Logintxtfield", root);
    }

    public com.codename1.ui.TextField findLogintxtfield() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("Logintxtfield", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("Logintxtfield", aboutToShowThisContainer);
        }
        return cmp;
    }

    protected void exitForm(Form f) {
        if("Game".equals(f.getName())) {
            exitGame(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Options".equals(f.getName())) {
            exitOptions(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Endscreen".equals(f.getName())) {
            exitEndscreen(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitGame(Form f) {
    }


    protected void exitOptions(Form f) {
    }


    protected void exitEndscreen(Form f) {
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("Game".equals(f.getName())) {
            beforeGame(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Options".equals(f.getName())) {
            beforeOptions(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Endscreen".equals(f.getName())) {
            beforeEndscreen(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeGame(Form f) {
    }


    protected void beforeOptions(Form f) {
    }


    protected void beforeEndscreen(Form f) {
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("Game".equals(c.getName())) {
            beforeContainerGame(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Options".equals(c.getName())) {
            beforeContainerOptions(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Endscreen".equals(c.getName())) {
            beforeContainerEndscreen(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerGame(Container c) {
    }


    protected void beforeContainerOptions(Container c) {
    }


    protected void beforeContainerEndscreen(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("Game".equals(f.getName())) {
            postGame(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Options".equals(f.getName())) {
            postOptions(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Endscreen".equals(f.getName())) {
            postEndscreen(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postGame(Form f) {
    }


    protected void postOptions(Form f) {
    }


    protected void postEndscreen(Form f) {
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("Game".equals(c.getName())) {
            postContainerGame(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Options".equals(c.getName())) {
            postContainerOptions(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Endscreen".equals(c.getName())) {
            postContainerEndscreen(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerGame(Container c) {
    }


    protected void postContainerOptions(Container c) {
    }


    protected void postContainerEndscreen(Container c) {
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("Game".equals(rootName)) {
            onCreateGame();
            aboutToShowThisContainer = null;
            return;
        }

        if("Options".equals(rootName)) {
            onCreateOptions();
            aboutToShowThisContainer = null;
            return;
        }

        if("Endscreen".equals(rootName)) {
            onCreateEndscreen();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateGame() {
    }


    protected void onCreateOptions() {
    }


    protected void onCreateEndscreen() {
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("Game".equals(f.getName())) {
            getStateGame(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Options".equals(f.getName())) {
            getStateOptions(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Endscreen".equals(f.getName())) {
            getStateEndscreen(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateGame(Form f, Hashtable h) {
    }


    protected void getStateOptions(Form f, Hashtable h) {
    }


    protected void getStateEndscreen(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("Game".equals(f.getName())) {
            setStateGame(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Options".equals(f.getName())) {
            setStateOptions(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Endscreen".equals(f.getName())) {
            setStateEndscreen(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateGame(Form f, Hashtable state) {
    }


    protected void setStateOptions(Form f, Hashtable state) {
    }


    protected void setStateEndscreen(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }


    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("Game")) {
            if("Clickerbtn".equals(c.getName())) {
                onGame_ClickerbtnAction(c, event);
                return;
            }
            if("Payoutbtn".equals(c.getName())) {
                onGame_PayoutbtnAction(c, event);
                return;
            }
            if("UpgradeOneBuy".equals(c.getName())) {
                onGame_UpgradeOneBuyAction(c, event);
                return;
            }
            if("UpgradeThreeBuy".equals(c.getName())) {
                onGame_UpgradeThreeBuyAction(c, event);
                return;
            }
            if("UpgradeTwoBuy".equals(c.getName())) {
                onGame_UpgradeTwoBuyAction(c, event);
                return;
            }
            if("UpgradeFourBuy".equals(c.getName())) {
                onGame_UpgradeFourBuyAction(c, event);
                return;
            }
            if("Optionslbl".equals(c.getName())) {
                onGame_OptionslblAction(c, event);
                return;
            }
            if("Exitlbl".equals(c.getName())) {
                onGame_ExitlblAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Options")) {
            if("LowerVol".equals(c.getName())) {
                onOptions_LowerVolAction(c, event);
                return;
            }
            if("AddVol".equals(c.getName())) {
                onOptions_AddVolAction(c, event);
                return;
            }
            if("LowerMusc".equals(c.getName())) {
                onOptions_LowerMuscAction(c, event);
                return;
            }
            if("AddMusc".equals(c.getName())) {
                onOptions_AddMuscAction(c, event);
                return;
            }
            if("Returnbtn".equals(c.getName())) {
                onOptions_ReturnbtnAction(c, event);
                return;
            }
            if("Exitbtn".equals(c.getName())) {
                onOptions_ExitbtnAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Endscreen")) {
            if("MultiList".equals(c.getName())) {
                onEndscreen_MultiListAction(c, event);
                return;
            }
            if("HighscoreList".equals(c.getName())) {
                onEndscreen_HighscoreListAction(c, event);
                return;
            }
            if("ExitBtn".equals(c.getName())) {
                onEndscreen_ExitBtnAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Main")) {
            if("Logintxtfield".equals(c.getName())) {
                onMain_LogintxtfieldAction(c, event);
                return;
            }
            if("MultiButton".equals(c.getName())) {
                onMain_MultiButtonAction(c, event);
                return;
            }
            if("StartBtn".equals(c.getName())) {
                onMain_StartBtnAction(c, event);
                return;
            }
            if("ExitBtn".equals(c.getName())) {
                onMain_ExitBtnAction(c, event);
                return;
            }
        }
    }

      protected void onGame_ClickerbtnAction(Component c, ActionEvent event) {
      }

      protected void onGame_PayoutbtnAction(Component c, ActionEvent event) {
      }

      protected void onGame_UpgradeOneBuyAction(Component c, ActionEvent event) {
      }

      protected void onGame_UpgradeThreeBuyAction(Component c, ActionEvent event) {
      }

      protected void onGame_UpgradeTwoBuyAction(Component c, ActionEvent event) {
      }

      protected void onGame_UpgradeFourBuyAction(Component c, ActionEvent event) {
      }

      protected void onGame_OptionslblAction(Component c, ActionEvent event) {
      }

      protected void onGame_ExitlblAction(Component c, ActionEvent event) {
      }

      protected void onOptions_LowerVolAction(Component c, ActionEvent event) {
      }

      protected void onOptions_AddVolAction(Component c, ActionEvent event) {
      }

      protected void onOptions_LowerMuscAction(Component c, ActionEvent event) {
      }

      protected void onOptions_AddMuscAction(Component c, ActionEvent event) {
      }

      protected void onOptions_ReturnbtnAction(Component c, ActionEvent event) {
      }

      protected void onOptions_ExitbtnAction(Component c, ActionEvent event) {
      }

      protected void onEndscreen_MultiListAction(Component c, ActionEvent event) {
      }

      protected void onEndscreen_HighscoreListAction(Component c, ActionEvent event) {
      }

      protected void onEndscreen_ExitBtnAction(Component c, ActionEvent event) {
      }

      protected void onMain_LogintxtfieldAction(Component c, ActionEvent event) {
      }

      protected void onMain_MultiButtonAction(Component c, ActionEvent event) {
      }

      protected void onMain_StartBtnAction(Component c, ActionEvent event) {
      }

      protected void onMain_ExitBtnAction(Component c, ActionEvent event) {
      }

}
