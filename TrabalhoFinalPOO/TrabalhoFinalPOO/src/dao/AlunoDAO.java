
package dao;

import factory.FabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Aluno;

public class AlunoDAO {

    private final String INSERT = "INSERT INTO aluno (NOME, N1, N2) VALUES (?,?,?)";
    private final String UPDATE = "UPDATE aluno SET NOME=?, N1=?, N2=? WHERE ID=?";
    private final String DELETE = "DELETE FROM aluno WHERE ID =?";
    private final String LIST = "SELECT * FROM aluno";
    private final String LISTBYID = "SELECT * FROM aluno WHERE ID=?";
    private final String LISTBYNOME = "select * from aluno where nome LIKE ?";

    public int inserir(Aluno aluno) {

        if (aluno != null) {
            Connection conn = null;
            try {
                conn = FabricaConexao.getConexao();
                PreparedStatement pstm;
                pstm = conn.prepareStatement(INSERT);

                pstm.setString(1, aluno.getNome());
                pstm.setInt(2, aluno.getN1());
                pstm.setInt(3, aluno.getN2());

                pstm.execute();
                JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso");
                FabricaConexao.fechaConexao(conn, pstm);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir aluno no banco de"
                        + "dados " + e.getMessage());
                return 1;
            }
        } else {
            System.out.println("O aluno enviado por parâmetro está vazio");
            return 1;
        }
        return 0;
    }

    public int atualizar(Aluno aluno) {
        if (aluno != null) {
            Connection conn = null;
            try {
                conn = FabricaConexao.getConexao();
                PreparedStatement pstm;
                pstm = conn.prepareStatement(UPDATE);

                pstm.setString(1, aluno.getNome());
                pstm.setInt(2, aluno.getN1());
                pstm.setInt(3, aluno.getN2());
                pstm.setInt(4, aluno.getId());

                pstm.execute();
                JOptionPane.showMessageDialog(null, "Aluno alterado com sucesso");
                FabricaConexao.fechaConexao(conn);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar aluno no banco de"
                        + "dados " + e.getMessage());
                return 1;
            }
        } else {
            JOptionPane.showMessageDialog(null, "O aluno enviado por parâmetro está vazio");
            return 1;
        }
        return 0;
    }

    public int remover(int id) {
        Connection conn = null;
        try {
            conn = FabricaConexao.getConexao();
            PreparedStatement pstm;
            pstm = conn.prepareStatement(DELETE);

            pstm.setInt(1, id);

            pstm.execute();
            FabricaConexao.fechaConexao(conn, pstm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir aluno do banco de"
                    + "dados " + e.getMessage());
            return 1;
        }
        return 0;
    }

    public List<Aluno> getAlunos() {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        try {
            conn = FabricaConexao.getConexao();
            pstm = conn.prepareStatement(LIST);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Aluno aluno = new Aluno();

                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setN1(rs.getInt("n1"));
                aluno.setN2(rs.getInt("n2"));
                alunos.add(aluno);
            }
            FabricaConexao.fechaConexao(conn, pstm, rs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar alunos" + e.getMessage());
        }
        return alunos;
    }

    public Aluno getAlunoById(int id) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Aluno aluno = new Aluno();
        try {
            conn = FabricaConexao.getConexao();
            pstm = conn.prepareStatement(LISTBYID);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setN1(rs.getInt("n1"));
                aluno.setN2(rs.getInt("n2"));
            }
            FabricaConexao.fechaConexao(conn, pstm, rs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar alunos" + e.getMessage());
        }
        return aluno;
    }
    public List<Aluno> getAlunoByNome(String nome) {
        List<Aluno> lista = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Aluno aluno = new Aluno();
        try {
            conn = FabricaConexao.getConexao();
            pstm = conn.prepareStatement(LISTBYNOME);
            pstm.setString(1, "%" + nome + "%");
            rs = pstm.executeQuery();
            while (rs.next()) {
                aluno = new Aluno();
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setN1(rs.getInt("n1"));
                aluno.setN2(rs.getInt("n2"));
                lista.add(aluno);
            }
            FabricaConexao.fechaConexao(conn, pstm, rs);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar alunos" + e.getMessage());
        }
        return lista;
    }
}
