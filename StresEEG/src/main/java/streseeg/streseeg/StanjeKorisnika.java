package streseeg.streseeg;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class StanjeKorisnika implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Stanje korisnika ID")
   private java.lang.Long stanjeKorisnikaId;
   @org.kie.api.definition.type.Label(value = "Mozdani valovi ID")
   private java.lang.Long mozdaniValoviId;

   public StanjeKorisnika()
   {
   }

   public java.lang.Long getStanjeKorisnikaId()
   {
      return this.stanjeKorisnikaId;
   }

   public void setStanjeKorisnikaId(java.lang.Long stanjeKorisnikaId)
   {
      this.stanjeKorisnikaId = stanjeKorisnikaId;
   }

   public java.lang.Long getMozdaniValoviId()
   {
      return this.mozdaniValoviId;
   }

   public void setMozdaniValoviId(java.lang.Long mozdaniValoviId)
   {
      this.mozdaniValoviId = mozdaniValoviId;
   }

   public StanjeKorisnika(java.lang.Long stanjeKorisnikaId,
         java.lang.Long mozdaniValoviId)
   {
      this.stanjeKorisnikaId = stanjeKorisnikaId;
      this.mozdaniValoviId = mozdaniValoviId;
   }

}