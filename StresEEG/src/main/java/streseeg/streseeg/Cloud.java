package streseeg.streseeg;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Cloud implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Cloud ID")
   private Integer cloudId;
   @org.kie.api.definition.type.Label("Izvjestaj FK")
   private streseeg.streseeg.Izvjestaj izvjestaj_fk;

   public Cloud()
   {
   }

   public streseeg.streseeg.Izvjestaj getIzvjestaj_fk()
   {
      return this.izvjestaj_fk;
   }

   public void setIzvjestaj_fk(streseeg.streseeg.Izvjestaj izvjestaj_fk)
   {
      this.izvjestaj_fk = izvjestaj_fk;
   }

   public java.lang.Integer getCloudId()
   {
      return this.cloudId;
   }

   public void setCloudId(java.lang.Integer cloudId)
   {
      this.cloudId = cloudId;
   }

   public Cloud(java.lang.Integer cloudId, streseeg.streseeg.Izvjestaj izvjestaj_fk)
   {
      this.cloudId = cloudId;
      this.izvjestaj_fk = izvjestaj_fk;
   }

}