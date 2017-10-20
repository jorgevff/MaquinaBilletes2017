
public class EstacionDeTren
{
    private String localidad;
    private TicketMachine maquinaUno;
    private TicketMachine maquinaDos;
    
    /**
     * constructor de la estacion de tren, se crean tres parametros para 
     * ir creando nueva localidad, y nuevos precios de billetes
     */
    
    public EstacionDeTren(String nombreLocalidad)
    {
        localidad = nombreLocalidad;
        //creo nuevos objetos TicketMachine
        maquinaUno = new TicketMachine();
        maquinaDos = new TicketMachine();
    
    
    }
    
    /**
     * simula la venta de un billete, primero se mete dinero y despues
     * se imprime el billete
     */
    
    public void ventaBilleteMaquinaUno()
    {
        maquinaUno.insertMoney(300);
        maquinaUno.printTicket();
    }
    
    public void ventaBilleteMaquinaDos()
    {
        maquinaDos.insertMoney(400);
        maquinaDos.printTicket();
    }
    
    /**
     * Devuelve el total de dinero recaudado 
     * por las maquinas de la estacion 
     * hasta el momento
     */
    public int totalRecaudadoEstacionTren()
    {
        //se invoca los metodos directamente. y se realiza la suma
        return maquinaUno.getTotal() + maquinaDos.getTotal();
    }
    
    
    /**
     * devuelve el total de dinero recaudado por
     * la maquinaUno
     */
    public int totalRecaudadoMaquinaUno()
    {
        
        return maquinaUno.getTotal();
    }
    
    /**
     * imprime por pantalla la cantidad recaudada por la maquinaUno
     * la maquinaDos y el total de ambas
     */
    public void imprimirTotales()
    {
        System.out.println("Total recaudado por la Maquina Uno es " + maquinaUno.getTotal());
        System.out.println("Total recaudado por la Maquina Dos es " + maquinaDos.getTotal());
        System.out.println("El Total de ambas Maquinas es " + (maquinaUno.getTotal() + maquinaDos.getTotal()) + " ctms");
    }
    
}
