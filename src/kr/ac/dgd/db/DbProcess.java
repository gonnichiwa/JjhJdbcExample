package kr.ac.dgd.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbProcess {
    private static final String DB_URL  = "jdbc:mariadb://localhost:3306/DGD";
    private static final String DB_USER = "root";
    private static final String DB_PW   = "0000";

    private final String selectedNumber;

    // 생성자를 명시적으로 지정하면 기본생성자 DbProcess()는 호출될 수 없다. (따로 명시 해야 한다.)
    public DbProcess(String selectedNumber) {
        this.selectedNumber = selectedNumber;
    }

    public void startProcessing() throws SQLException {
        // Connection, PreparedStatement, ResultSet은 interface 객체이다.
        Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PW);
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        // selectedNumber에 따라 쿼리를 달리 한다.
        switch (this.selectedNumber){
            case "1":
                pstmt = conn.prepareStatement("select * from Student");
                rs = pstmt.executeQuery();
                /* 쿼리날린 결과를 가지고 콘솔에 출력한다. */
                while(rs.next()){
                    System.out.println(
                              rs.getInt(1)    + " | "
                            + rs.getString(2) + " | "
                            + rs.getInt(3)    + " | "
                            + rs.getString(4) + " | "
                            + rs.getString(5));
                }
                break;
            default :
                System.out.println("nothing to do"); break;
        }
    }
}
