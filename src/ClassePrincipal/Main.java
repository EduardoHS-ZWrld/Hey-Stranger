package ClassePrincipal;
public class Main {
    static String driverJDBC = "org.gjt.mm.mysql.Driver";
    public static void main(String[] args) {
        try {
            System.out.println("Tentando conectar");
            Class.forName(driverJDBC);
            System.out.println("Sucesso");
        } catch (Exception e) {
            System.out.println("Falha"); 
        }
    }  
    
}
