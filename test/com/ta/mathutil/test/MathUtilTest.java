/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ta.mathutil.test;

import static com.ta.mathutil.MathUtility.*;  //tao mun cac ham, bien
import java.sql.SQLException;
                            // trong class go truc tiep luon
                            // go truc tiep ko can class cham,
                            //chi static moi co dieu nay
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BiV
 */
public class MathUtilTest {
    @Test
   public void testFactorialGivenRightArgumentReturnsGoodResult(){
       int n = 5; // test 5! co cung la 120 hay k
       long expected = 120;
       long actual = getFactorial(n);
       assertEquals(expected, actual);
       
       //minh test tiep cac truong hop khac dung dau vao, dung dau ra
       // khoi can bien trung gian, choi luon trong lenh
        assertEquals(720, getFactorial(6));
        assertEquals(24, getFactorial(4));
        assertEquals(6, getFactorial(3));
        assertEquals(1, getFactorial(1));
        assertEquals(1, getFactorial(0));

   }
   @Test(expected = SQLException.class)
   //có đúng là khi chạy hàm này thì ném ra ngoại lệ tên là IllegalArgumentException
   //nếu đúng nó ném ra ngoại lệ cùng tên, code đúng rồi, Xanh thôi
   public void testFactorialWrongArgumentThrowsException(){
       //mình test tình huống hàm phải ném ra ngoại lệ nếu tham số cà chớn
       //ngoại lệ là không phải value để so sánh, ko dùng assertEquals
       // Junit 4 khác với Junit 5 ở chỗ bắt ngoại lệ
       //kì 5 đi dự thính môn SWT301 của thay: DI, Lambda Expression     
       //Junit 5                               Dependency Injection
       getFactorial(-5);
       
   }
    //dieu gi xay ra neu ta dua vao tham so cà chớn, âm, hoặc >20
    // theo thiết kế của hàm, đưa vào cà chớn sẽ ném ra ngoại lệ (exception) 
    // mà ta cần test xem, ngoại lệ có được ném ra không nếu ta cà chớn
    // tức là thấy xuất hiện ngoại lệ nếu có cà chớn thì hàm chạy đúng
}
