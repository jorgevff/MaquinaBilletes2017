/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    private int status;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine()
    {
        price = 1000;
        balance = 0;
        total = 0;
        status = 0;
    }
    
    public TicketMachine(int precio)
    {
        price = precio;
        balance = 0;
        total = 0;
        status = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price; 
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;
    }


    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    

    public void printTicket()
    {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + balance;
        
        // Clear the balance.
        balance = 0;
    }

    /**
     * devuelve el valor del campo total
     */
    public int getTotal()
    {
        
        return total;
    }
    
    /**
     * permite cambiar el valor de price; el precio
     */
    public void setPrice(int nuevoPrecio)
    {
        price = nuevoPrecio;
    }
    /**
     * permite incrementar el precio del billete en 2 euros
     */
    public void incrementaPrecioDosEuros()
    {
        //price = price + 200
       price += 200; 
    }
    
    /**
     * reducir el precio del  billete en la cantidad que se introduce por parametro
     */
    
    public void discount(int amount)
    {
        //price -= amount;
        price = price - amount;
    }
    
    public void showPrice()
    {
       System.out.println("El precio del billete es de " + price + " cents."); 
    }
    
    /**
     * saca por pantalla un mensaje
     */
    public void prompt()
    {
        System.out.println("Inserte dinero, plisss.");
    }
    /**
     * vacia la maquina y deja el balance a 0
     */
    public void vaciarTotal()
    {
        total = 0;
        
    }
}
