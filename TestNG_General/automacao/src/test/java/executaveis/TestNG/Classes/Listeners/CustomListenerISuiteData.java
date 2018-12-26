package executaveis.TestNG.Classes.Listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class CustomListenerISuiteData implements ISuiteListener {
    @Override
    public void onStart(ISuite iSuite) {
        //Quando a suite começa - APENAS XML
        System.out.println("Suite começando: "+iSuite.getName());
    }

    @Override
    public void onFinish(ISuite iSuite) {
        //Quando a suite termina - APENAS XML
        System.out.println("Suite terminando: "+iSuite.getName());
    }
}
