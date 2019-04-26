import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class TestSalario
{


    @DisplayName("Teste IR")    
    @ParameterizedTest
    @CsvSource({"Gabriel, 10000.0, 900", "Gabriela, 2000, 100", "Luiz, 25000, 2700"})
    public void testIR(String nome , double val, double rEsp)
    {
        Funcionario f = new Funcionario(nome, val);
        double ir = f.getIR();
        assertEquals(rEsp, ir);
    }
}