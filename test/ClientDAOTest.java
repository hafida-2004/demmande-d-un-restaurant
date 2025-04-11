
import java.sql.Connection;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Test;

public class ClientDAOTest {

    @Test
    public void testGetInstanceReturnsConnection() {
        Connection con = ClientDAO.getInstance();
        assertNotNull("La connexion ne doit pas être null", con);
    }

    @Test
    public void testConnectionIsValid() throws Exception {
        Connection con = ClientDAO.getInstance();
        assertNotNull("Connexion null, test impossible", con);
        assertTrue("La connexion doit être valide", con.isValid(2));
    }
}