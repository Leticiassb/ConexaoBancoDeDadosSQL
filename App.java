import DAO.UsuarioDao;
import entity.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        
    Usuario u = new Usuario();

        u.setNome("Joao");
        u.setLogin("joao");
        u.setSenha("1234");
        u.setEmail("joao@123.com");

    new UsuarioDao().cadastrarUsuario(u);

    }
}
