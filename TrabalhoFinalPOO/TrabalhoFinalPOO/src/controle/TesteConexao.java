
package controle;

import factory.FabricaConexao;
import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) {
        try {
            Connection conexao = FabricaConexao.getConexao();
            //System.out.println("Conexão estabelecida");
            FabricaConexao.fechaConexao(conexao);
        } catch (SQLException ex) {
            System.out.println("ERRO: não foi possível conectar");
        }
    }
    
}
