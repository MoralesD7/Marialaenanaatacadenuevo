
import javax.swing.JOptionPane;


public class factorial {
    
    public static void main (String args[]){
    
    int N;
    int alojamientos = 1;
    
    N = Integer.parseInt(JOptionPane.showInputDialog("ingresa el numero del que quieras sacar su factorial :"));
    
            for (int i =1; i<=N;i++){
                alojamientos =i*alojamientos;
                System.out.println(alojamientos);
        }
    
    }
    
}
