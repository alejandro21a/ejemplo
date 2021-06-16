
import java.time.LocalDate;

public class Directivo extends Empleado {
	private double comision;
	
	public Directivo(String apellido, String oficio, LocalDate localDate, double salario, int emp_no,double comision) {
		super(apellido, oficio, localDate, salario, emp_no);
		this.comision=comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		
		return  "Directivo [apellido="+ apellido + ", oficio=" + oficio + ", fecha_alt=" + fecha_alt + ", salario= " 
					+ salario + ", emp_no=" + emp_no + " ,comision=" + comision + "]";
	}



}
