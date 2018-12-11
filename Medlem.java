// Bibliotek definition
package DelfinAdmin;

// Kode block
public class Medlem
{
   // Opretmedlem har 5 attributer.
   private int id;
   private String navn;
   private int alder;
   private int medlemsskab;   // enten aktivt eller passivt
   private int disciplin;     // Denne opsætning gør at et medlem kun kan være tilknyttet en disciplin.
   // Her er der mulighed for at oprette flere parameter for medlemmerne, 
   
   // Contructor
   public Medlem (int id, String navn, int alder, int medlemsskab, int disciplin)
   { 
      this.id = id;
      this.navn = navn;
      this.alder = alder;
      this.medlemsskab = medlemsskab;
      this.disciplin = disciplin;
   }
   
   // Getter og Setter
   public void setId (int id)
   {
      this.id = id;
   }
   public int getId ()
   {
      return this.id;
   }
   
   public void setNavn (String navn)
   {
      this.navn = navn;
   }
   public String getNavn ()
   {
      return this.navn;
   }
   
   public void setName (int nyAlder)
   {
      this.alder = alder;
   }
   public int getAlder ()
   {
      return this.alder;
   }
   
   public void setMedlemsskab (int medlemsskab)
   {
      this.medlemsskab = medlemsskab;
   }
   public int getMedlemsskab ()
   {
      return this.medlemsskab;
   }
   
   public void setDisciplin (int disciplin)
   {
      this.disciplin = disciplin;
   }
   public int getDisciplin ()
   {
      return this.disciplin;
   }
}