package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao2;
import entity.Usuario;

public class UsuarioDao {
    
    public void cadastrarUsuario(Usuario usuario){

        String sql = "INSERT INTO USUARIO (NOME, LOGIN, SENHA, EMAIL) VALUES(?, ?, ?, ?)";

        PreparedStatement ps = null;

        try{
            ps = Conexao2.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());


            ps.execute();
            ps.close();
        } catch(SQLException e) {
            System.out.println(sql);
            e.printStackTrace();
        }
    }
}
