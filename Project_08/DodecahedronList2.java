import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 * Dodecahedron list.
 *
 * Project_08.
 * @author Zejian Zhong - COMP 1210 - 008
 * @version 3/9/2017
 */
public class DodecahedronList2 {
   private String listName;
   private Dodecahedron[] dList;
   private int numberOfDodecahedrons;
   /**
    * @param listNameIn the list name.
    * @param dListIn the dodecahedron list.
    * @param numberOfDodecahedronsIn the number of dodecahedrons.
    */
   public DodecahedronList2(String listNameIn, Dodecahedron[] dListIn, 
                            int numberOfDodecahedronsIn) {
      listName = listNameIn;
      dList = dListIn;
      numberOfDodecahedrons = numberOfDodecahedronsIn;
   }
   /**
    * @return the list name.
    */
   public String getName() {
      return listName;
   }
   /**
    * @return the number of dodecahedrons objects in the dlist.
    */
   public int numberOfDodecahedrons() {
      return numberOfDodecahedrons;
   }
   /**
    * @return the total surface area.
    */
   public double totalSurfaceArea() {
      double totalS = 0;
      int index = 0;
      while (index < numberOfDodecahedrons) {
         totalS += dList[index].surfaceArea();
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
      while (index < numberOfDodecahedrons) {
         totalV += dList[index].volume();
         index++;
      }
      return totalV;
   }
   /**
    * @return the average area.
    */
   public double averageSurfaceArea() {
      double avgA = 0;
      if (numberOfDodecahedrons > 0) {
         avgA = totalSurfaceArea() / numberOfDodecahedrons;
      }
      return avgA;
   }
   /**
    * @return the average volume.
    */
   public double averageVolume() {
      double avgV = 0;
      if (numberOfDodecahedrons > 0) {
         avgV = totalVolume() / numberOfDodecahedrons;
      }
      return avgV;
   }
   /**
    * @return the total surface area/volume ratio.
    */
   public double totalRatio() {
      double totalR = 0;
      int index = 0;
      while (index < numberOfDodecahedrons) {
         totalR += dList[index].surfaceToVolumeRatio();
         index++;
      }
      return totalR;
   }
   /**
    * @return the average surface area/volume ratio.
    */
   public double averageSurfaceToVolumeRatio() {
      double avgR = 0;
      if (numberOfDodecahedrons > 0) {
         avgR = totalRatio() / numberOfDodecahedrons;
      }
      return avgR;
   }
   /**
    * @return the result as string.
    */
   public String toString() {
      String result = listName + "\n";
      int index = 0;
      while (index < numberOfDodecahedrons) {
         result += "\n" + dList[index] + "\n";
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
   public Dodecahedron[] getList() {
      return dList;
   }
   /**
    * @param fileNameIn for fileName to read.
    * @return DodecahedronList.
    * @throws IOException for file reading.
    */
   public DodecahedronList2 readFile(String fileNameIn) throws IOException {
      Scanner scanFile = new Scanner(new File(fileNameIn));
      Dodecahedron[] myList = new Dodecahedron[20];
      String label = "";
      String color = "";
      double edge = 0;
      listName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         color = scanFile.nextLine();
         edge = Double.parseDouble(scanFile.nextLine());
         Dodecahedron d = new Dodecahedron(label, color, edge);
         myList[numberOfDodecahedrons] = d;
         numberOfDodecahedrons++;
      }
      DodecahedronList2 dL = new DodecahedronList2(listName, myList, 
                             numberOfDodecahedrons);
      return dL;
   }
   /**
    * @param labelIn the label.
    * @param colorIn the color.
    * @param edgeIn the edge.
    */
   public void addDodecahedron(String labelIn, String colorIn, double edgeIn) {
      Dodecahedron d = new Dodecahedron(labelIn, colorIn, edgeIn);
      dList[numberOfDodecahedrons] = d;
      numberOfDodecahedrons++;
   }
   /**
    * @param labelIn the label.
    * @return dList.get(index) the index of the label.
    */
   public Dodecahedron findDodecahedron(String labelIn) {
      Dodecahedron result = null;
      for (int i = 0; i < numberOfDodecahedrons; i++) {
         if (dList[i].getLabel().equalsIgnoreCase(labelIn)) {
            result = dList[i];
            break;
         }
      }
      return result;
   }
   /**
    * @param labelIn the label.
    * @return d1 the dodecahedron.
    */
   public Dodecahedron deleteDodecahedron(String labelIn) {
      Dodecahedron result = null;
      for (int i = 0; i < numberOfDodecahedrons; i++) {
         if (dList[i].getLabel().equalsIgnoreCase(labelIn)) {
            result = dList[i];
            for (int j = i; j < numberOfDodecahedrons - 1; j++) {
               dList[j] = dList[j + 1];
            }
            dList[numberOfDodecahedrons - 1] = null;
            numberOfDodecahedrons--;
            break;
         }
      }
      return result;
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
      for (int i = 0; i < numberOfDodecahedrons; i++) {
         if (dList[i].getLabel().equalsIgnoreCase(labelIn)) {
            result = dList[i];
            dList[i].setColor(colorIn);
            dList[i].setEdge(edgeIn);
            return true;
         }
      }
      return false;
   }
}