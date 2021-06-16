
import java.time.LocalDate;

public class Empleado {
	public String apellido;
	public String oficio;
	public LocalDate fecha_alt ;
	public double salario;
	public int emp_no;
	
	
	public Empleado(String apellido, String oficio, LocalDate localDate, double salario, int emp_no) {

		this.apellido = apellido;
		this.oficio = oficio;
		this.fecha_alt = localDate;
		this.salario = salario;
		this.emp_no = emp_no;
		
	}
	
	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getOficio() {
		return oficio;
	}


	public void setOficio(String oficio) {
		this.oficio = oficio;
	}


	public LocalDate getFecha_alt() {
		return fecha_alt;
	}


	public void setFecha_alt(LocalDate fecha_alt) {
		this.fecha_alt = fecha_alt;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public int getEmp_no() {
		return emp_no;
	}


	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}


	@Override
	public String toString() {
		return "Empleado [apellido=" + apellido + ", oficio=" + oficio + ", fecha_alt=" + fecha_alt + ", salario="
				+ salario + ", emp_no=" + emp_no + "]";
	}

}