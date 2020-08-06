
package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FabricaConexao {
    //Dados para a conexão com o banco
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    private static final String DATABASE = "escola";
    private static final String STR_CONEXAO = "jdbc:mysql://localhost:3306/";

    public static Connection getConexao() throws SQLException {

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(STR_CONEXAO + DATABASE, USUARIO, SENHA);
            return conn;

        } catch (SQLException e) {
            throw new SQLException("Erro ao conectar "
                    + "com a base de dados" + e.getMessage());
        }
    }

    public static void fechaConexao(Connection conn) {

        try {
            if (conn != null) {
                conn.close();
                //System.out.println("Fechada a conexão com o banco de dados");
            }

        } catch (Exception e) {
            System.out.println("Não foi possível fechar a conexão com o banco de dados " + e.getMessage());
        }
    }

    public static void fechaConexao(Connection conn, PreparedStatement stmt) {

        try {
            if (conn != null) {
                fechaConexao(conn);
            }
            if (stmt != null) {
                stmt.close();
                //System.out.println("Statement fechado com sucesso");
            }

        } catch (Exception e) {
            System.out.println("Não foi possível fechar o statement " + e.getMessage());
        }
    }

    public static void fechaConexao(Connection conn, PreparedStatement stmt, ResultSet rs) {

        try {
            if (conn != null || stmt != null) {
                fechaConexao(conn, stmt);
            }
            if (rs != null) {
                rs.close();
                //System.out.println("ResultSet fechado com sucesso");
            }

        } catch (Exception e) {
            System.out.println("Não foi possível fechar o ResultSet " + e.getMessage());
        }
    }
}
