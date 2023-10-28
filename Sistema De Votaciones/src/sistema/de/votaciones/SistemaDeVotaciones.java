/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema.de.votaciones;
import java.util.Scanner;
import java.security.SecureRandom;
import static sistema.de.votaciones.SistemaDeVotaciones.PasswordGenertor.generatePassword;
/**
 *
 * @author Manuel Siney
 */
public class SistemaDeVotaciones {
    public class PasswordGenertor{
        private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*()";
        
        public static String generatePassword(int length){
         StringBuilder password = new StringBuilder();
          SecureRandom random = new SecureRandom();
        for (int i=0; i<length; i++){
           int index=0;
             index = random.nextInt(CHARACTERS.charAt(index));
              password.append(CHARACTERS.charAt(index));
        }
        return password.toString();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in); 
         System.out.println("Bienbenido al sistema de votaciones electronicos. \n          Para poder acceder al sistema");
    String correoElectronico;
    
    System.out.println("Ingrese su correo electronico:");
     correoElectronico = scan.nextLine();
    int passwordLength = 10;
     String generatedPassword = generatePassword(passwordLength);
      System.out.println("Su contrasenia de acceso es:\n"+generatedPassword+("\n"));
        
//Primeras opciones del sistema.
int elegir = 0;

System.out.println("Elija una opcion:");
 System.out.println("1: Registro De Usuarios.");
  System.out.println("2: Registro De Votantes.");
   System.out.println("3: Acceso De Votantes.");
    System.out.println("4: Administacion De Elecciones.");
     elegir = scan.nextInt();
      System.out.println("");

switch (elegir){
    case 1:
//Registro para usuarios del sistema.       
        int op=0;
        
                System.out.println("Ingrese los nombres del usuario:");
                 String nom = scan.next();
                  System.out.println("Ingrese los apellidos del usuario:");
                   String ape = scan.next();
                    System.out.println("Ingrese el correo electronico del usuario:");
                     String cor = scan.next();
                      System.out.println("Ingrese contrasenia del usuario:");
                       String contr = scan.next();
               
                System.out.println("\nElija un rol para el usuario:");
                 System.out.println("");
                  System.out.println("1. Administrador.");
                   System.out.println("2. Registrador de votante.");
                    System.out.println("3. Votante.");
                     System.out.println("4. Auditor.");
                op = scan.nextInt();
               
        switch (op) {                 
        case 1:            
                String a = scan.next("Administrador");
                 System.out.println("Nombre completo "+nom+" " +ape);
                  System.out.println("Correo: "+cor);
                   System.out.println("Contraseña: "+ contr);
                    System.out.println("Rol asignado: "+ a);
                break;
        case 2:
                String b = scan.next("Registrador");
                 System.out.println("Nombre completo "+nom+" "+ape);
                  System.out.println("Correo: "+cor);
                   System.out.println("Contraseña: "+ contr);
                    System.out.println("Rol asignado: "+ b);
                break;
        case 3:
                String c = scan.next("Votante");
                  System.out.println("Nombre completo "+nom+" "+ape);
                   System.out.println("Correo: "+cor);
                    System.out.println("Contraseña: "+ contr);
                     System.out.println("Rol asignado: "+ c);
                break;
        case 4:
                String d = scan.next("Auditor");
                System.out.println("Nombre completo "+nom+" "+ape);
                 System.out.println("Correo: "+cor);
                  System.out.println("Contraseña: "+ contr);
                   System.out.println("Rol asignado: "+ d);
                 break;
        default: System.out.println("Ingrese una opcion valida.");
                }
                
break;
    
    case 2:         
//Registros de Votantes.
            String nOm=null, aPe=null, M=null, F=null, FN=null, DR=null, DP=null, MR=null, PR=null, clave=null;
            int mo = 0,OP, cui, sexo = 0, edad;
        
            System.out.println("Elija una opcion: \n");
             System.out.println("1. Crear Usuario Del Sistema:");
              System.out.println("2. Modificar Usuario Del Sistrema:");
               System.out.println("3. Reiniciar Contrasenia:");
                OP = scan.nextInt();
        
   switch (OP){
   case 1:
            System.out.println("Ingrese la edad del votante:");
            edad = scan.nextInt();
        if (edad >= 18){
            System.out.println("Puede registrar al votante.");
             
             
            System.out.println("Ingrese Nombres:");
            nOm = scan.next();

            System.out.println("Ingrese Apellidos:");
            aPe = scan.next();
        
            System.out.println("Ingrese numero de CUI:");
            cui = scan.nextInt();
        
            System.out.println("Seleccione sexo:");
            M = "Masculino";
            F = "Femenino";
        
            System.out.println("1. MAsculino.");
             System.out.println("2. Femenino.");
              sexo = scan.nextInt();
        
            switch (sexo){
            case 1:
            System.out.println(nOm+" "+aPe);
             System.out.println("Sexo: "+M);
            break;
            case 2:
            System.out.println(nOm+" "+aPe);
             System.out.println("Sexo: "+F);
            break;
            default: System.out.println("Opción inválida.");
            }
        
            System.out.println("Ingrese fecha de nacimiento:");
            FN = scan.next();
        
            System.out.println("Ingrese pais de recidencia:");
            PR = scan.next();
        
            System.out.println("Ingrese departamento de recidencia:");
            DP = scan.next();
        
            System.out.println("Ingrese municipio de recidencia:");
            MR = scan.next();
        
            System.out.println("Ingrese direccion de recidencia:");
            DR = scan.next();
        
            System.out.println("\nDatos del Votante.");
             System.out.println(nOm+" "+aPe);
              System.out.println("SEXO: "+sexo);
               System.out.println(FN);
                System.out.println(PR);
                 System.out.println(DP);
                  System.out.println(MR);
                   System.out.println(DR);
                    System.out.println("Rol asignado: Votante.");
                    passwordLength = 16;
                     System.out.println("Su contrasenia de acceso es:\n"+generatedPassword+("\n"));
                }
                else{
                System.out.println("No puede registrar al votante es menor de edad.");
                 } 
        break;
   
        case 2:
                String NOM = null, APE = null, fn = null, pr = null, dp = null, mr = null, dr = null;
                 System.out.println("Elija el dato a modificar:");
                  System.out.println("\nDatos del Votante.");
                   System.out.println("1. "+nOm +" "+ aPe);
                    System.out.println("2. SEXO: "+sexo);
                     System.out.println("3. "+FN);
                      System.out.println("4. "+PR);
                       System.out.println("5. "+DP);
                        System.out.println("6. "+MR);
                         System.out.println("7. "+DR);
                          System.out.println("8. Rol asignado: Votante.");
                           mo = scan.nextInt();
                           
                switch (mo){
                case 1:
                System.out.println("Ingrese nuevos nombres:");
                NOM = scan.next();
                break;
                case 2:
                System.out.println("Ingrese nuevos apellidos:");
                APE = scan.next();
                break;
                case 3:
                System.out.println("Ingrese fecha de nacimiento:");
                fn = scan.next();
                break;
                case 4:
                System.out.println("Ingrese nuevo pais de recidencia:");
                pr = scan.next();
                break;
                case 5:
                System.out.println("Ingrese nuevo departamento de recidencia:");
                dp = scan.next();
                break;
                case 6:
                System.out.println("Ingrese municipio de recidencia:");
                mr = scan.next();
                break;
                case 7:
                System.out.println("Ingrese direccion de recidencia:");
                dr = scan.next();
                break;        
                default: System.out.println("Ingrese una opción válida.");
                }
                System.out.println("\nDatos del Votante.");
                 System.out.println("1. "+ NOM +" "+ APE);
                  System.out.println("2. SEXO: "+sexo);
                   System.out.println("3. "+fn);
                    System.out.println("4. "+pr);
                     System.out.println("5. "+dp);
                      System.out.println("6. "+mr);
                       System.out.println("7. "+dr);
                        System.out.println("8. Rol asignado: Votante.");
        break;
   
        case 3:
                System.out.println("Ingrese su contrasenia actual:");
                 clave = scan.next();        
                  System.out.println("LA nueva contrasenia es:\n"); 
                   passwordLength = 16;
                    System.out.println(generatedPassword);
        break; 
        default: System.out.println("Opcion invalida.");
        } 
    break;
    
    case 3:
//Acceso de votantes.
                int CUI;
                String r = "";
                String t = "";
        
                System.out.println("Ingrese su correo electronico:");
                 String correo = scan.next();
                  System.out.println("Ingrese su contraseña:");
                   String contraseña = scan.next();
        
                if ((correo.equals(r)) & (contraseña.equals(t))){
                 System.out.println("\nIngrese numero de CUI:");
                  CUI = scan.nextInt();
                  }
                else {
                System.out.println("No puede ingresar al sistema\nlos datos ingresados no coiciden.");   
                }
    break;
    
    case 4:    
//Administración de elecciones.
                int elec=0, cod, ges, cla, infor, sele;
                float fecha = 0.0f, inicio = 0.0f, fin = 0.0f, dia = 0.0f, horario = 0.0f;
        
                System.out.println("         Administracion de elecciones\n");
        
                 System.out.println("Elija una opcion:\n");
                  System.out.println("1. Getionar Elecciones.");
                   System.out.println("2. Gestiomar candidatos.");
                    System.out.println("3. Configurar opciones de eleccion.\n");
                     elec =scan.nextInt();
        
        switch (elec){
        case 1:
                System.out.println("Ingrese el titulo de la eleccion:");
                 String ti = scan.next();
                  System.out.println("Ingrese el propocito:");
                   String pro = scan.next();
                    System.out.println("Ingrese una breve descripcion:");
                     String des = scan.next();
                      System.out.println("Ingrese codigo unico de identificacion:");
                       cod = scan.nextInt();
                        System.out.println("Ingrese la fecha de elecciones:");
                         fecha = scan.nextFloat();
                          System.out.println("Ingrese la hora de inicio y de fin de votaciones:");
                           inicio = scan.nextFloat();
                            fin = scan.nextFloat();
        
                System.out.println("\nTitulo: "+ti);
                 System.out.println("Proposito: "+pro);
                  System.out.println("Breve descripcion:\n"+des);
                   System.out.println("Codigo de identificacion: "+cod);
                    System.out.println("Fecha: "+fecha);
                     System.out.println("Hora inicio: "+inicio);
                      System.out.println("Hora fin: "+fin);
        break;
        case 2:
                System.out.println("Elija una opcion:");
                 System.out.println("1. Gestion de cndidatos.");
                  System.out.println("2. Agregar informacion relevante de candidatos.");
                   System.out.println("3. Modificar informacion de candidatos.");
                    System.out.println("4. Eliminar candidato.");
                     ges = scan.nextInt();
            
                switch (ges){
                case 1:
                System.out.println("Ingrese el codigo de identificaion:");
                cla = scan.nextInt();
                break;
                case 2:
                System.out.println("Elija la informacion que desea agregar:");
                 System.out.println("1. Nombre.");
                  System.out.println("2. Formacion.");
                   System.out.println("3. Experiencia profecional.");
                    infor = scan.nextInt();
                if (infor == 1){
                System.out.println("Ingrese el nombbre:");
                 String nuevo = scan.next();
                }
                if (infor == 2){
                System.out.println("Ingrese su formacion:");
                 String form = scan.next();
                }
                if (infor == 3){
                 System.out.println("Ingrese experiencia profecional:");
                  String expe = scan.next();
                }
                break;
                case 3:
                System.out.println("Ingrese el codigo de identificacion el candidato:");
                cla = scan.nextInt();
                break;
                case 4:
                System.out.println("Ingrese el codigo de identificacion del candidato:");
                 cla = scan.nextInt();
                break;
                default: System.out.println("Opción inválida.");
                }
        break;
        case 3:
               System.out.println("Ingrese el codigo del candidato para poder configurar:");
                cla = scan.nextInt();
                 System.out.println("seleccine los candidatos de la eleccion:");
                  sele = scan.nextInt();
                   System.out.println("Ingrese la fecha actual:");
                    dia =scan.nextFloat();
                     System.out.println("Ingrese hora actual:");
                      horario = scan.nextFloat();
               if (dia < fecha){
               System.out.println("Puede realizar esta opcion.");
               }
               if (dia > fecha){
               System.out.println("No puede acceder a esta opcion.");
                 }
        break;
        default: System.out.println("Opción inválida.");
        }
    
break;
default: System.out.println("Ingrese una opcion valida.");  
  }
 }
}