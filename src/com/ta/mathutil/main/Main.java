/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ta.mathutil.main;

import com.ta.mathutil.MathUtility;

/**
 *
 * @author BiV
 */
public class Main {
    public static void main(String[] args) {
        //test 5! = 120 ko
        int n = 5;
        long expected = 120; 
        long actual = MathUtility.getFactorial(n); // thuc te ham chay la may
        //so sanh de biet dung sai
        System.out.println("5! expected: " + expected + 
                            "; actual: " + actual);
        
        // test 0! co dung la 1 k
        
         n = 0;
         expected = 1; 
         actual = MathUtility.getFactorial(n); // thuc te ham chay la may
        //so sanh de biet dung sai
        System.out.println("0! expected: " + expected + 
                            "; actual: " + actual);
        
  }
    
}
//viet code xong thi phai test code - nguyen tac phai theo
//Test ngay tung ham, tung class truong khi rap chung voi cac class khac
//Test ngay khi xong ham, xong class duoc goi la test muc do 1 - Unit test
// lam sao de test. co nhieu cach
//1. Cach 1: sout(goiham()) de in ra ket qua xu li cua ham(OOP)
//2. cach 2: JoptionPane de popup len ket qua xu li cua ham(J Desktop)
//3. cach 3: Ghi ra LOG file(JavaWeb)
//3 cach nay thi deu phai dung mat de xem ket qua, va tu ket luan dung sai
// Dung: tuc la ham chay ra 1 gia tri - ACTUAL VALUE
//                  va ACTUAL VALUE khop, bang voi cai gia tri ma ta mong doi, 
//                  ta tinh ra truoc = tay, goi la EXPECTED VALUE
//VD 5! thi ta hy vong ECPECTED ham tra ve 120
//      ham tra ve 120 dung - actual
// ham chay dung 5!
// sai: tui test 6!, expected 720, nhung chay ra actual =120
// ham xu li sai
// cach 4: May oi so sanh va ket luan gium tao luon vi may 
// co cac phep toan de so sanh
// con nguoi khong can nhin tung dong ket qua tra ve de luan dung sai
// may se lo cho, neu ta ca deu dung -> thi ham dung-> mau xanh
//hau het tinh huong chay ham deu dung, co 1 cai sai -> ham sai -> mau do
// DO: Chi can 1 cai Do
// XANH: tat ca phai deu dung
// muon lam dc dieu nay ta can thu vien phu tro giup cho java xanh do
// dieu nay cung co ben C# , PHP, JS, Ruby...
//Java: Junit, TestNG
//C#: NUnit, xUnit, MSTest
//PHP: PHPUnit
//...