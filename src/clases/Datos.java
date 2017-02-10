package clases;

public class Datos {

    private int maxUser = 50;
    private Usuario misUsuarios[] = new Usuario[maxUser];
    private int contUsuarios = 0;

    public Datos() {
        Usuario miUsuario = new Usuario("Marco", "Marco Jose", "Useche Rivera", "1234", 1);
        misUsuarios[contUsuarios] = miUsuario;
        contUsuarios++;

        miUsuario = new Usuario("Carlos", "Carlos", "Gonzales", "5678", 2);
        misUsuarios[contUsuarios] = miUsuario;
        contUsuarios++;

        miUsuario = new Usuario("Maria", "Maria", "Perez", "abcd", 2);
        misUsuarios[contUsuarios] = miUsuario;
        contUsuarios++;
    }

    public Usuario[] getUsuarios() {
        return misUsuarios;
    }

    public boolean validarUsuario(String usuario, String clave) {

        boolean aux = false;

        for (int i = 0; i < contUsuarios; i++) {
            if (misUsuarios[i].getIdUsuario().equals(usuario) && misUsuarios[i].getClave().equals(clave)) {
                return true;
            }

        }

        return false;
    }

    public int posicionUsuario(String usuario) {

        for (int i = 0; i < contUsuarios; i++) {
            if (misUsuarios[i].getIdUsuario().equals(usuario)) {
                return i;
            }

        }

        return -1;
    }

    public String agregarUsuario(Usuario miUsuario) {
        if (contUsuarios == maxUser) {
            return "Se alcanzo el numero maximo de usuarios";
        }
        misUsuarios[contUsuarios] = miUsuario;
        contUsuarios++;

        return "Usuario agredado correctamente.";
    }

    public int numeroUsuarios() {
        return contUsuarios;
    }

    public String modificaUsuario(Usuario miUsuario, int pos) {
        misUsuarios[pos].setNombre(miUsuario.getNombre());
        misUsuarios[pos].setApellido(miUsuario.getApellido());
        misUsuarios[pos].setClave(miUsuario.getClave());
        misUsuarios[pos].setPerfil(miUsuario.getPerfil());
        return "Usuario modificado correctamente";
    }
    
     public String borrarUsuario( int pos) {
        
         for(int i=pos; i<contUsuarios-1; i++)
         {
             misUsuarios[i]=misUsuarios[i+1];
         }
         
         contUsuarios--;
         return "Usuario borrado correctamente";
    }
    
}
