package JDBC응용;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {
    private PreparedStatement psmt = null;
    private Connection conn = null;
    private ResultSet rs = null;
    CloudMemberDTO resultDto = null;

    // 자원 반납 메소드
    private void getClose() {
        try {
            if(rs != null)
                rs.close();
            if(psmt != null)
                psmt.close();
            if(conn != null)
                conn.close();
        }
        catch (SQLException e) {
            System.out.println("자원 반납 시 문제 발생");
        }
    }

    // 드라이버 로딩 ~ DB 연결 메소드
    private void getConn() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1524:xe";
            String user = "smhrd_kyb";
            String password = "smhrd1";
            conn = DriverManager.getConnection(url, user, password);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


    // 1. 회원가입 메소드
    public int join(CloudMemberDTO dto){
        int row = 0;

        try {
            getConn();
            String sql = "INSERT INTO CLOUDMEMBER VALUES(?, ?, ?, ?, ?)";

            psmt = conn.prepareStatement(sql);
            psmt.setString(1, dto.getId());
            psmt.setString(2, dto.getPw());
            psmt.setString(3, dto.getName());
            psmt.setInt(4, dto.getAge());
            psmt.setInt(5, dto.getScore());
            row = psmt.executeUpdate();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            getClose();
        }
        return row;
    }

    
    // 2. 로그인 메소드
    public CloudMemberDTO login(CloudMemberDTO dto) {
        try {
            getConn();
            String sql = "SELECT ID, NAME, AGE, SCORE FROM CLOUDMEMBER WHERE ID = ? AND PW = ?";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, dto.getId());
            psmt.setString(2, dto.getPw());
            rs = psmt.executeQuery();
    
            if(rs.next()) {
                String resultId = rs.getString("id");
                String resultName = rs.getString("name");
                int resultAge = rs.getInt("age");
                int resultScore = rs.getInt("score");
                resultDto = new CloudMemberDTO(resultId, null, resultName, resultAge, resultScore);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            getClose();
        }
        return resultDto;

    }

}
