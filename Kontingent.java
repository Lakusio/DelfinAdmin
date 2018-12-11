// Bibliotek definition
package DelfinAdmin;

// Kode blok
public class Kontingent
{
   private double junior;
   private double senior;
   private double passiv;
   private double aldersRabat;
   
   // Constructor
   public Kontingent()
   {
      this.junior = 0.00;
      this.senior = 0.00;
      this.passiv = 0.00;
      this.aldersRabat = 0.00;
   }
   
   // Metoder
   // Getter og Setter
   public void setJunior(double belob)
   {
      this.junior = belob;
   }
   public double getJunior()
   {
      return this.junior;
   }
   
   public void setSenior(double belob)
   {
      this.senior = belob;
   }
   public double getSenior()
   {
      return this.senior;
   }
   
   public void setPassiv (double belob)
   {
      this.passiv = belob;
   }
   public double getPassiv()
   {
      return this.passiv;
   }
   
   public void setAldersRabat (double rabatProcent)
   {
      this.aldersRabat = rabatProcent;
   }
   public double getAldersRabat()
   {
      return this.aldersRabat;
   }   
   
   public double getKontingent(int alder, int status)
   {
      if (status == 0) {return passiv;}
      if (alder < 18 ) {return junior;}
      if (alder < 60 ) {return senior;}
      return senior * (1-aldersRabat);
   }
}