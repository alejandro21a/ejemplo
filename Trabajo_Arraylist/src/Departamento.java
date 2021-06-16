
import java.util.ArrayList;

public class Departamento {
	private int dep_no;
	private String dnombre;
	private String localizacion;
	public ArrayList <Empleado>listaEmpleados;
	
	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	public Departamento(int dep_no, String dnombre, String localizacion) {
	
		this.dep_no = dep_no;
		this.dnombre = dnombre;
		this.localizacion = localizacion;
		listaEmpleados=new ArrayList<Empleado>();
		
	}
	
	public int getDep_no() {
		return dep_no;
	}
	@Override
	public String toString() {
		return "Departamento [dep_no=" + dep_no + ", dnombre=" + dnombre + ", localizacion=" + localizacion
				+ ", listaEmpleados=" + listaEmpleados + "]";
	}


	public void agregarEmpleado(Empleado empleado){
		this.listaEmpleados.add(empleado);
	}

	public void setDep_no(int dep_no) {
		this.dep_no = dep_no;
	}
	public String getDnombre() {
		return dnombre;
	}
	public void setDnombre(String dnombre) {
		this.dnombre = dnombre;
	}
	public String getLocalizacion() {
		return localizacion;
	}
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}
	
}