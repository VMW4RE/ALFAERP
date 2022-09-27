package alfaerp;


import Classes.Cliente;
import DAO.ClienteDAO;
import Forms.frmCadCli;
import Forms.frmLogin;

public class ALFAERP {

     
      
    public static void main(String[] args) {
        ClienteDAO clienteDao = new ClienteDAO();
        
        for(Cliente c : clienteDao.getClientes()) {
			System.out.println("Contato: "+c.getNomecli());
        }
        
        
        
        
        
        /*frmLogin Login = new frmLogin();
        Login.setLocationRelativeTo(null);
        Login.setVisible(true);*/

        
    }
    
}

