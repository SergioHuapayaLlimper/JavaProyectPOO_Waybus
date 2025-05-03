package Proyecto;
import java.util.ArrayList;

public class MantenimientoEmpleados {
    private ArrayList<RegistroEmpleados> listregistroemple;
    
    public MantenimientoEmpleados(){
        listregistroemple = new ArrayList<>();
    }
    
    public void AgregarEmpleado(RegistroEmpleados registroemple){
        listregistroemple.add(registroemple);
    }
    
    public ArrayList<RegistroEmpleados> getListaRegistroEmpleadoses(){
        return listregistroemple;
    }
}
