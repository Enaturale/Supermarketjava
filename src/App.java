import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        splash splashscreen = new splash();
        try{
        for(int i = 1; i<=100; ++i){
            
                Thread.sleep(40);
                splashscreen.progress.setValue(i);
                splashscreen.progressstatus.setText(Integer.toString(i) + "%");

        }

            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                //e1.printStackTrace();
            }    
            login loginscreen = new login();
            splashscreen.frame.dispose();     
            
            


            //connecting the mysql database
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/supermarket", "root", "rrot"
                    );
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from emp");
                while(rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
                }
                con.close();

            }catch(Exception e){
                System.out.println(e);

            }


        }
        
        
        //login loginscreen = new login();
    }

