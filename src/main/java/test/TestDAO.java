package test;

import com.examenonline.bean.UsuarioBE;
import com.examenonline.dao.UsuarioDAO;

public class TestDAO {
	public static void main(String[] args) {
		UsuarioDAO dao = new UsuarioDAO();
		UsuarioBE usuario = new UsuarioBE();
		UsuarioBE oUsuario = dao.obtenerUsuario("luis");
		
		System.out.println(oUsuario.getNombres());
	}
}
