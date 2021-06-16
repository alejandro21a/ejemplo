import java.time.LocalDate;



public class Analista extends Empleado{
		private String herramienta;
		
		public String getHerramienta() {
			return herramienta;
		}

		public void setHerramienta(String herramienta) {
			this.herramienta = herramienta;
		}

		public Analista(String apellido, String oficio, LocalDate localDate, double salario, int emp_no,String herramienta) {
			super(apellido, oficio, localDate, salario, emp_no);
		
			this.herramienta=herramienta;
		}

		@Override
		public String toString() {
			return "Analista [apellido="+ apellido + ", oficio=" + oficio + ", fecha_alt=" + fecha_alt + ", salario= "  
					 +salario + ", emp_no=" + emp_no + ", herramienta=" + herramienta + "]";
		}

		
	}