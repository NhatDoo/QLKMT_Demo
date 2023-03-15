
package sql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import qlmttest.PC1;


public class PCLenovo {
    private Connection ketnoi;
    
    public PCLenovo()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ketnoi = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=test;encrypt=true;trustServerCertificate=true;"+"username=NhatDoo;Password=Nhat123456789");
            
        }
        catch(Exception e)
        {
          e.printStackTrace();
        }
    }
    public boolean addMT(PC1 mt)
    {
        String sql ="INSERT INTO PC(TenMt,Mamt,sl,ngaynhapkho)"+
                "VALUES(?,?,?,?)";
   
       try
          {
            PreparedStatement ps = ketnoi.prepareStatement(sql);
            ps.setString(1,mt.dienten());
            ps.setString(2,mt.dienmmt());
            ps.setString(3,mt.diensl());
            ps.setDate(4,new Date(mt.dienngay().getTime()));
           
            
            return ps.executeUpdate()>0;
          }
       catch(Exception a)
       {
         a.printStackTrace();
       }
        return false;
    
    }
    public ArrayList<PC1> danhsachMT()
    {
      ArrayList<PC1> list = new ArrayList<>();
      String sql ="SELECT * FROM PC";
      try
      {
        PreparedStatement c = ketnoi.prepareStatement(sql);
        ResultSet kq = c.executeQuery();
        while (kq.next())
        {
         PC1 mt =new PC1();
         mt.luuten(kq.getString("TenMt"));
         mt.luummt(kq.getString("Mamt"));
         mt.luusl(kq.getString("sl"));
         mt.luungay(kq.getDate("ngaynhapkho"));
        
         
         list.add(mt);
        }
      }
      catch(Exception b)
      {
      b.printStackTrace();
      }
      return list;
    }
    
    
     public static void main(String[] arg)
    {
      new PCLenovo();
    }
}