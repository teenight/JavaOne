import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 * Dodecahedron list.
 *
 * Project_06.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 3/6/2017
 */
public class DodecahedronList {
   private String listName;
   private ArrayList<Dodecahedron> dList;
   /**
    * @param listNameIn the list name.
    * @param dListIn the dodecahedron list.
    */
   public DodecahedronList(String listNameIn, ArrayList<Dodecahedron> dListIn) {
      listName = listNameIn;
      dList = dListIn;
   }
   /**
    * @return the list name.
    */
   public String getName() {
      return listName;
   }
   /**
    * @return the size of the list.
    */
   public int numberOfDodecahedrons() {
      return dList.size();
   }
   /**
    * @return the total surface area.
    */
   public double totalSurfaceArea() {
      double totalS = 0;
      int index = 0;
      while (index < dList.size()) {
         totalS += dList.get(index).surfaceArea();
         index++;
      }
      return totalS;
   }
   /**
    * @return the total volume.
    */
   public double totalVolume() {
      double totalV = 0;
      int index = 0;
      while (index < dList.size()) {
         totalV += dList.get(index).volume();
         index++;
      }
      return totalV;
   }
   /**
    * @return the average area.
    */
   public double averageSurfaceArea() {
      double avgA = 0;
      if (dList.size() > 0) {
         avgA = totalSurfaceArea() / dList.size();
      }
      return avgA;
   }
   /**
    * @return the average volume.
    */
   public double averageVolume() {
      double avgV = 0;
      if (dList.size() > 0) {
         avgV = totalVolume() / dList.size();
      }
      return avgV;
   }
   /**
    * @return the total surface area/volume ratio.
    */
   public double totalRatio() {
      double totalR = 0;
      int index = 0;
      while (index < dList.size()) {
         totalR += dList.get(index).surfaceToVolumeRatio();
         index++;
      }
      return totalR;
   }
   /**
    * @return the average surface area/volume ratio.
    */
   public double averageSurfaceToVolumeRatio() {
      double avgR = 0;
      if (dList.size() > 0) {
         avgR = totalRatio() / dList.size();
      }
      return avgR;
   }
   /**
    * @return the result as string.
    */
   public String toString() {
      String result = listName + "\n";
      int index = 0;
      while (index < dList.size()) {
         result += "\n" + dList.get(index) + "\n";
         index++;
      }
      return result;
   }
   /**
    * @return the summary info.
    */
   public String summaryInfo() {
      DecimalFormat fmt = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----";
      result += "\nNumber of Dodecahedrons: " + numberOfDodecahedrons();
      result += "\nTotal Surface Area: " + fmt.format(totalSurfaceArea());
      result += "\nTotal Volume: " + fmt.format(totalVolume());
      result += "\nAverage Surface Area: " + fmt.format(averageSurfaceArea());
      result += "\nAverage Volume: " + fmt.format(averageVolume());
      result += "\nAverage Suface/Volume Ratio: " 
         + fmt.format(averageSurfaceToVolumeRatio());
      return result;
   }
   /**
    * @return the list.
    */
   public ArrayList<Dodecahedron> getList() {
      return dList;
   }
   /**
    * @param fileNameIn for fileName to read.
    * @return DodecahedronList.
    * @throws IOException for file reading.
    */
   public DodecahedronList readFile(String fileNameIn) throws IOException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      ArrayList<Dodecahedron> myList = new ArrayList<Dodecahedron>();
      String label = "";
      String color = "";
      double edge = 0;
      listName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         color = scanFile.nextLine();
         edge = Double.parseDouble(scanFile.nextLine());
         Dodecahedron d = new Dodecahedron(label, color, edge);
         myList.add(d);
      }
      DodecahedronList dL = new DodecahedronList(listName, myList);
      return dL;
   }
   /**
    * @param labelIn the label.
    * @param colorIn the color.
    * @param edgeIn the edge.
    */
   public void addDodecahedron(String labelIn, String colorIn, double edgeIn) {
      Dodecahedron d = new Dodecahedron(labelIn, colorIn, edgeIn);
      dList.add(d);
   }
   /**
    * @param labelIn the label.
    * @return dList.get(index) the index of the label.
    */
   public Dodecahedron findDodecahedron(String labelIn) {
      int index = -1;
      for (Dodecahedron d : dList) {
         if (d.getLabel().equalsIgnoreCase(labelIn)) {
            index = dList.indexOf(d);
            break;
         }
      }
      if (index >= 0) {
         return dList.get(index);
      }
      else {
         return null;
      }
   }
   /**
    * @param labelIn the label.
    * @return d1 the dodecahedron.
    */
   public Dodecahedron deleteDodecahedron(String labelIn) {
      int index = dList.indexOf(findDodecahedron(labelIn));    
      if (index >= 0) {
         return dList.remove(index);
      } else {
         return null;
      }
   }
   /**
    * @param labelIn the label.
    * @param colorIn the color.
    * @param edgeIn the edge.
    * @return true if input is correct.
    */
   public boolean editDodecahedron(String labelIn, String colorIn, 
      double edgeIn) {
      Dodecahedron result = null;
      int index = -1;
      for (Dodecahedron d : dList) {
         if (d.getLabel().equalsIgnoreCase(labelIn)) {
            index = dList.indexOf(d);
            break;
         }
      }
      if (index >= 0) {
         result = dList.get(index);
         result.setColor(colorIn);
         result.setEdge(edgeIn);
         return true;
      }
      return false;
   }
}