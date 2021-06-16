
/***************************************************************
 * Autor:Alejandro Rodriguez Calderon                          *
 * Fecha:01/04/21                                              *
 * Descripción: menu de insertar modificar mostrar y borrar    *
   datos de un Arraylist                                       *
 * Relacion entre clases: composicion ya que si se borra un    * 
   departamento se deberia borrar los empleados                *
 * *************************************************************/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

public class Principal{

	static ArrayList<Departamento> listaDepartamentos=new ArrayList<Departamento>();

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main (String args[])   {
	

		Departamento d1=new Departamento(1, "ventas", "VVa");
		Departamento d2=new Departamento(2, "ventas", "VVa");
		Departamento d3=new Departamento(3, "finanzas", "DB");
		Departamento d4=new Departamento(4, "ventas", "VVa");
	
		listaDepartamentos.add(d1);
		listaDepartamentos.add(d2);
		listaDepartamentos.add(d3);	
		listaDepartamentos.add(d4);
		
		Analista e1=new Analista("Perez","Analista", LocalDate.of(2012, 5, 3), 5000, 1,"eclipse");
		Directivo e2=new Directivo("Gonzalez","Directivo", LocalDate.of(2002, 9, 25), 1267, 2,123);
		Empleado e3=new Empleado("Guisado","Programador", LocalDate.of(2000, 7, 12), 2300, 3);
		Empleado e4=new Empleado("Ramos","Abogado", LocalDate.of(1982, 11, 7), 3675, 4);
	
		d1.agregarEmpleado(e1);
		d3.agregarEmpleado(e4);
		d2.agregarEmpleado(e2);
		d4.agregarEmpleado(e3);
		
	

	

		boolean salir = false;
		int opcion;
	 
	        while (!salir) {
	 
	        	System.out.println("MENÚ POR CONSOLA");
	           
	            System.out.println("1.Mostrar");
	            System.out.println("2.Añadir un departamento");
	            System.out.println("3.Insertar un empleado a un departamento");
	            System.out.println("4.Borrar empleado");    
	            System.out.println("5.Modificar");
	            System.out.println("6.Salir");
	 
	            try {
	 
	                System.out.println("Escribe una de las opciones");
	                opcion = Integer.parseInt (br.readLine()); 
	 
	                switch (opcion) {
	                    case 1:
	                    	mostrar();
	                        break;
	                    case 2:
	                    	insertar();
	                        break;
	                    case 3:
	                    	insertarEmp();
	                        break;
	                    case 4:
	                    	borrarEmp();
	                    	break;
	                    case 5:
	                    	modificar();
	                    	break;
	                    
	                    case 6:
	                        salir = true;
	                        break;

	                    default:
	                        System.out.println("Solo puedes elegir una opcion entre el 1 y 5");
	                        
	                }
	           
	            } catch (InputMismatchException e) { // salta cuando se introduce un numero decimal
	                System.out.println("Valor no valido.Debes insertar un número entero entre el 1 y el 6");
	                 
	            }
	            catch (NumberFormatException e) { // salta cuando el valor no es un numero (Ej: +,-)
	                System.out.println("Valor no valido.Debes insertar un número entero entre el 1 y el 6");
	                      
	            }catch (IOException e) {			
	                System.out.println("Valor no valido.Debes insertar un número entero entre el 1 y el 6");
			}
	           
	        }
	       
	        System.out.println("Fin del programa");

	    }
	//menu que pide si quieres modificar departamento o empleado
	private static void modificar() {
		
		boolean salir = false;
		int opcion;
	 
	        while (!salir) {
	 
	        	System.out.println("MENÚ POR CONSOLA");	    
	        	
	        	System.out.println("¿Que desea modificar?");
	        	System.out.println("1.Departamento");
	        	System.out.println("2.Empleado");
	        	System.out.println("3.Salir");
	            
	        	try {
	 
	                System.out.println("Escribe una de las opciones");
	                opcion = Integer.parseInt (br.readLine()); 
	 
	                switch (opcion) {
	                    case 1:
	                    	modificarDepartamento();
	                        break;
	                    case 2:
	                    	modificarTipoEmpleado();
	                        break;
	                    case 3:
	                        salir = true;
	                        break;

	                    default:
	                        System.out.println("Solo puedes elegir una opcion entre el 1 y 5");
	    
	                }
	           
	            } catch (InputMismatchException e) { // salta cuando se introduce un numero decimal
	                System.out.println("Valor no valido.Debes insertar un número entero entre el 1 y el 3");
	                 
	            }
	            catch (NumberFormatException e) { // salta cuando el valor no es un numero (Ej: +,-)
	                System.out.println("Valor no valido.Debes insertar un número entero entre el 1 y el 3");
	                      
	           }catch (IOException e) {
	        	   System.out.println("Valor no valido.Debes insertar un número entero entre el 1 y el 3");
				} 

	        }
	       
	        System.out.println("Fin del programa");

	    }
	//menu para pedir que tipo de empleado quiere el usuario modificar
	private static void modificarTipoEmpleado()  {

		boolean salir = false;
		int opcion;
	 
	        while (!salir) {
	 
	        	System.out.println("MENÚ POR CONSOLA");	    
	        	
	        	System.out.println("¿Que tipo de empleado quiere modificar?");
	        	System.out.println("1.Empleado normal");
	        	System.out.println("2.Directivo");
	        	System.out.println("3.Analista");
	        	System.out.println("4.Salir");
	            
	        	try {
	 
	                System.out.println("Escribe una de las opciones");
	                opcion = Integer.parseInt (br.readLine()); 
	 
	                switch (opcion) {
	                    case 1:
	                    	modificarEmp();
	                        break;
	                    case 2:
	                    	modificarDirectivo();
	                        break;
	                    case 3:
	                    	modificarAnalista();
	                        break;
	                    case 4:
	                        salir = true;
	                        break;

	                    default:
	                        System.out.println("Solo puedes elegir una opcion entre el 1 y 5");
	    
	                }
	           
	            } catch (InputMismatchException e) { // salta cuando se introduce un numero decimal
	                System.out.println("Valor no valido.Debes insertar un número entero entre el 1 y el 4");
	                 
	            }
	            catch (NumberFormatException e) { // salta cuando el valor no es un numero (Ej: +,-)
	                System.out.println("Valor no valido.Debes insertar un número entero entre el 1 y el 4");
	                      
	            }catch (IOException e) {
	            	 System.out.println("Valor no valido.Debes insertar un número entero entre el 1 y el 4");
                     
				}

	        }
	       
	        System.out.println("Fin del programa");

	    }

