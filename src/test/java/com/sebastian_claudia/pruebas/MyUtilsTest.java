package com.sebastian_claudia.pruebas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.sebastian_claudia.pruebas.MyUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.sebastian_claudia.pruebas.MyUtils.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sebastian
 */
public class MyUtilsTest {
    
    public MyUtilsTest() {
    }

    @Test
    public void inverteix(){
        assertEquals("aidualc",MyUtils.inverteix("claudia"));
        assertEquals(null,MyUtils.inverteix(null));
        assertNotEquals("",MyUtils.inverteix(null));
    }
    @Test
    public void edat(){
        try {
            assertEquals(19, MyUtils.edat(16, 1, 2005));
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        try {
            assertEquals(-1, MyUtils.edat(16, 1, 1800));
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        try {
            assertEquals(-2, MyUtils.edat(16, 16, 1900));
            //Y lanza una excepción 
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
    @Test
    public void factorial(){
        assertEquals(1, MyUtils.factorial(0));
        assertEquals(-1, MyUtils.factorial(-3));
        assertEquals(6, MyUtils.factorial(3));
        assertTrue(MyUtils.factorial(3)==6);//True
    }
    
    
    
}
