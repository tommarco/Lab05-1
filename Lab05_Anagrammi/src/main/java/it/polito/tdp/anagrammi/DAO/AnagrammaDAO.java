package it.polito.tdp.anagrammi.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.anagrammi.model.Anagramma;


public class AnagrammaDAO {
	
	public boolean dizionario(String s){
		
		final String sql = "SELECT nome FROM parola WHERE nome= ? ";
		
		
		List <String> word= new LinkedList <String>();
	

		try {
			Connection conn =DBconnect.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, s);

			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				String nome = rs.getString("nome");
				
				
				word.add(nome);
		
		
			}
			rs.close();
			conn.close();
			st.close();
		
				return true;
		
		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db", e);
		}

	}
}

	
	
	
	