	//metodo para modificar los atributos de un analista
	private static void modificarAnalista() throws NumberFormatException, IOException {

		mostrar();
		
		boolean salir = false;
		System.out.println("Introduce el numero de empleado");

		int emp_nob=Integer.parseInt(br.readLine());
	
		Departamento D;
	
		Empleado E;
		
		for (int i = 0; i < listaDepartamentos.size(); i++) {
		
			D=(Departamento) listaDepartamentos.get(i);
		
			for (int j = 0; j <D.listaEmpleados.size(); j++) {
			
				E=(Empleado) D.listaEmpleados.get(j);
			
				if (E.getEmp_no()==emp_nob) {
					if (E.getOficio().equals("Analista")) {
					 while (!salir) {
						 
				        	System.out.println("¿Que quieres modificar?");
				            System.out.println("1. Apellido del empleado");
				            System.out.println("2. Oficio del empleado");
				            System.out.println("3. Salario");  
				            System.out.println("4. Numero del empleado");
				            System.out.println("5. Herramienta");
				            System.out.println("6. Salir");
				 
				            try {
				 
				                System.out.println("Escribe una de las opciones");
				                int opcion = Integer.parseInt (br.readLine()); 
				 
				                switch (opcion) {
				                    case 1:

				    					System.out.println("Introduce un nuevo apellido");
				    					String apellido=br.readLine();
				    				
				    					E.setApellido(apellido);
				    			
				                        break;
				                    case 2:
				                    	System.out.println("Introduce un nuevo oficio");
				    					String oficio=br.readLine();
				            	
				    					E.setOficio(oficio);
				                        break;
				                    case 3:				                    
				                    	System.out.println("Introduce un nuevo salario");
				    					double salario=Double.parseDouble(br.readLine());
				            	
				    					E.setSalario(salario);
				                          break;
				                    case 4:
				                    	boolean enc=false;
						                   
				                    	int emp_no=0;
				                    	
				                    	while(enc==false) {
				                    	
				                    		System.out.println("Introduce un nuevo numero de empleado");				   
				                    		emp_no=Integer.parseInt(br.readLine());	
				    						
				                    		if (existeEmp(emp_no)==false) {
						        						
				                    			enc=true;			
				    				
				    							}
				    					
				                    		if (enc==true) {

				                    			E.setEmp_no(emp_no);	
				                    			
				                    		}else {										
				                    			System.out.println("El numero ya existe");
				                    		}
				    					
				                    	}
				    					
				                    	break;
				                    case 5:
				                    	System.out.println("Introduce una nueva herramienta");
				    					String herramienta=br.readLine();
				    					((Analista) E).setHerramienta(herramienta);
				                    	break;
				                    case 6:
				                    	 salir = true;
				                        break;

				                    default:
				                        System.out.println("Solo puedes elegir una opcion entre el 1 y 3");
				    
				                }
				           
				            } catch (InputMismatchException e) { // salta cuando se introduce un numero decimal
				                System.out.println("Valor no valido.Debes insertar un número entero entre el 1 y el 4");
				                 
				            }
				            catch (NumberFormatException e) { // salta cuando el valor no es un numero (Ej: +,-)
				                System.out.println("Valor no valido.Debes insertar un número entero entre el 1 y el 4");
				                      
				            }catch (IOException e) {
				            	 System.out.println("Valor no valido.Debes insertar un número entero entre el 1 y el 4");
			                     
							}

				        }
				       
				        System.out.println("Fin del modificar");		
			}}}}}	

