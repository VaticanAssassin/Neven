package streseeg.streseeg;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class MozdaniValoviMozga implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Vrsta vala")
   private java.lang.String vrstaVala;
   @org.kie.api.definition.type.Label(value = "Vrijednost vala")
   private java.lang.Integer vrijednostVala;

   public MozdaniValoviMozga()
   {
   }

   public java.lang.String getVrstaVala()
   {
      return this.vrstaVala;
   }

   public void setVrstaVala(java.lang.String vrstaVala)
   {
      this.vrstaVala = vrstaVala;
   }

   public java.lang.Integer getVrijednostVala()
   {
      return this.vrijednostVala;
   }

   public void setVrijednostVala(java.lang.Integer vrijednostVala)
   {
      this.vrijednostVala = vrijednostVala;
   }

   public MozdaniValoviMozga(java.lang.String vrstaVala,
         java.lang.Integer vrijednostVala)
   {
      this.vrstaVala = vrstaVala;
      this.vrijednostVala = vrijednostVala;
   }

}