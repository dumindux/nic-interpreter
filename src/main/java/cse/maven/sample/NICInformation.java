/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.maven.sample;
import org.joda.time.*;

/**
 *
 * @author Dumindu
 */
public class NICInformation {
    private String NICString;

    public NICInformation(String NICString) throws Exception{
        if(NICString.length()!=10)
            throw new Exception("input error");
        this.NICString = NICString;
    }
    public boolean isMale()throws Exception
    {
        int days=Integer.parseInt(NICString.substring(2,5));
        if(days>499)
            return false;
        else
            return true;
    }
    public DateTime birthday()throws Exception
    {
        int month=0,day=0,year=0;
        DateTime currentDate=new DateTime();
        int curYear=Integer.parseInt(Integer.toString(currentDate.getYear()).substring(2,4))-16;
        int nicYear=Integer.parseInt(NICString.substring(0, 2));
        if(nicYear<curYear)
        {
            year=Integer.parseInt("20"+nicYear);
        }
        else
            year=Integer.parseInt("19"+nicYear);
        int days=Integer.parseInt(NICString.substring(2,5))-1;
        if(!(days<500))
            days=days-500;
        DateTime date=new DateTime(2004,1,1,0,1);
        date=date.plusDays(days);
        
       // System.out.println(year+"\\"+date.getMonthOfYear()+"\\"+date.getDayOfMonth());
        
       // if()
        return new DateTime(year,date.getMonthOfYear(),date.getDayOfMonth(),0,1);
    }
    public boolean isVoter()throws Exception
    {
        //System.out.println(birthday().plusYears(18));
        if(birthday().plusYears(18).compareTo(new DateTime())<0)
            return true;
        else
            return false;
    }
}
