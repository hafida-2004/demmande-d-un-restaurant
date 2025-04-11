import static junit.framework.Assert.assertEquals;
import org.junit.Test;
public class ClientTest {


    @Test
    public void testConstructorAndGetters() {
        Client client = new Client("test@example.com", "password123", "Doe", "John");

        assertEquals("test@example.com", client.getEmail());
        assertEquals("password123", client.getPassword());
        assertEquals("Doe", client.getNom());
        assertEquals("John", client.getPrenom());
    }

    @Test
    public void testSetters() {
        Client client = new Client("", "", "", "");

        client.setEmail("new@example.com");
        client.setPassword("newpass");
        client.setNom("Smith");
        client.setPrenom("Jane");

        assertEquals("new@example.com", client.getEmail());
        assertEquals("newpass", client.getPassword());
        assertEquals("Smith", client.getNom());
        assertEquals("Jane", client.getPrenom());
    }

    @Test
    public void testToString() {
        Client client = new Client("a@b.com", "pass", "Nom", "Prenom");
        String expected = "client{Email=a@b.com, password=pass, Nom=Nom, prenom=Prenom}";
        assertEquals(expected, client.toString());
    }
}
