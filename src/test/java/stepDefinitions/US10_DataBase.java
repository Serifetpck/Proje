package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.DatabaseUtility;

import java.sql.*;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static utilities.DatabaseUtility.getColumnData;

public class US10_DataBase {
    List<String> idList;
        @Given("Doctor set the meddunna base url with")
        public void doctorSetTheMeddunnaBaseUrlWith() throws ClassNotFoundException, SQLException {
            //1.Driver Yükle

            //2) Bağlantı Oluştur.
            DatabaseUtility.createConnection();


            //3) Statament
            //Statement st =con.createStatement();
            //PreparedStatement daha az yük bindirir
            String query=("select * from appointment where physician_id=(select id from physician where first_name='Sifa') ");



            idList=DatabaseUtility.getColumnNames(query);
            for (int i = 0; i <idList.size() ; i++) {
                System.out.println(idList.get(i));
            }
            System.out.println("id: " + getColumnData(query, "id"));
            System.out.println("Start_Date: " + getColumnData(query, "start_date"));
            System.out.println("End_Date: " + getColumnData(query, "end_date"));
            System.out.println("Status: " + getColumnData(query, "status"));




            assertEquals((long)306280, getColumnData(query, "id").get(0));
            assertEquals("2022-11-19 00:00:00.0",getColumnData(query, "start_date").get(0).toString());
            assertEquals("2022-11-19 01:00:00.0",getColumnData(query, "end_date").get(0).toString());
            assertEquals("UNAPPROVED",getColumnData(query, "status").get(0));








            //4)ResultSet
           // ResultSet veri= st.executeQuery("select * from appointment where id= 306280");
             //ResultSet rs= ps.executeQuery();
             //Not:ResultSetMetaData daha farklı verler örn değişken türü ne gibi,sütün sayısı gibi
            // ResultSetMetaData rsmd= rs.getMetaData();

            //System.out.println(rsmd.getColumnCount());//column sayısı
            //5)Sonucları Al
          //  while (veri.next()){
          //      //index kullanarak
          //      System.out.println(veri.getInt(1)+
          //              veri.getString(2)+
          //              veri.getString(3)+
          //              veri.getString(4));
          //  }
          //  //6)sutun ismi kullanarak
          //  System.out.println(veri.getInt("id")+  veri.getString("start_date")+
          //          veri.getString("end_date")+
          //          veri.getString("status"));


            //6)kapatma
           // con.close();
           // st.close();
           // veri.close();
        }
}
