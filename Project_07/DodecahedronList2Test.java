import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/** Test class for DodecahedronList2. **/
public class DodecahedronList2Test {

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** A test of getters. **/
   @Test public void gettersTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      Assert.assertEquals("getName Test", "Test List", dList.getName());
      Assert.assertArrayEquals("getList test", dArray, dList.getList());
   }
   
   /** A test of numberOfDodecahedrons(). **/
   @Test public void numberOfDodecahedronsTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      Assert.assertEquals("numberOfDodecahedrons Test", 
                           3, dList.numberOfDodecahedrons());
   }
   
   /** A test of totalSurfaceArea(). **/
   @Test public void totalSurfaceAreaTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      Assert.assertEquals("totalSurfaceArea Test", 
                           832070.821, dList.totalSurfaceArea(), .001);
   }
   
   /** A test of totalVolume(). **/
   @Test public void totalVolumeTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      Assert.assertEquals("totalVolume Test", 
                           61773784.687, dList.totalVolume(), .001);
   }
   
   /** A test of averageSurfaceArea(). **/
   @Test public void averageSurfaceAreaTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      Assert.assertEquals("averageSurfaceArea Test", 
                           277356.94, dList.averageSurfaceArea(), .001);
   }
   
   /** A test of averageVolume(). **/
   @Test public void averageVolumeTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      Assert.assertEquals("averageVolume Test", 
                           20591261.562, dList.averageVolume(), .001);
   }
   
   /** A test of averageSurfaceToVolumeRatio(). **/
   @Test public void averageSurfaceToVolumeRatioTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      Assert.assertEquals("averageSurfaceToVolumeRatio Test", 
                           3.686, dList.averageSurfaceToVolumeRatio(), .001);
   }
   
   /** A test of toString(). **/
   @Test public void toStringTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      Assert.assertEquals("toString Test", 
                           true, 
                           dList.toString().
                              contains("Dodecahedron \"Small Example\""));
   }
   
   /** A test of summaryInfo(). **/
   @Test public void summaryInfoTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      Assert.assertEquals("summaryInfo Test", 
                           true, 
                           dList.summaryInfo().
                              contains("Number of Dodecahedrons: 3"));
   }
   
   /** A test of readFile().
    * @throws IOException for reading a file.
    */
   @Test public void readFileTest() throws IOException {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      dList = dList.readFile("dodecahedron_data_1.txt");
      Assert.assertEquals("readFile Test", "Dodecahedron Test List", 
                           dList.getName());
   }
   
   /** A test of addDodecahedron(). **/
   @Test public void addDodecahedronTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      Dodecahedron d = new Dodecahedron("Humongous", "black", 1000);
      dList.addDodecahedron("Humongous", "black", 1000);
      Dodecahedron[] dA = dList.getList();
      Assert.assertEquals("addDodecahedron Test", d, dA[3]);
   }
   
   /** A test of findDodecahedron(). **/
   @Test public void findDodecahedronTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      Assert.assertEquals("findDodecahedron Test", dArray[0], 
                           dList.findDodecahedron("small example"));
   }
   
   /** A test of findDodecahedron() when false. **/
   @Test public void findDodecahedronFalseTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      Assert.assertEquals("findDodecahedron Test", null, 
                           dList.findDodecahedron("nope"));
   }

   /** A test of deleteDodecahedron(). **/
   @Test public void deleteDodecahedronTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      dList.deleteDodecahedron("small example");
      Assert.assertEquals("deleteDodecahedron Test", null, dArray[2]);
   }
   
    /** A test of deleteDodecahedron() when false. **/
   @Test public void deleteDodecahedronFalseTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      dList.deleteDodecahedron("nope");
      Assert.assertEquals("deleteDodecahedron Test", dArray[2], dArray[2]);
   }
   
   /** A test of editDodecahedron(). **/
   @Test public void editDodecahedronTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      dList.editDodecahedron("small example", "gold", 0.21);
      Assert.assertEquals("editDodecahedron Test", "gold", 
                           dArray[0].getColor());
   }
   
   /** A test of editDodecahedron() when false. **/
   @Test public void editDodecahedronFalseTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      dList.editDodecahedron("nope", "gold", 0.21);
      Assert.assertEquals("editDodecahedron Test", "blue", 
                           dArray[0].getColor());
   }

   /** A test of findDodecahedronWithShortestEdge(). **/
   @Test public void findDodecahedronWithShortestEdgeTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      Assert.assertEquals("findDodecahedronWithShortestEdge Test", 
                           dArray[0], 
                           dList.findDodecahedronWithShortestEdge());
   }
   
   /** A test of findDodecahedronWithShortestEdge() when false. **/
   @Test public void findDodecahedronWithShortestEdgeFalseTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 0);
      Assert.assertEquals("findDodecahedronWithShortestEdge Test", 
                           null, 
                           dList.findDodecahedronWithShortestEdge());
   }

   /** A test of findDodecahedronWithLongestEdge(). **/
   @Test public void findDodecahedronWithLongestEdgeTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      Assert.assertEquals("findDodecahedronWithlongestEdge Test", 
                           dArray[2], 
                           dList.findDodecahedronWithLongestEdge());
   }
   
   /** A test of findDodecahedronWithLongestEdge() when false. **/
   @Test public void findDodecahedronWithLongestEdgeFalseTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 0);
      Assert.assertEquals("findDodecahedronWithlongestEdge Test", 
                           null, 
                           dList.findDodecahedronWithLongestEdge());
   }

   /** A test of findDodecahedronWithSmallestVolume(). **/
   @Test public void findDodecahedronWithSmallestVolumeTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      Assert.assertEquals("findDodecahedronWithSmallestVolume Test", 
                           dArray[0], 
                           dList.findDodecahedronWithSmallestVolume());
   }
   
   /** A test of findDodecahedronWithSmallestVolume() when false. **/
   @Test public void findDodecahedronWithSmallestVolumeFalseTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 0);
      Assert.assertEquals("findDodecahedronWithSmallestVolume Test", 
                           null, 
                           dList.findDodecahedronWithSmallestVolume());
   }

   /** A test of findDodecahedronWithLargestVolume(). **/
   @Test public void findDodecahedronWithLargestVolumeTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      Assert.assertEquals("findDodecahedronWithLargestVolume Test", 
                           dArray[2], 
                           dList.findDodecahedronWithLargestVolume());
   }
   
   /** A test of findDodecahedronWithLargestVolume() when false. **/
   @Test public void findDodecahedronWithLargestVolumeFalseTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 0);
      Assert.assertEquals("findDodecahedronWithLargestVolume Test", 
                           null, 
                           dList.findDodecahedronWithLargestVolume());
   }
}