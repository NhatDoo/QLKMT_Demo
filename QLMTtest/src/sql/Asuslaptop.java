
package sql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import qlmttest.laptop;

public class Asuslaptop {
    private Connection ketnoi;
    
    public Asuslaptop()
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
    public boolean addlaptop(laptop mt)
    {
        String sql ="INSERT INTO Asus(tenlaptop,hanglaptop,malaptop,sl,ngaynhap)"+
                "VALUES(?,?,?,?,?)";
   
       try
          {
            PreparedStatement ps = ketnoi.prepareStatement(sql);
            ps.setString(1,mt.getTenlaptop());
            ps.setString(2,mt.getHanglaptop());
            ps.setString(3,mt.getMalaptop());
            ps.setString(4,mt.getSl());
            ps.setDate(5,new Date(mt.getNgaynhap().getTime()));
           
            
            return ps.executeUpdate()>0;
          }
       catch(Exception a)
       {
         a.printStackTrace();
       }
        return false;
    
    }
    public ArrayList<laptop> danhsachlaptop()
    {
      ArrayList<laptop> list = new ArrayList<>();
      String sql ="SELECT * FROM Asus";
      try
      {
        PreparedStatement c = ketnoi.prepareStatement(sql);
        ResultSet kq = c.executeQuery();
        while (kq.next())
        {
         laptop mt =new laptop();
         mt.setTenlaptop(kq.getString("tenlaptop"));
         mt.setHanglaptop(kq.getString("hanglaptop"));
         mt.setMalaptop(kq.getString("malaptop"));
         mt.setSl(kq.getString("sl"));
         mt.setNgaynhap(kq.getDate("ngaynhap"));
        
         
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

