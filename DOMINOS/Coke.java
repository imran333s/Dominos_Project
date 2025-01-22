package DOMINOS;

public class Coke implements Beverages {
    double price;
    int choice;
    Coke(){}

    Coke( int choice)
    {
        this.choice=choice;
        setPrice();
    }
    @Override
    public void setPrice()
    {
        this.price=70;
    }
@Override
    public void getDetails()
    {
        System.out.println("Type of Beverage is : " + getType() );
        System.out.println("Price of Beverage is: "+ price);
    }

    @Override
    public double getPrice()
    {
        return price;
    }


    public String getType()
    {
        return "Coke";
    }

  
}
