import dao.UserPosDAO;
import model.BeanUserFone;
import model.Telefone;
import model.Userposjava;
import org.junit.Test;

import java.util.List;

public class TesteBancoJdbc {

    @Test
    public void initBanco() {
        UserPosDAO userPosDAO = new UserPosDAO();
        Userposjava userposjava = new Userposjava();

        userposjava.setNome("Paulo");
        userposjava.setEmail("paulo.teste@gmail.com");

        userPosDAO.salvar(userposjava);

    }

    @Test
    public void initListar() {
        UserPosDAO dao = new UserPosDAO();
        try {
            List<Userposjava> list = dao.listar();

            for (Userposjava userposjava : list) {
                System.out.println(userposjava);
                System.out.println("--------------------------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void initBuscar() {
        UserPosDAO dao = new UserPosDAO();
        try {
            Userposjava objetoBanco = dao.buscar(5L);
            objetoBanco.setNome("Nome alterado com metodo atualizar");
            dao.atualizar(objetoBanco);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void initAtualizar() {
        try {
            UserPosDAO dao = new UserPosDAO();
            Userposjava objetoBanco = dao.buscar(5L);
            objetoBanco.setNome("Nome mudado com o metodo atualizar");
            dao.atualizar(objetoBanco);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void initDeletar() {
        try {
            UserPosDAO dao = new UserPosDAO();
            dao.deletar(7L);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testeInsertTelefone() {

        Telefone telefone = new Telefone();
        telefone.setNumero("(16) 4545-4545");
        telefone.setTipo("Casa");
        telefone.setUsuario(8L);

        UserPosDAO dao = new UserPosDAO();
        dao.salvarTelefone(telefone);


    }

    @Test
    public void testeCarregaFoneUser() {

        UserPosDAO dao = new UserPosDAO();

        List<BeanUserFone> beanUserFones = dao.listaUserFone(16L);

        for (BeanUserFone beanUserFone : beanUserFones) {
            System.out.println(beanUserFone);
            System.out.println("------------------------------------------------------");


        }


    }


}





