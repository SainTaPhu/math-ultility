/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saintaphu.mathutil.main;

import com.saintaphu.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {
    
    public static void main(String[] args) {
        
        // ta phai dua cac tinh huong su dung ham trong thuc te 
        // đưa vào các giá trị trong các miền kiểm tra xem app có trả đúng giá trị mong muốn
        
        // giả lập hành vi sử dụng app
        
        long expected =120; // kì vọng hàm trả về 120 khi tính 5!
        
        int n =5;
        long actual = MathUtil.getFactorial(n);
        System.out.println("expected 5! =" + expected);
        System.out.println("actual 5! = "+actual );
        
    }
}
