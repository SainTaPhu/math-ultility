/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.saintaphu.mathutil.test.core;

import com.saintaphu.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Admin
 */
@RunWith(value = Parameterized.class)  // câu lệnh của Junit báo hiệu trong cần loop qua các cặp data 
public class MathUtilDDTTest {
    
     @Parameterized.Parameters   //Junit sẽ ngầm chạy loop qua từng dòng để lấy cặp data
     public static Object[][] initData(){
         return new Integer [][]{
             {0,1},
             {1,1},
             {2,2},
             {3,6},
             {4,24},
             {6,120},
            
             
             
         };
        }
     
     // giả sử loop qua mảng 2 chiều thì vẫn cần gán values vào từng cột
     @Parameterized.Parameter(value = 0)
     public int input;
     @Parameterized.Parameter(value = 1)
     public long expected;
     @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
    
        Assert.assertEquals(expected, MathUtil.getFactorial(input));
    
    }
     public MathUtilDDTTest() {
        
        
        //ham nay se tra ve mang 2 chieu
       
    
    

    }
    
}
