



import java.util.Objects;

/**
 *
 * @author HP
 */
public class Client {
        private String Email;
        private String password;
          private String Nom;
            private String prenom;
public Client( String Email,String password, String Nom,String prenom){
      this.Email=Email;
       this.password=password;
        this.prenom=prenom;
         this.Nom=Nom;
         
              
      
}

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "client{" + "Email=" + Email + ", password=" + password + ", Nom=" + Nom + ", prenom=" + prenom + '}';
    }
   

  
  



}




