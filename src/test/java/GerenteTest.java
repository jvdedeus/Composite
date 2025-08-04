import org.example.*;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {
    @Test
    void testGerenteComSubordinados() {
        FuncionarioComponent funcionario1 = new Funcionario("João", 2000);
        FuncionarioComponent funcionario2 = new Funcionario("Maria", 2500);

        FuncionarioComponent gerenteIntermediario = new Gerente("Carlos", 4000);
        gerenteIntermediario.adicionar(funcionario1);
        gerenteIntermediario.adicionar(funcionario2);

        FuncionarioComponent gerentePrincipal = new Gerente("Ana", 6000);
        gerentePrincipal.adicionar(gerenteIntermediario);
        gerentePrincipal.adicionar(new Funcionario("Pedro", 2200));

        List<FuncionarioComponent> subGerentePrincipal = gerentePrincipal.getSubordinados();
        assertEquals(2, subGerentePrincipal.size());
        assertTrue(subGerentePrincipal.contains(gerenteIntermediario));

        List<FuncionarioComponent> subGerenteIntermediario = gerenteIntermediario.getSubordinados();
        assertEquals(2, subGerenteIntermediario.size());
        assertTrue(subGerenteIntermediario.contains(funcionario1));
        assertTrue(subGerenteIntermediario.contains(funcionario2));
    }
}

