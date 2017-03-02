import java.text.DecimalFormat;
/**
 * The information about dodecahedron.
 *
 * Project_05.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 2/26/2017
 */
public class Dodecahedron {
/**
 * Dodecahedron.
 * @param args Commandline arguments - not used.
 */
   private String label = "";
   private String color = "";
   private double edge = 0;
   /**
    * @param labelIn the input label.
    * @param colorIn the input color.
    * @param edgeIn the input edge.
    */
   public Dodecahedron(String labelIn, String colorIn, double edgeIn) {
      label = labelIn;
      color = colorIn;
      edge = edgeIn;
   }
   /**
    * @param labelIn the label.
    * @return true if applied, otherwise false.
    */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      else {
         return false;
      }
   }
   /**
    * @param colorIn the color.
    * @return true if applied, otherwise false.
    */
   public boolean setColor(String colorIn) {
      if (colorIn != null) {
         color = colorIn.trim();
         return true;
      }
      else {
         return false;
      }
   }
   /**
    * @param edgeIn the edge.
    * @return true if appled, otherwise false.
    */   
   public boolean setEdge(double edgeIn) {
      if (edgeIn > 0) {
         edge = edgeIn;
         return true;
      }
      else {
         return false;
      }
   }
   /**
    * @return label.
    */
   public String getLabel() {
      return label;
   }
   /**
    * @return color.
    */
   public String getColor() {
      return color;
   }
   /**
    * @return edge.
    */
   public double getEdge() {
      return edge;
   }
   /**
    * @return the value of the surface area.
    */
   public double surfaceArea() {
      double surfaceArea = 3 * Math.sqrt(10 * Math.sqrt(5) + 25) * edge * edge;
      return surfaceArea;
   }
   /**
    * @return the value of the volume.
    */
   public double volume() {
      double volume =  Math.pow(edge, 3) * (15 + 7 * Math.sqrt(5)) / 4;
      return volume;
   }
   /**
    * @return the surface to volume ratio.
    */
   public double surfaceToVolumeRatio() {
      double surfaceToVolumeRatio = surfaceArea() / volume();
      return surfaceToVolumeRatio;
   }
   /**
    * @return the string.
    */
   public String toString() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      String output = "Dodecahedron " + "\"" + label.trim() + "\" is \""
         + color.trim() + "\" with 30 edges of length " + edge 
         + " units.";
      output += "\n\tsurface area = " + fmt.format(surfaceArea())
               + " square units";
      output += "\n\tvolume = " + fmt.format(volume()) + " cubic units";
      output += "\n\tsurface/volume ratio = ";
      output += fmt.format(surfaceToVolumeRatio());
      return output;
   }
}
