package streseeg.streseeg;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class HitnaPomoc implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("GPS Lokacija ID")
   private Integer gpsLokacijaId;

   @org.kie.api.definition.type.Label(value = "Hitna pomoc FK")
   private streseeg.streseeg.HitnaPomoc hitnaPomoc_fk;

   public HitnaPomoc()
   {
   }

   public streseeg.streseeg.HitnaPomoc getHitnaPomoc_fk()
   {
      return this.hitnaPomoc_fk;
   }

   public void setHitnaPomoc_fk(streseeg.streseeg.HitnaPomoc hitnaPomoc_fk)
   {
      this.hitnaPomoc_fk = hitnaPomoc_fk;
   }

   public java.lang.Integer getGpsLokacijaId()
   {
      return this.gpsLokacijaId;
   }

   public void setGpsLokacijaId(java.lang.Integer gpsLokacijaId)
   {
      this.gpsLokacijaId = gpsLokacijaId;
   }

   public HitnaPomoc(java.lang.Integer gpsLokacijaId,
         streseeg.streseeg.HitnaPomoc hitnaPomoc_fk)
   {
      this.gpsLokacijaId = gpsLokacijaId;
      this.hitnaPomoc_fk = hitnaPomoc_fk;
   }

}