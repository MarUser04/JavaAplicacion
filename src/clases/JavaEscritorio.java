
package clases;

import formularios.frmLogin;


public class JavaEscritorio {


    public static void main(String[] args) {
        
        Datos misDatos= new Datos();
        
        
        frmLogin miLogin= new frmLogin();
        miLogin.setDatos(misDatos);
        
        miLogin.setLocationRelativeTo(null);
        miLogin.setVisible(true);
        
    }
    
}
