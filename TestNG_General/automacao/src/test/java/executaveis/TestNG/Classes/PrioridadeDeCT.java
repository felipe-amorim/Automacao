package executaveis.TestNG.Classes;

import org.testng.annotations.Test;

public class PrioridadeDeCT {
    @Test(priority = 2)
    public void testPrioridade1()
    {
        System.out.println("primeiro TestNG - prioridade ultimo");
    }
    @Test
    public void testPrioridade2()
    {
        System.out.println("segundo TestNG - prioridade default (0 / primeiro)");
    }
    @Test(priority = 1)
    public void testPrioridade3()
    {
        System.out.println("terceiro TestNG - prioridade segundo");
    }
}
