
package modelo;

import dao.AlunoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TabelaAlunoModel extends AbstractTableModel{ 
    private List<Aluno> tabela = new ArrayList<Aluno>();
    private final int COL_ID = 0;
    private final int COL_NOME = 1;
    private final int COL_N1 = 2;
    private final int COL_N2 = 3;

    public TabelaAlunoModel() {
        AtualizarTabela();
    }
    public void AtualizarTabela(){
        AlunoDAO aDAO = new AlunoDAO();
        tabela = aDAO.getAlunos();
        this.fireTableDataChanged();
    }
    @Override
    public int getRowCount() {
        return tabela.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Aluno aluno = tabela.get(rowIndex);
        switch (columnIndex) {
            case COL_ID: 
                return (Integer)aluno.getId();
            case COL_NOME:
                return aluno.getNome();
            case COL_N1:
                return (Integer)aluno.getN1();
            case COL_N2:
                return (Integer)aluno.getN2();
        }
        return null;
    }
    @Override
    public String getColumnName(int column){
        switch (column) {
            case COL_ID: 
                return "ID";
            case COL_NOME:
                return "Nome";
            case COL_N1:
                return "N1";
            case COL_N2:
                return "N2";
        }
        return null;
    }
    
}
