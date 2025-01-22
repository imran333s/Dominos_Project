package DOMINOS;

public class Pepsi implements Beverages{
    double price;
    int choice;
    Pepsi(){}

    Pepsi( int choice)
    {
        this.choice=choice;
        setPrice();
    }
    @Override
    public void setPrice()
    {
        this.price=50;
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
        return "Pepsi";
    }

}
