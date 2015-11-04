package streseeg.streseeg;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CentarZaPomoc implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Centar pomoci ID")
   private Integer centarPomociId;
   @org.kie.api.definition.type.Label("Broj Telefona")
   private java.lang.String brojTelefona;

   @org.kie.api.definition.type.Label("Hitnost")
   private streseeg.streseeg.HitnaPomoc emergencyId_fk;

   public CentarZaPomoc()
   {
   }

   public java.lang.String getBrojTelefona()
   {
      return this.brojTelefona;
   }

   public void setBrojTelefona(java.lang.String brojTelefona)
   {
      this.brojTelefona = brojTelefona;
   }

   public streseeg.streseeg.HitnaPomoc getEmergencyId_fk()
   {
      return this.emergencyId_fk;
   }

   public void setEmergencyId_fk(streseeg.streseeg.HitnaPomoc emergencyId_fk)
   {
      this.emergencyId_fk = emergencyId_fk;
   }

   public java.lang.Integer getCentarPomociId()
   {
      return this.centarPomociId;
   }

   public void setCentarPomociId(java.lang.Integer centarPomociId)
   {
      this.centarPomociId = centarPomociId;
   }

   public CentarZaPomoc(java.lang.Integer centarPomociId,
         java.lang.String brojTelefona,
         streseeg.streseeg.HitnaPomoc emergencyId_fk)
   {
      this.centarPomociId = centarPomociId;
      this.brojTelefona = brojTelefona;
      this.emergencyId_fk = emergencyId_fk;
   }

}