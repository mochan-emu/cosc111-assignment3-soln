import java.util.*;

public class AcmeEmployee
{
    public String name;
    public int hours;
    public double rate;
    
    public boolean dec_bonus;
    public boolean perf_bonus;
    public boolean eotm;
    
    AcmeEmployee(String _name, int _hours, double _rate)
    {
            name = _name;
            hours = _hours;
            rate = _rate;
            
            dec_bonus = false;
            perf_bonus = false;
            eotm = false;
    }
    
    double calculatePaycheck()
    {
        double paycheck = hours*rate;
        
        if (dec_bonus)
        {
            paycheck *= 1.15;
        }
        if (perf_bonus)
        {
            paycheck += hours;
        }
        if (eotm)
        {
            paycheck += 100;
        }
        
        return paycheck;
    }
    
    public static void main(String args[])
    {
        Scanner kb = new Scanner(System.in);
        
        ArrayList<AcmeEmployee> employees = new ArrayList<AcmeEmployee>();
        
        employees.add(new AcmeEmployee("Alice", 0, 17.75));
        employees.add (new AcmeEmployee("Brad", 0, 21.25));
        employees.add(new AcmeEmployee("Charles", 0, 35));
        employees.add(new AcmeEmployee("Dan", 0, 12.50));
        employees.add(new AcmeEmployee("Emily", 0, 50));
        
        System.out.println("Is it December?");
        String ans = kb.nextLine();
        if (ans.equals("yes"))
        {
            for (AcmeEmployee e : employees)
            {
                e.dec_bonus = true;
            }
        }
        
        System.out.println("Has the performance standards been met?");
        ans = kb.nextLine();
        if (ans.equals("yes"))
        {
            for (AcmeEmployee e : employees)
            {
                e.perf_bonus = true;
            }
        }
        
        System.out.println("Who is the employee of the month: ");
        ans = kb.nextLine();
        for (AcmeEmployee e : employees)
        {
            if (ans.equals(e.name))
            {   
                e.eotm = true;
            }
        }
        
        for (AcmeEmployee e : employees)
        {
            int hours;
            System.out.println(e.name + "'s Hours:");
            hours = kb.nextInt();
            e.hours = hours;
        } 
        
        double total = 0;
        for (AcmeEmployee e : employees)
        {
            total += e.calculatePaycheck();
        }
        System.out.println("Acme's Total Employee Cost: $" + total);
    }
}
