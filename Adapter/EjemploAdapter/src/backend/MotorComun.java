package backend;

public class MotorComun extends Motor {

    public MotorComun(){
        super();
        System.out.println("Creando motor común...");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motor común.");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor común.");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor común.");
    }
}

    //Si el usuario hace el comando del motor comun, este recibe directamente la orden de la clase Motor y ejecuta sus metodos.