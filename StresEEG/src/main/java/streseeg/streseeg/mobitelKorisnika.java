package streseeg.streseeg;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class mobitelKorisnika implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Mobitel ID")
   private Integer mobitelId;
   @org.kie.api.definition.type.Label(value = "Broj mobitela")
   private java.lang.String brojMobitela;

   public mobitelKorisnika()
   {
   }

   public java.lang.Integer getMobitelId()
   {
      return this.mobitelId;
   }

   public void setMobitelId(java.lang.Integer mobitelId)
   {
      this.mobitelId = mobitelId;
   }

   public java.lang.String getBrojMobitela()
   {
      return this.brojMobitela;
   }

   public void setBrojMobitela(java.lang.String brojMobitela)
   {
      this.brojMobitela = brojMobitela;
   }

   public mobitelKorisnika(java.lang.Integer mobitelId,
         java.lang.String brojMobitela)
   {
      this.mobitelId = mobitelId;
      this.brojMobitela = brojMobitela;
   }

}