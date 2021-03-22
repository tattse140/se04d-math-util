/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu;

/**
 *
 * @author BiV
 */
public class MathUtility {
    public static final double PI = 3.1415;
    //class nay chua 1 nhom ham toan hoc
    
    //ham tinh n!
    // vi giai thua tang rat nhanh, 21! tran kieu long
    //kieu long chiu dc 10^18 con so, 0. lon hon nua la thua
    //am giai thua khong tinh dc
    //ham chi chap nhan tu 0...20! > long
    // 0! = 1! = 1
    
    
    public static long getFactorial(int n){
        
            if(n<0 || n>20)
                throw new IllegalArgumentException("invalid argument. n must be between 0 .. 20");
        
            if( n==0 || n ==1)
                return 1; 
            
            long result = 1;// co tinh de value nay
             
            for(int i =2; i<=n; i++)
                 result *=i;
             //n!=1.2.3.4.5....n
            return result;
            
    }
    

}
