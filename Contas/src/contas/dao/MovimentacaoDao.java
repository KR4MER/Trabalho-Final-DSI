//package contas.dao;
//
//import connectiomFactory.ConnectionFactory;
//import contas.entidade.Movimentacao;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//
//
//
//public class MovimentacaoDao {
//	private Connection connection;
//	
//	public MovimentacaoDao(){
//		this.connection = new ConnectionFactory().getConnection();
//	}
//	public void adicionaAluno(Movimentacao aluno){
//
//		String 	sql = "insert into alunos(first_name, last_name)"
//				+ "values( ?, ?)";
//		
//		PreparedStatement statment;
//		
//		try {
//			statment = connection.prepareStatement(sql);
//			
//			statment.setString(1, aluno.getNome());
//                        
//                        statment.setString(2, aluno.getSobrenome());
//                        
//			statment.execute();
//			
//			statment.close();
//			
//			System.out.println("Aluno Inserido com Sucesso!!");
//			
//			
//		} catch (SQLException e) {
//			e.getMessage();
//		}
//	}
//
//       public ResultSet buscaTodosOsAlunos() {
//       String	sql = "select * from alunos ";
//		
//		try{
//		
//			PreparedStatement statment=connection.prepareStatement(sql);
//			ResultSet rs = statment.executeQuery();
//			return rs;
//		}catch(SQLException e){
//			throw new RuntimeException(e.getMessage());
//		}
//    }
//
//    public void excluirAluno(int item) {
//        String sql = "DELETE FROM alunos where id = ? ";
//        PreparedStatement statment;
//            try {
//                statment = connection.prepareStatement(sql);
//                statment.setInt(1, item);
//                statment.execute();
//		statment.close();
//                System.out.println("Aluno excluido com sucesso!!");
//            } catch (SQLException ex) {
//                Logger.getLogger(MovimentacaoDao.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        
//    }
//
//    public void alterarAluno(Aluno aluno) {
//        String sql = "update alunos set first_name  = ?, last_name = ?  where id = ? ";
//        PreparedStatement statment;
//        try {
//                statment = connection.prepareStatement(sql);
//                statment.setString(1, aluno.getNome());
//                 statment.setString(2, aluno.getSobrenome());
//                statment.setInt(3, aluno.getId());
//                statment.execute();
//		statment.close();
//                System.out.println("Aluno alterado com sucesso!!");
//            } catch (SQLException ex) {
//                Logger.getLogger(MovimentacaoDao.class.getName()).log(Level.SEVERE, null, ex);
//            }
//    }
//
//}
