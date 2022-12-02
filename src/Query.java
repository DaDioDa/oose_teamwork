import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class query {
    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/oose";
        String user = "root";
        String password = "00001234";
        Statement st = null;
        ResultSet rs = null;
        ResultSetMetaData rsmeta = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =
                    DriverManager.getConnection(url,
                            user, password);
            st = conn.createStatement();  // 產生 SQL 敘述物件

            rs = st.executeQuery("select * from main");// 下達 SQL 命令

            while (rs.next()) {       // 擷取下一筆紀錄

                System.out.printf("%s\t", rs.getString("name"));
                System.out.printf("%s\t", rs.getInt("price"));
                if(rs.getBoolean("lunch")){ //lunch==1,回傳為午餐
                    System.out.printf("%s\t", "午餐");
                }
                else{
                    System.out.printf("%s\t", "晚餐");
                }
                System.out.printf("\n");

            }
            if(conn != null && !conn.isClosed()) {
                System.out.println("資料庫連線測試成功！");
                conn.close();
            }

        }
        catch(ClassNotFoundException e) {
            System.out.println("找不到驅動程式類別");
            e.printStackTrace();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