	//metodo para modificar los atributos de un directivo
	private static void modificarDirectivo() throws IOException {
		mostrar();
		
		boolean salir = false;
		System.out.println("Introduce el numero de empleado");

		int emp_nob=Integer.parseInt(br.readLine());
	
		Departamento D;
	
		Empleado E;
		
		for (int i = 0; i < listaDepartamentos.size(); i++) {
		
			D=(Departamento) listaDepartamentos.get(i);
		
			for (int j = 0; j <D.listaEmpleados.size(); j++) {
			
				E=(Empleado) D.listaEmpleados.get(j);
			
				if (E.getEmp_no()==emp_nob) {
				
					if (E.getOficio().equals("Directivo")) {
					
				
					 while (!salir) {
						 
				        	System.out.println("¿Que quieres modificar?");
				            System.out.println("1. Apellido del empleado");
				            System.out.println("2. Oficio del empleado");
				            System.out.println("3. Salario");  
				            System.out.println("4. Numero del empleado");
				            System.out.println("5. Comision");
				            System.out.println("6. Salir");
				 
				            try {
				 
				                System.out.println("Escribe una de las opciones");
				                int opcion = Integer.parseInt (br.readLine()); 
				 
				                switch (opcion) {
				                    case 1:
				    					
				                    	System.out.println("Introduce un nuevo apellido");
				    					String apellido=br.readLine();				            	
				    					E.setApellido(apellido);
				    			
				                        break;
				                    case 2:
				                    	System.out.println("Introduce un nuevo oficio");
				    					String oficio=br.readLine();
				            	
				    					E.setOficio(oficio);
				                        break;
				                    case 3:				                    
				                    	System.out.println("Introduce un nuevo salario");
				    					double salario=Double.parseDouble(br.readLine());
				            	
				    					E.setSalario(salario);
				                          break;
				                    case 4:
				                    	boolean enc=false;
						                   
				                    	int emp_no=0;
				                    	
				                    	while(enc==false) {
				                    	
				                    		System.out.println("Introduce un nuevo numero de empleado");
				    					
				                    	
				                    		emp_no=Integer.parseInt(br.readLine());	
				    							
				    					
				                    		if (existeEmp(emp_no)==false) {
						        					
				    						
				                    			enc=true;			
				    				
				    							}
				    					
				                    		if (enc==true) {
				                    		
				                    			E.setEmp_no(emp_no);
										
				                    		}else {
											
				                    			System.out.println("El numero ya existe");
										
				                    		}
				    					
				                    	}
				    					
				                    	
									
				                    	break;
				                    case 5:
				                    	System.out.println("Introduce una nueva comision");
				    					double comision=Double.parseDouble(br.readLine());
				    				    ((Directivo) E).setComision(comision);
				                    	break;
				                    case 6:
				                    	 salir = true;
				                        break;

				                    default:
				                        System.out.println("Solo puedes elegir una opcion entre el 1 y 3");
				    
				                }
				           
				            } catch (InputMismatchException e) { // salta cuando se introduce un numero decimal
				                System.out.println("Valor no valido.Debes insertar un número entero entre el 1 y el 4");
				                 
				            }
				            catch (NumberFormatException e) { // salta cuando el valor no es un numero (Ej: +,-)
				                System.out.println("Valor no valido.Debes insertar un número entero entre el 1 y el 4");
				                      
				            }catch (IOException e) {
				            	 System.out.println("Valor no valido.Debes insertar un número entero entre el 1 y el 4");
			                     
							}

				        }
				       
				        System.out.println("Fin del modificar");
				}
			}}}}
		
 
	//metodo para borrar un empleado de un departamento
	private static void borrarEmp() throws IOException  {
		boolean enc=false; //el empleado no ha sido encontrado
		mostrar();
		
		while(!enc){
		
			
		try {
			System.out.println("Introduce el numero de empleado valido");
			
			int emp_nob = Integer.parseInt(br.readLine());;
	
			Departamento D;
			Empleado E;
				
			for (int i = 0; i < listaDepartamentos.size(); i++) {
		
				D=(Departamento) listaDepartamentos.get(i);
			
			
				for (int j = 0; j <D.listaEmpleados.size(); j++) {
				
				
					E=(Empleado) D.listaEmpleados.get(j);
						
					
					if (E.getEmp_no()==emp_nob) {
						
						enc=true;//el empleado ha sido encontrado
						D.listaEmpleados.remove(j);
					}
					
				}
				
			}
			
			if(enc==true) {
						
				System.out.println("El empleado ha sido borrado");
				mostrar();		
				
			}
			else {
						
				System.out.println("Valor no encontrado");		
				enc=false;
				
			}
				
		} catch (NumberFormatException e) {
			System.out.println("El valor introducido no es correcto.Vuelva a insertar un valor valido");
		 } catch (NullPointerException ne) { // salta cuando se introduce un numero decimal
             System.out.println("Valor no valido.Debes insertar un número entero entre el 1 y el 6");
		}
	
		}
	}
	//metodo para modificar los atributos de un empleado segun su numero de empleado
	private static void modificarEmp() throws  IOException {
		mostrar();
	
		boolean salir = false;
		System.out.println("Introduce el numero de empleado");

		int emp_nob=Integer.parseInt(br.readLine());
	
		Departamento D;
	
		Empleado E;
		
		for (int i = 0; i < listaDepartamentos.size(); i++) {
		
			D=(Departamento) listaDepartamentos.get(i);
		
			for (int j = 0; j <D.listaEmpleados.size(); j++) {
			
				E=(Empleado) D.listaEmpleados.get(j);
			
				if (E.getEmp_no()==emp_nob) {
					
					 while (!salir) {
						 
				        	System.out.println("¿Que quieres modificar?");
				            System.out.println("1. Apellido del empleado");
				            System.out.println("2. Oficio del empleado");
				            System.out.println("3. Salario");  
				            System.out.println("4. Numero del empleado");
				            System.out.println("5. Salir");
				 
				            try {
				 
				                System.out.println("Escribe una de las opciones");
				                int opcion = Integer.parseInt (br.readLine()); 
				 
				                switch (opcion) {
				                    case 1:

				    					System.out.println("Introduce un nuevo apellido");
				    					String apellido=br.readLine();
				            	
				    					E.setApellido(apellido);
				                        break;
				                    case 2:
				                    	System.out.println("Introduce un nuevo oficio");
				    					String oficio=br.readLine();
				            	
				    					E.setOficio(oficio);
				                        break;
				                    case 3:				                    
				                    	System.out.println("Introduce un nuevo salario");
				    					double salario=Double.parseDouble(br.readLine());
				            	
				    					E.setSalario(salario);
				                          break;
				                    case 4:
				                    	boolean enc=false;
				                   
				                    	int emp_no=0;
				                    	
				                    	while(enc==false) {
				                    	
				                    		System.out.println("Introduce un nuevo numero de empleado");
				    					
				                    	
				                    		emp_no=Integer.parseInt(br.readLine());	
				    							
				    					
				                    		if (existeEmp(emp_no)==false) {
						        					
				    						
				                    			enc=true;			
				    				
				    							}
				    					
				                    		if (enc==true) {
				                    		
				                    			E.setEmp_no(emp_no);
										
				                    		}else {
											
				                    			System.out.println("El numero ya existe");
										
				                    		}
				    					
				                    	}
				   
				                    	break;
				                    case 5:
				                    	 salir = true;
				                        break;

				                    default:
				                        System.out.println("Solo puedes elegir una opcion entre el 1 y 3");
				    
				                }
				           
				            } catch (InputMismatchException e) { // salta cuando se introduce un numero decimal
				                System.out.println("Valor no valido.Debes insertar un número entero entre el 1 y el 4");
				                 
				            }
				            catch (NumberFormatException e) { // salta cuando el valor no es un numero (Ej: +,-)
				                System.out.println("Valor no valido.Debes insertar un número entero entre el 1 y el 4");
				                      
				            }

				        }
				       
				        System.out.println("Fin del modificar");
				}
			}}}
	
