package dao;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Usuario;

public class UsuarioDAO {
	public boolean validar(Usuario usuario) {
		String sqlSelect = "SELECT username, password FROM usuario "
				+ "WHERE username = ? and password = ?";
		// pega a conexão em um try normal para que ela não seja fechada
		String senha = usuario.getPassword();
		
		try {
			 MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
			 byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));
			 StringBuilder hexString = new StringBuilder();
			  for (byte b : messageDigest) {
			         hexString.append(String.format("%02X", 0xFF & b));
			       }
			  String senhahex = hexString.toString();
			
			
			
			Connection conn = ConnectionFactory.obtemConexao();
			// usando o try with resources do Java 7, que fecha o que abriu
			try (PreparedStatement stm = conn.prepareStatement(sqlSelect);) {
				stm.setString(1, usuario.getUsername());
				stm.setString(2, senhahex);
				try (ResultSet rs = stm.executeQuery();) {
					if (rs.next()) {
						return true;
					} else {
						return false;
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (SQLException e1) {
				System.out.print(e1.getStackTrace());
			}
		} catch (SQLException e2) {
			e2.printStackTrace();
		} catch (NoSuchAlgorithmException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (UnsupportedEncodingException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		return false;
	}
}
