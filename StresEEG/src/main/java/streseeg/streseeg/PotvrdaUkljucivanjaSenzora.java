package streseeg.streseeg;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PotvrdaUkljucivanjaSenzora implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("Senzor info ID")
   private java.lang.Integer senzorInfoId;
   @org.kie.api.definition.type.Label("Radi")
   private Boolean radi;

   public PotvrdaUkljucivanjaSenzora()
   {
   }

   public java.lang.Integer getSenzorInfoId()
   {
      return this.senzorInfoId;
   }

   public void setSenzorInfoId(java.lang.Integer senzorInfoId)
   {
      this.senzorInfoId = senzorInfoId;
   }

   public java.lang.Boolean getRadi()
   {
      return this.radi;
   }

   public void setRadi(java.lang.Boolean radi)
   {
      this.radi = radi;
   }

   public PotvrdaUkljucivanjaSenzora(java.lang.Integer senzorInfoId,
         java.lang.Boolean radi)
   {
      this.senzorInfoId = senzorInfoId;
      this.radi = radi;
   }

}