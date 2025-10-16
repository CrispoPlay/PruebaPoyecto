//clase revisada - validaciones completas
public class Notificaciones {
    private Usuario receptorN;
    private String mensaje;
    private boolean leido;
// crea los mensajes de el receptor y el mensaje
    public Notificaciones(Usuario receptorN, String mensaje) {
        this.receptorN = receptorN;
        this.mensaje = mensaje;
        this.leido = false;
    }
    //crea las cualidades de las notificaciones, dandole que el mensaje sea leido o caido
    public Usuario getReceptorN() { return receptorN; }
    public void setReceptorN(Usuario receptorN) { 
        if (receptorN == null ){ 
                throw new IllegalArgumentException("No existe un receptor");
        }
        this.receptorN = receptorN; 
    }
    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { 
        if (mensaje == null || mensaje.isEmpty()){ 
                throw new IllegalArgumentException("Mensaje inválido");
        }
        this.mensaje = mensaje; 
    }
    public boolean isLeido() { return leido; }
    public void marcarLeido(boolean newestado) {
        this.leido = newestado;
    }
    //muestra como es el mensaje , por el nombre del receptor, mas tambien lo que contiene el mensaje y si a sido leido 
    public String toString() {
        return "De: " + receptorN.getNombre() + " | Mensaje: " + mensaje + " | Leído: " + leido;
    }
}
//puse el toString que devuelve uan representacion mas legible de la notificacion 
//mas tambien tiene el get que se usa para el receptor y el mensaje 

