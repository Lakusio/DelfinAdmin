// Bibliotek definition
package DelfinAdmin;

public class Status
{
    private String navn;
   
    public Status(String navn)
    {
      this.navn = navn;
    }
    
    public void setNavn (String navn)
    {
      this.navn = navn;
    }
    public String getNavn()
    {
      return navn;
    }
}