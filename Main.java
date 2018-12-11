// Bibliotek definition
package DelfinAdmin;

// Implementerede biblioteker
import java.util.Scanner;     // Anvendes til at aflæse indtastninger
import java.util.ArrayList;   // Alt liste funktionalitet
import java.time.LocalDate;   // Tid og dato håndtering
import java.time.format.DateTimeFormatter;

// Programlogik
public class Main
{  
   //-------Systemparametre----------
   public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
   public static int numDisciplin = 5;
   public static int numStatus = 2;
   public static int medlemsStartNummer = 1000;
   public static ArrayList<Opkraevning> Opkraevninger = new ArrayList();
   public static ArrayList<Medlem> Medlemmer = new ArrayList();
   public static Numerator Nummer = new Numerator();
   public static Disciplin[] Discipliner = new Disciplin[numDisciplin];
   public static Status[] MedlemsStatus = new Status[numStatus];
   public static Kontingent kontingent = new Kontingent();
   public static Scanner input = new Scanner(System.in);

   //--------Programflow
   public static void main(String[] args)
   {
      //-----Simuler Database----------
      InitierData();
      
      //-----Evaluer bruger navn og password-----
      Scanner input = new Scanner(System.in);
      String bruger;
      String kode;
      
      System.out.println("Folgenden bruger kan anvendes til login: ");
      System.out.println("Formand:  Bruger = formand \n          Kodeord = formand  ");
      System.out.println("Kasser:   Bruger = kasser \n          Kodeord = kasser  ");
      System.out.println("Traener:  Bruger = traener \n          Kodeord = traener \n");

      
      System.out.print("Brugernavn:");
      bruger = input.next();
      
      System.out.print("Kodeord:");
      kode = input.next();
      
      if(bruger.toLowerCase().equals("formand") && (kode.equals("formand")))
      {
         FormandMenu();
      }
      else if(bruger.toLowerCase().equals("kasser") && (kode.equals("kasser")))
      {
         KasserMenu();
      }
      else if(bruger.toLowerCase().equals("traener") && (kode.equals("traener")))
      {
         TraenerMenu();
      }
      else
      {
         System.out.print("Du er ikke Logget på");
      }  
   }

   public static void FormandMenu()
   {
      boolean exit = false;
      do
      {
         System.out.println("\nFormand menu");
         System.out.println("-----------");
         System.out.println("Du har nu folgende valg muligheder");
         System.out.println("1. Opret medlem");
         System.out.println("2. Opdater medlem");
         System.out.println("3. Print medlems liste");
         System.out.println("4. Slet medlem");
         System.out.println("x. Log ud");
         System.out.print("Indtast dit valg: ");
         String svar = input.next().toLowerCase();
         
         switch (svar)
         {
            case "1":   OpretMedlem();
                        break;
            case "2":   IkkeImplementeret();
                        break;
            case "3":   MedlemsListe();
                        break;
            case "4":   IkkeImplementeret();
                        break;
            case "x":   exit = true;
                        break;
            default: System.out.println("Ikke en tilladt valgmulighed.");
         }
      } while (!exit);   
   }
   public static void KasserMenu()
   {
      boolean exit = false;
      do
      {
         System.out.println("\nKasser menu");
         System.out.println("-----------");
         System.out.println("Du har nu folgende valg muligheder");
         System.out.println("1. Aendre kontingent og rabat");
         System.out.println("2. Udskriv restanceliste");
         System.out.println("3. Lav opkraevning");
         System.out.println("x. Log ud");
         System.out.print("Indtast dit valg: ");
         String svar = input.next().toLowerCase();
         
         switch (svar)
         {
            case "1":   IkkeImplementeret();
                        break;
            case "2":   RestanceListe();
                        break;
            case "3":   Opkraevning();
                        break;
            case "x":   exit = true;
                        break;
            default: System.out.println("Ikke en tilladt valgmulighed.");
         }
      } while (!exit);
   }
   
   public static void TraenerMenu()
   {
      boolean exit = false;
      do
      {
         System.out.println("\nTraener menu");
         System.out.println("-----------");
         System.out.println("Du har nu folgende valg muligheder");
         System.out.println("1. Tilfoj traenings resultater");
         System.out.println("2. Tilfoj Staevne info");
         System.out.println("x. Log ud");
         System.out.print("Indtast dit valg: ");
         String svar = input.next().toLowerCase();
         
         switch (svar)
         {
            case "1":   IkkeImplementeret();
                        break;
            case "2":   IkkeImplementeret();
                        break;
            case "x":   exit = true;
                        break;
            default: System.out.println("Ikke en tilladt valgmulighed.");
         }
      } while (!exit);
   }   
   public static boolean LogOffMenu()
   {
      String svar;
      System.out.print("Ønsker du at afslutte (J/N)?");
      svar = input.next();
      if (svar == "J" || svar == "j") return true;
      else return false;
      
  }   
   
