/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise6;

import java.util.Scanner;

/**
 *
 * @author Thiagarajan
 */
public class taxpercent {
    public static void main(String[] args){
        customer obj=new employee();
        employee emp=new employee();
        obj.information();
        obj.show();
    }
    
}
interface customer
{
    void information();
    void show();
    Scanner obj=new Scanner(System.in);         
}
class employee implements customer
{
    String m;
    int in;
    int tax;
    @Override
    public void information()
    {
        System.out.println("enter male/female:");
        m=obj.next();
        System.out.println("enter income:");
        in=obj.nextInt();
    }
    @Override
    public void show()
    {
        if(in<=190000)
        {            
            if("male".equals(m))
                System.out.println("tax is nil");
            if("female".equals(m))
                System.out.println("tax is nil");            
        }
        else if(in<=200000 && in>190000)
        {
            if("male".equals(m))
                { 
                   tax=in*10/100;
                   System.out.println("tax is "+tax);
                }
            if("female".equals(m))
                System.out.println("tax is nil");                    
        }
        else if(in<=500000 && in>200000)
        {
            if("male".equals(m))
            {
                tax=in*20/100;
                System.out.println("tax is "+tax);
            }     
            if("female".equals(m))
            {
                tax=in*10/100;
                System.out.println("tax is "+tax);
            } 
        }
        else
        {
            if("male".equals(m))
            {
                tax=in*25/100;
                System.out.println("tax is 25%");
            }    
            if("female".equals(m))
            {
                tax=in*20/100;
                System.out.println("tax is "+tax);
            }    
        }
        
    }
}
