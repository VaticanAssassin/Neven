package streseeg.streseeg;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class GPS implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "GPS Lokacija ID")
   private java.lang.Long gpsLokacijaId;
   @org.kie.api.definition.type.Label(value = "Lokacija")
   private java.lang.String lokacija;

   public GPS()
   {
   }

   public java.lang.Long getGpsLokacijaId()
   {
      return this.gpsLokacijaId;
   }

   public void setGpsLokacijaId(java.lang.Long gpsLokacijaId)
   {
      this.gpsLokacijaId = gpsLokacijaId;
   }

   public java.lang.String getLokacija()
   {
      return this.lokacija;
   }

   public void setLokacija(java.lang.String lokacija)
   {
      this.lokacija = lokacija;
   }

   public GPS(java.lang.Long gpsLokacijaId, java.lang.String lokacija)
   {
      this.gpsLokacijaId = gpsLokacijaId;
      this.lokacija = lokacija;
   }

}