   //---------Initiering af testdata-----
   public static void InitierData()
   {
   
      //----------Numerator----------
      Nummer.setMedlemsStartNummer(medlemsStartNummer);
      
      //----------Medlemsstatus----------
      // Her tilføjes de forskellige medlemsstatus
      MedlemsStatus[0] = new Status("Passiv");
      MedlemsStatus[1] = new Status("Aktiv");
      
      //----------Discipliner----------
      // Her tilføjes de forskellige svømmediscipliner
      Discipliner[0] = new Disciplin("Crawl");
      Discipliner[1] = new Disciplin("Ryg");
      Discipliner[2] = new Disciplin("Bryst");
      Discipliner[3] = new Disciplin("Fly");
      Discipliner[4] = new Disciplin("Medley");

      //----------Kontingenter----------
      kontingent.setPassiv(500.00);
      kontingent.setJunior(1000.00);
      kontingent.setSenior(1600.00);
      kontingent.setAldersRabat(0.25);
      
      //----------Medlemmer----------
      // Her tilføjes testmedlemmer til arraylisten
      Medlemmer.add(new Medlem(Nummer.getMedlemsNummer(), "Marc Wennerfeldt", 34, 1, 0));
      Medlemmer.add(new Medlem(Nummer.getMedlemsNummer(), "Maxwell Wennerfeldt", 4, 1, 1));
      Medlemmer.add(new Medlem(Nummer.getMedlemsNummer(), "Naja Wennerfeldt", 34, 0, 2));
      Medlemmer.add(new Medlem(Nummer.getMedlemsNummer(), "Ian Wennerfeldt", 62, 1, 3));

   }
   
   public static void MedlemsListe()
   {
      System.out.println("\nMedlemsliste pr. " + LocalDate.now() + "\n----------------------------");
      for (Medlem m : Medlemmer)
      {
         System.out.println("Medlem.nr. " + m.getId() + ", " + m.getNavn() + ", " + m.getAlder() + " aar. Status: " + MedlemsStatus[m.getMedlemsskab()].getNavn()
         + " inden for " + Discipliner[m.getDisciplin()].getNavn());
      }

   }
   
   public static void OpretMedlem()
   {
      System.out.println("\nOpret medlem\n-----------");
      System.out.println("Indtast navn (Fuldenavn): ");
      input.nextLine(); //Anvendes for at omgå nextLine fejl med at ignore indtastningsfeltet.
      String navn =  input.nextLine();
      System.out.println("Indtast alder: ");
      int alder = Integer.parseInt(input.nextLine());
      System.out.println("Indtast medlemsstatus (Passiv = 0, Aktiv = 1): ");
      int medlemsStatus = Integer.parseInt(input.nextLine());
      System.out.println("Indtast disciplin (Crawl = 0, Ryg = 1, Bryst = 2, Fly = 3, Medley = 4: ");
      int disciplin = Integer.parseInt(input.nextLine());
      
      Medlemmer.add(new Medlem(Nummer.getMedlemsNummer(), navn, alder, medlemsStatus, disciplin));
   }
   
   public static void Opkraevning()
   {
      System.out.print("Angiv forfaldsdato (dd/mm/yyyy): ");
      String date = input.next();
      LocalDate ForfaldsDato = LocalDate.parse(date, formatter);
      
      for (Medlem m : Medlemmer)
      {
         Opkraevninger.add(new Opkraevning(m.getId(), Nummer.getOpkraevningsNummer(), kontingent.getKontingent(m.getAlder(), m.getMedlemsskab()), ForfaldsDato, false));
      }
      
      //----------Udskrift af de producerede opkræninger----------
      System.out.println("\nOpkrævninger pr. " + ForfaldsDato + "\n----------------------------");
      for (Medlem m : Medlemmer)
      {
         System.out.println("Medlem.nr. " + m.getId() + ", " + m.getNavn() + ", " + m.getAlder() + " aar. Status: " + MedlemsStatus[m.getMedlemsskab()].getNavn()
         + " inden for " + Discipliner[m.getDisciplin()].getNavn() + ". Kontingent " + kontingent.getKontingent(m.getAlder(), m.getMedlemsskab()) );
      }
   }
   
   public static void RestanceListe()
   {
      System.out.print("Angiv skaeringsdato (dd/mm/yyyy): ");
      String date = input.next();
      LocalDate SkaeringsDato = LocalDate.parse(date, formatter);

      
      System.out.println("\nRestanceliste pr. " + SkaeringsDato + "\n----------------------------");
      
      for (Opkraevning o : Opkraevninger)
      {
         String BetalStatus;
         if (!o.getBetalt() &&  o.getForfaldsDato().isBefore(SkaeringsDato))
         {
            System.out.println("Medlem.nr. " + o.getMedlemsNummer() + ", Opkraevning nr: " + o.getOpkraevningsNummer() + ", Belob: " + o.getBelob() + " Forfalder: " + o.getForfaldsDato());
         }
      }
   }
   public static void IkkeImplementeret()
   {
      System.out.println("Ikke implementeret i nuvaerende udgave.");
   }
}