   //menu para elegir que tipo de empleado quiere insertar en el departamento
	private static void insertarEmp() throws NumberFormatException, IOException {
		
		boolean salir = false;
		int opcion;
	 
	        while (!salir) {
	 
	        	System.out.println("MENÚ POR CONSOLA");
	           
	            System.out.println("¿Que tipo de empleado desea insertar?");
	            System.out.println("1.Empleado normal");
	            System.out.println("2.Analista");
	            System.out.println("3.Directivo");    
	            System.out.println("4.Salir");
	 
	            try {
	 
	                System.out.println("Escribe una de las opciones");
	                opcion = Integer.parseInt (br.readLine()); 
	 
	                switch (opcion) {
	                    case 1:
	                    	insertarEmpleado();
	                        break;
	                    case 2:
	                    	insertarAnalista();
	                        break;
	                    case 3:
	                    	insertarDirectivo();
	                        break;
	                    
	                    case 4:
	                        salir = true;
	                        break;

	                    default:
	                        System.out.println("Solo puedes elegir una opcion entre el 1 y 5");
	    
	                }
	           
	            } catch (InputMismatchException e) { // salta cuando se introduce un numero decimal
	                System.out.println("Valor no valido.Debes insertar un número entero entre el 1 y el 6");
	                 
	            }
	            catch (NumberFormatException e) { // salta cuando el valor no es un numero (Ej: +,-)
	                System.out.println("Valor no valido.Debes insertar un número entero entre el 1 y el 6");
	                      
	            }

	        }
	       
	        System.out.println("Fin del programa");

	    }
	//metodo para insertar un directivo a un departamento a nuestra eleccion
	private static void insertarDirectivo() throws NumberFormatException, IOException {
		
		System.out.println("En que departamento lo quieres insertar?");
		int dep_no1=Integer.parseInt(br.readLine());
		Departamento d;
		for (int i = 0; i < listaDepartamentos.size(); i++) {
			d=(Departamento) listaDepartamentos.get(i);
			if (d.getDep_no()==dep_no1) {
			
				System.out.println("Introduce un apellido");
				String apellido=br.readLine();
				System.out.println("Introduce un oficio");
				String oficio= br.readLine();
				System.out.println("Introduce un dia de su fecha de alta");
				int dia2=Integer.parseInt(br.readLine());
				System.out.println("Introduce un mes de su fecha de alta");
				int mes2=Integer.parseInt(br.readLine());
				System.out.println("Introduce un año de su fecha de alta");
				int año2=Integer.parseInt(br.readLine());
			    LocalDate fecha_alt = LocalDate.of(año2, mes2, dia2);
			    System.out.println("Introduce un salario");
				double salario=Double.parseDouble(br.readLine());
				System.out.println("Introduce un numero de empleado");
				int emp_no=Integer.parseInt(br.readLine());
				System.out.println("Introduce la comision");
				double comision=Double.parseDouble(br.readLine());
				Directivo e=new Directivo(apellido, oficio, fecha_alt, salario, emp_no, comision);

				d.listaEmpleados.add(e);
			}
		}
			
		mostrar();
	}				
	//metodo para insertar un analista a un departamento a nuestra eleccion
	private static void insertarAnalista() throws NumberFormatException, IOException {
		System.out.println("En que departamento lo quieres insertar?");
		int dep_no1=Integer.parseInt(br.readLine());
		Departamento d;
		for (int i = 0; i < listaDepartamentos.size(); i++) {
			d=(Departamento) listaDepartamentos.get(i);
			if (d.getDep_no()==dep_no1) {
				System.out.println("Introduce un apellido");
				String apellido=br.readLine();
				System.out.println("Introduce un oficio");
				String oficio= br.readLine();
				System.out.println("Introduce un dia de su fecha de alta");
				int dia2=Integer.parseInt(br.readLine());
				System.out.println("Introduce un mes de su fecha de alta");
				int mes2=Integer.parseInt(br.readLine());
				System.out.println("Introduce un año de su fecha de alta");
				int año2=Integer.parseInt(br.readLine());
			    LocalDate fecha_alt = LocalDate.of(año2, mes2, dia2);
			    System.out.println("Introduce un salario");
				double salario=Double.parseDouble(br.readLine());
				System.out.println("Introduce un numero de empleado");
				int emp_no=Integer.parseInt(br.readLine());
				System.out.println("Introduce la herramienta");
				String herramienta=br.readLine();
				Analista e=new Analista(apellido, oficio, fecha_alt, salario, emp_no,herramienta);

				d.listaEmpleados.add(e);
			}
		}
			
		mostrar();
	}		
  //metodo para insertar un empleado en un departamento a nuestra eleccion
	private static void insertarEmpleado() {
		
		
		System.out.println("En que departamento lo quieres insertar?");
		int dep_no1;
	
		try {
			dep_no1 = Integer.parseInt(br.readLine());
		
		Departamento d;
		for (int i = 0; i < listaDepartamentos.size(); i++) {
			d=(Departamento) listaDepartamentos.get(i);
			if (d.getDep_no()==dep_no1) {
				System.out.println("introduce un apellido");
				String apellido=br.readLine();
				System.out.println("introduce un oficio");
				String oficio= br.readLine();
				System.out.println("Introduce un dia de su fecha de alta");
				int dia2=Integer.parseInt(br.readLine());
				System.out.println("Introduce un mes de su fecha de alta");
				int mes2=Integer.parseInt(br.readLine());
				System.out.println("Introduce un año de su fecha de alta");
				int año2=Integer.parseInt(br.readLine());
			    LocalDate fecha_alt = LocalDate.of(año2, mes2, dia2);
			    System.out.println("introduce un salario");
				double salario=Double.parseDouble(br.readLine());
				
						System.out.println("Introduce un numero de empleado");
				
							int emp_no = Integer.parseInt(br.readLine());
			
						
								Empleado e=new Empleado(apellido, oficio, fecha_alt, salario, emp_no);

								d.listaEmpleados.add(e);	
							}
					
				
			}
			} catch (NumberFormatException e1) {
				System.out.println("Error al introducir el valor");
			} catch (IOException e1) {
				System.out.println("Error al introducir el valor");
			}
	}
	
