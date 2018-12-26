package executaveis.TestNG.Classes;

import org.testng.annotations.Test;

public class GroupsDeCT {
    @Test(groups = {"honda", "sedan"})
    public void testHondaCivic()
    {
        System.out.println("Honda Civic");
    }
    @Test(groups = {"fiat", "ret"})
    public void testFiatUno()
    {
        System.out.println("Fiat Uno");
    }
    @Test(groups = {"fiat", "sedan"})
    public void testFiatSiena()
    {
        System.out.println("Fiat Siena");
    }
    @Test(groups = {"honda", "ret"})
    public void testHondaFit()
    {
        System.out.println("Honda Fit");
    }
    @Test(groups = {"motos"})
    public void testHondaMoto1()
    {
        System.out.println("Honda moto 1");
    }
    @Test(groups = {"motos"})
    public void testHondaMoto2()
    {
        System.out.println("Honda moto 2");
    }
}
