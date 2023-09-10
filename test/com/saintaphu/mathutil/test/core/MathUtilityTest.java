/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.saintaphu.mathutil.test.core;

import com.saintaphu.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    // day la class se su dung cac ham cua thu vien JUNIT de verify code chinh
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n=0; 
        long expected =1;
        long actual =MathUtil.getFactorial(n) ;// gọi hàm cần test ở phần code chính
        
        //so sánh EXP và ACT dùng xanh xanh đỏ đỏ framwork
        
        Assert.assertEquals(expected, actual);
        // hàm giúp so sánh 2 giá trị nào đó có giống nhau không
        // nếu giống thì màu xanh xuất hiện
        // nếu khác nhau thì ra màu đỏ
        
        //gộp thêm vài case nữa / đưa đầu vào ngon 
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        
    }
    
     @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentReturnsWell(){
        MathUtil.getFactorial(-2);
    }
    
    
    
    
    // cách khác để bắt ngoại lệ khi xuất hiện 
    // dùng Lamda   
    
    // hàm bắt ngoại lệ khi nhập vào 21
    
    @Test
    public void testGetFactorialGivenWrongArgumentReturnsWellUsingLambda(){
        
        Assert.assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-2));
        
    }
    
}