	//metodo para modificar los atributos de los departamentos mediante el numero de departamento
	private static void modificarDepartamento()   {

		 boolean salir = false;   
	        int opcion;
	        mostrar();
	        try {
	        System.out.println("Introduce el numero de departamento");
			int dep_noB=Integer.parseInt(br.readLine());
			int pos=-1;
			for (int i = 0; i <listaDepartamentos.size(); i++) {
				if (((Departamento) listaDepartamentos.get(i)).getDep_no()==dep_noB) {
					pos=i;//lo ha encontrado
		
	        while (!salir) {
	 
	        	System.out.println("¿Que quieres modificar?");
	            System.out.println("1. Nombre de departamento");
	            System.out.println("2. Numero del departamento");
	            System.out.println("3. Localizacion");           
	            System.out.println("4. Salir");
	 
	           
	 
	                System.out.println("Escribe una de las opciones");
	                opcion = Integer.parseInt (br.readLine()); 
	 
	                switch (opcion) {
	                    case 1:
	                    	if (pos!=-1) {
	                    		
	                			System.out.println("Introduce un nombre nuevo");
	                			String nombre=br.readLine();
	                			((Departamento)listaDepartamentos.get(pos)).setDnombre(nombre);
	                		}else {
	                			System.out.println("No ha sido encontrado");
	                		}                	
	                        break;
	                    case 2:
	                    	
	                    	if (pos!=-1) {	
	                    		boolean enc=false;
	                    		while(!enc) {
	                			System.out.println("Introduce un numero de departamento");
	                			int dep_no=Integer.parseInt(br.readLine());
	                		
	                			for (int j = 0; j <listaDepartamentos.size(); j++) {
	                			
	                				if (existeDep(dep_no)==false) {
		        					
        							enc=true;
        				
        						}
        			
							}if (enc==true) {
								((Departamento)listaDepartamentos.get(pos)).setDep_no(dep_no);
							}else {
								System.out.println("no puede existir dos numeros de empleados iguales");
							}
	                				
	                    		}
	                    	}
	                        break;
	                    case 3:
	                    	if (pos!=-1) {	
	                    		System.out.println("Dame la nueva localizacion");	                        
	                    		String localizacion=br.readLine();	                         
	                    		((Departamento)listaDepartamentos.get(pos)).setLocalizacion(localizacion);	            	
	                    	}else {
            			
	                    		System.out.println("No ha sido encontrado");
            		
	                    	}
	                          break;	
	                    case 4:
	                        salir = true;
	                        break;

	                    default:
	                        System.out.println("Solo puedes elegir una opcion entre el 1 y 3");
	    
	                }
	        }}}   
	            } catch (InputMismatchException e) { // salta cuando se introduce un numero decimal
	                System.out.println("Valor no valido.Debes insertar un número entero entre el 1 y el 4");
	                 
	            }
	            catch (NumberFormatException e) { // salta cuando el valor no es un numero (Ej: +,-)
	                System.out.println("Valor no valido.Debes insertar un número entero entre el 1 y el 4");
	                     
	                 
	            } catch (IOException e) { // salta cuando se introduce un numero decimal
	                System.out.println("Valor no valido.Debes insertar un número entero entre el 1 y el 4");
	                 
	         
	        }
	        
	        System.out.println("Fin del modificar");    			
	}
	//comprueba si un departamento ya existe mediante el numero de departamento
	private static boolean existeDep(int dep_no) { //metodo para saber si un numero de departamento ya existe

		boolean numExiste=false;
		Departamento d;

		for (int i = 0; i < listaDepartamentos.size(); i++) {		
			d=(Departamento) listaDepartamentos.get(i);//recogemos los departamentos en la variablede tipo departamento
			if (d.getDep_no()==dep_no) {		
				numExiste=true; //el numero insertado no esta en el arraylist
			}
		
		}
		return numExiste;
	}
	//comprueba si un empleado ya existe mediante el numero de empleado
	private static boolean existeEmp(int emp_no) { //metodo para saber si un numero de departamento ya existe

		boolean numExiste=false;
		Departamento d;
		Empleado e;
		for (int i = 0; i < listaDepartamentos.size(); i++) {		
			d=(Departamento) listaDepartamentos.get(i);//recogemos los departamentos en la variablede tipo departamento
			for (int j = 0; j <d.listaEmpleados.size(); j++) {		
				e=(Empleado) d.listaEmpleados.get(j);
			
				if (e.getEmp_no()==emp_no) {		
				
					numExiste=true; //el numero insertado no esta en el arraylist
			}
		
		}
		
	}
		return numExiste;
	}
	//inserta un departamento sin empleados
	public static void insertar() {
		boolean formato=false;
		int dep_no;
		do {
			try {
				do {
				System.out.println("Introduce el numero de departamento");
				 dep_no=Integer.parseInt(br.readLine());
				
				if (existeDep(dep_no)==true) {
					System.out.println("El codigo ya existe");
				
				}
				
				}while(existeDep(dep_no)==true);
			System.out.println("Nombre");
			String nombre=br.readLine();
			System.out.println("localizacion");
			String localizacion=br.readLine();
			listaDepartamentos.add(new Departamento(dep_no, nombre, localizacion));
			formato=true;
			
			}catch(NumberFormatException| InputMismatchException |  IOException e) {
			System.out.println("Devbes elegir un numero valido");	
			
			}
			
		}while(formato==false);
		}
	//mostrar los departamentos junto a sus empleados
	private static void mostrar() {
		for (Object lista : listaDepartamentos) {
			System.out.println(lista);
			
		}
		
	}

}