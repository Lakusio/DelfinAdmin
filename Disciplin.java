// Bibliotek definition
package DelfinAdmin;

// Kode blok
public class Disciplin
{
   private String navn;
 
   public Disciplin(String navn)
   {
      this.navn = navn;
   }
    
   // Getter og Setter
   public void setNavn (String navn)
   {
      this.navn = navn;
   }
   public String getNavn()
   {
      return navn;
   }
}