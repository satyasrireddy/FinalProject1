/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package embeddedmediaplayer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author comqsjb
 */
public class ClipTest {
    
    public ClipTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTitle method, of class Clip.
     */
    @Test
    public void testSetTitleToEmptyStringKeepsPreviousValue()
    {
       System.out.println("setTitle");
        Clip instance = new Clip();
        String OriginalTitle = "Original Title";
        instance.setTitle(OriginalTitle);              // try to set Empty Title
        String EmptyTitle = " ";
        instance.setTitle(EmptyTitle);              // try to set Empty Title
        String ModifiedTitle = instance.getTitle(); // check Empty Title is set or not 
        assertTrue(OriginalTitle.equals(ModifiedTitle));// compare original title and resulted title
        System.out.println("Empty Title is not set");
    }

   

    @Test
    public void testSetEndBeforeStartKeepsPreviousValue()
    {
      System.out.println("Doesn't allow to set end time to start time");
       Clip instance = new Clip();
       String OriginalTitle = "Sub video"; //Create sub video clip
       instance.setTitle(OriginalTitle);   // Set Ttile  
       int OriginalStartTime = 10; // sub video start time
       int originalEndtime = 50;// sub video end time
       instance.setMax(100);//set master video to 100 seconds video
 // Create a new sub clip from 10th second to 50th second
       instance.setStart(OriginalStartTime);//Set start time to sub video from 10th sec 
       instance.setEnd(originalEndtime);// set end time to sub video at 50th second
       int EndTime = instance.getEnd(); //Get endtime of the video
       instance.setStart(EndTime); //try setting end time as start time to the sub clip
       int CurrentStartTime = instance.getStart();//chek start time was set to endtime, usually it wont allow
       assertEquals(OriginalStartTime,CurrentStartTime);
       System.out.println("Start time is same as previous value");


    }

    @Test
    
    
    
    @Test
    public void testEqualsOnNonEqualClips() 
    {
    }
    
    @Test
    public void testSetEndToNegativeNumberKeepsPreviousValue() 
    {
    }
    
    @Test
    public void testSetStartToValidPositiveNumber() 
    {    
    }
    
    
    
}
    

}
