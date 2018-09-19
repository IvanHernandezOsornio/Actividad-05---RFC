
package curp;

import javax.swing.JOptionPane;

public class controllers {
    
    public controllers(){
        //constructor
    }
    
    String nombre="";
    String apellidoP="";
    String apellidoM="";
    String sexo="";
    String estado = "";
    Integer dia=0, año=0, mes = 0;
    char a, b;
    String curpg = "";
    
    public void getFecha(String a, String b, String c){
        
        dia=Integer.parseInt(a);
        mes=Integer.parseInt(b);
        año=Integer.parseInt(c);
        
    }
    
    public void getSexo(String radio){
        sexo=radio;
    }
    
    public void getEstado(String boxEstado){
        estado = boxEstado;
    }
    
    public void getNombrecompleto(String a, String b, String c){
        nombre = a.toUpperCase(); // toUpperCase = convertir a mayusculas
        apellidoP = b.toUpperCase();
        apellidoM = c.toUpperCase();
    }
    
    
    public void curpGen(){
        
        char c1 = apellidoP.charAt(0); // el primer caracter del apellido
        char c2 = 0;
        for (int i = 1; i < apellidoP.length(); i++) {
            char l = apellidoP.charAt(i);
            if(l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U'){
                c2 = l;
                break;
            }
        }
        char c3 = apellidoM.charAt(0);
        char c4 = nombre.charAt(0);
        String year = String.valueOf(año);
        
        char c5 = year.charAt(2);
        char c6 = year.charAt(3);
        String month = String.valueOf(mes);
        char c7 = 0;
        char c8 = 0;
        
        if(mes < 10){
            c7 = '0';
            c8 = month.charAt(0);
        }
        else{
            c7 = month.charAt(0);
            c8 = month.charAt(1);
        }
        
        String day = String.valueOf(dia);
        char c9 = 0;
        char c10 = 0;
                
        if(dia < 10){
            c9 = '0';
            c10 = day.charAt(0);
        }else{
            c9 = day.charAt(0);
            c10 = day.charAt(1);
        }
        
        char c11 = sexo.charAt(0);
        entidadFederativa();
        char c12 = a;
        char c13 = b;
        
        char c14 = 0;
        
        for (int i = 1; i < apellidoP.length(); i++) {
            char l = apellidoP.charAt(i);
            if(l != 'A' && l != 'E' && l != 'I' && l != 'O' && l != 'U'){ // excluimos a las vocales
                c14 = l;
                break;
            }
        }
        
        char c15 = 0;
        
        for (int i = 1; i < apellidoM.length(); i++) {
            char l = apellidoM.charAt(i);
            if(l != 'A' && l != 'E' && l != 'I' && l != 'O' && l != 'U'){ // excluimos a las vocales
                c15 = l;
                break;
            }
        }
        
        char c16 = 0;
        
        for (int i = 1; i < nombre.length(); i++) {
            char l = nombre.charAt(i);
            if(l != 'A' && l != 'E' && l != 'I' && l != 'O' && l != 'U'){ // excluimos a las vocales
                c16 = l;
                break;
            }
        }
        
        int numero = (int) (Math.random()*9+1);
        String n = String.valueOf(numero);
        char c17 = n.charAt(0);
        
        numero = (int) (Math.random()*9+1);
        String b = String.valueOf(numero);
        
        char c18 = b.charAt(0);
        
        curpg = String.valueOf(c1+""+c2+""+c3+""+c4+""+c5+""+c6+""+c7+""+c8+""+c9+""+c10);
        
        JOptionPane.showMessageDialog(null, curpg);
        
        
    }
    
    public void entidadFederativa(){
         
        //este metodo asigna las letras de la entidad federativa
        switch(estado){
             
        case "Aguas Calientes":
            a='A';
            b='S';
            break;
         
        case "Baja California":
            a='B';
            b='C';
            break;
            
        case "Baja California Sur":
            a='B';
            b='S';
            
            break;

        case "Campeche":
            a='C';
            b='C';
            break;
        
        case "Coahuila de Zaragoza":
            a='C';
            b='L';
            break;
            
        case "Colima":
            a='C';
            b='M';
            break;

        case "Chiapas":
            a='C';
            b='S';
            break;

        case "Chihuahua":
            a='C';
            b='H';
            break;

        case "Distrito Federal":
            a='D';
            b='F';
            break;

        case "Durango":
            a='D';
            b='G';
            break;

        case "Guanajuato":
            a='G';
            b='T';
            break;

        case "Guerrero":
            a='G';
            b='R';
            break;

        case "Hidalgo":
            a='H';
            b='G';
            break;
            
        case "Jalisco":
            a='J';
            b='C';
            break;

        case "Estado de México":
            a='M';
            b='C';
            break;

        
        case "Michoacan de Ocampo":
            a='M';
            b='N';
            break;

        case "Morelos":
            a='M';
            b='S';
            break;

        case "Nayarit":
            a='N';
            b='T';
            break;

        case "Nuevo Leon":
            a='N';
            b='L';
            break;

        case "Oaxaca":
            a='O';
            b='C';
            break;

        case "Puebla":
            a='P';
            b='L';
            break;
            
        case "Queretaro de Arteaga":
            a='Q';
            b='T';
            break;
            
        case "Quintana Roo":
            a='Q';
            b='R';
            break;

        case "San Luis Potosi":
            a='S';
            b='P';
            break;

        case "Sinaloa":
            a='S';
            b='L';
            break;

        case "Sonora":
            a='S';
            b='R';
            break;

        case "Tabasco":
            a='T';
            b='C';
            break;

        case "Tamaulipas":
            a='T';
            b='S';
            break;
        case "Tlaxcala":
            a='T';
            b='L';
            break;

        case "Veracruz":
            a='V';
            b='Z';
            break;
        
        case "Yucatan":
            a='Y';
            b='N';
            break;
                 
        case "Zacatecas":    
            a='Z';
            b='S';
            break;         
         }         
     }
}
