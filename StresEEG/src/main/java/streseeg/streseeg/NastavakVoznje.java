package streseeg.streseeg;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class NastavakVoznje implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Nastavak voznje ID")
   private java.lang.Integer nastavakVoznjeId;
   @org.kie.api.definition.type.Label(value = "Da li vozi")
   private java.lang.Boolean daLiVozi;

   public NastavakVoznje()
   {
   }

   public java.lang.Integer getNastavakVoznjeId()
   {
      return this.nastavakVoznjeId;
   }

   public void setNastavakVoznjeId(java.lang.Integer nastavakVoznjeId)
   {
      this.nastavakVoznjeId = nastavakVoznjeId;
   }

   public java.lang.Boolean getDaLiVozi()
   {
      return this.daLiVozi;
   }

   public void setDaLiVozi(java.lang.Boolean daLiVozi)
   {
      this.daLiVozi = daLiVozi;
   }

   public NastavakVoznje(java.lang.Integer nastavakVoznjeId,
         java.lang.Boolean daLiVozi)
   {
      this.nastavakVoznjeId = nastavakVoznjeId;
      this.daLiVozi = daLiVozi;
   }

}