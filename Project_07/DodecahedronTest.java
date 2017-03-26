import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/** Test class for Dodecahedron. */
public class DodecahedronTest {

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** A test of getters. **/
   @Test public void gettersTest() {
      Dodecahedron d = new Dodecahedron("Small Example", "blue", 0.25);
      Assert.assertEquals("Small Example", d.getLabel());
      Assert.assertEquals("blue", d.getColor());
      Assert.assertEquals(0.25, d.getEdge(), 0.01);
   }
   
   /** A test of setters. **/
   @Test public void settersTest() {
      Dodecahedron d = new Dodecahedron("Small Example", "blue", 0.25);
      d.setLabel("Small Example");
      d.setColor("blue");
      d.setEdge(0.25);
      Assert.assertEquals("Small Example", d.getLabel());
      Assert.assertEquals("blue", d.getColor());
      Assert.assertEquals(0.25, d.getEdge(), 0.01);
   }
   
   /** A test of surface area. **/
   @Test public void areaTest() {
      Dodecahedron d = new Dodecahedron("Small Example", "blue", 0.25);
      Assert.assertEquals(1.29, d.surfaceArea(), 0.01);
   }
   
   /** A test of volume. **/
   @Test public void volumeTest() {
      Dodecahedron d = new Dodecahedron("Small Example", "blue", 0.25);
      Assert.assertEquals(0.12, d.volume(), 0.01);
   }
   
   /** A test of surface to volume ratio. **/
   @Test public void ratioTest() {
      Dodecahedron d = new Dodecahedron("Small Example", "blue", 0.25);
      Assert.assertEquals(10.777, d.surfaceToVolumeRatio(), 0.001);
   }
   
   /** A test of resetCount() and getCount(). **/
   @Test public void countTest() {
      Dodecahedron d = new Dodecahedron("Small Example", "blue", 0.25);
      d.resetCount();
      Dodecahedron d1 = new Dodecahedron("Small Example", "blue", 0.25);
      Assert.assertEquals(1, d1.getCount());
   }
   
   /** A test of hashCode(). **/
   @Test public void hashCodeTest() {
      Dodecahedron d = new Dodecahedron("Small Example", "blue", 0.25);
      Assert.assertEquals(0, d.hashCode());
   }
   
   /** A test of equals(). **/
   @Test public void equalsTest() {
      Dodecahedron d1 = new Dodecahedron("Small Example", "blue", 0.25);
      Dodecahedron d2 = new Dodecahedron("Small Example", "blue", 0.25);
      Assert.assertEquals("equals test", true, d1.equals(d2));
      d2 = new Dodecahedron("Example", "blue", 0.25);
      Assert.assertEquals("equals false test", false, d1.equals(d2));
      d2 = new Dodecahedron("Small Example", "grey", 0.25);
      Assert.assertEquals("equals false test", false, d1.equals(d2));
      d2 = new Dodecahedron("Small Example", "blue", 0.15);
      Assert.assertEquals("equals false test", false, d1.equals(d2));
      
      Assert.assertEquals("equals false test", false, d1.equals("obj"));
      Assert.assertEquals("equals false test", false, d1.equals("obj"));
      Assert.assertEquals("equals false test", false, d1.equals("obj"));
      
      Assert.assertEquals("equals false test", 0, d1.hashCode());
   }
   
   /** A test of toString(). **/
   @Test public void toStringTest() {
      Dodecahedron d = new Dodecahedron("Small Example", "blue", 0.25);
      Assert.assertEquals("toString test", true,
         d.toString().contains("Dodecahedron \"Small Example\""));
   }
}