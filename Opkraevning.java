// Bibliotek definition
package DelfinAdmin;

// Implementerede biblioteker
import java.time.LocalDate;   // Bibliotek for dato og tid

// Kode Block
public class Opkraevning
{
   private int medlemsNummer;
   private int opkraevningsNummer;
   private double belob;
   private LocalDate forfaldsDato;
   private boolean betalt;

   // Constructor
   public Opkraevning(int medlemsNummer, int opkraevningsNummer, double belob, LocalDate forfaldsDato, boolean betalt)
   {
      this.medlemsNummer = medlemsNummer;
      this.opkraevningsNummer = opkraevningsNummer;
      this.belob = belob;
      this.forfaldsDato = forfaldsDato;
      this.betalt = betalt;
   }
   
   // Getter og setter
   public int getMedlemsNummer()
   {
      return this.medlemsNummer;
   }
   
   public int getOpkraevningsNummer()
   {
      return this.opkraevningsNummer;
   }
   
   public double getBelob()
   {
      return this.belob;
   }
   
   public LocalDate getForfaldsDato()
   {
      return this.forfaldsDato;
   }
   
   public void setBetalt(boolean betalt)
   {
      this.betalt = betalt;
   }
   public boolean getBetalt()
   {
      return this.betalt;
   }
}