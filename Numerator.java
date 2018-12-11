// Bibliotek definition
package DelfinAdmin;

// Kode Blok
public class Numerator
{
   private int medlemsNummer;
   private int opkraevningsNummer;

   // Constructor
   public Numerator()
   {
      this.medlemsNummer = 0;
      this.opkraevningsNummer = 0;
   }
   
   // Getter og setter
   public void setMedlemsStartNummer(int startNummer)
   {
      this.medlemsNummer = startNummer;
   }
   public int getMedlemsNummer()
   {
      this.medlemsNummer++;
      return this.medlemsNummer;
   }
   
   public void setOpkraevningStartNummer(int startNummer)
   {
      this.opkraevningsNummer = startNummer;
   }
   public int getOpkraevningsNummer()
   {
      this.opkraevningsNummer++;
      return this.opkraevningsNummer;
   }
}