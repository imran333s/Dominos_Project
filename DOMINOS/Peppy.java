package DOMINOS;

public class Peppy implements Pizza {
    String size;
    double price;
    Peppy(){}

    Peppy(String size)
    {
        this.size=size;
        setPrice();
    }

    public String getType()
    {
        return "peppy";
    }
   
   
   
    @Override
    public void setPrice()
    {
        switch(size)
        {
            case "1":
            this.price=50;
            break;
            case "2":
            this.price=75;
            break;
            case "3":
            this.price=100;
            break;
            default:
            System.out.println("Invalid size Selected. Defaulting to Medium.");
            size="2";
            price=75;
        }
    }


    @Override
    public void getDetails()
    {
        System.out.println("Type of Pizza is : " + getType() );
        System.out.println("Size of  pizza is : "+getSize());
        System.out.println("Price of pizza is: "+ price);
        
    }


    public String getSize()
        {
            switch (size) {
                case "1":
                return size="Small";
                   
                case "2":
                return size="Medium";
                    
                case "3":
                return size="Large";
                 
                default:
                return size="Medium";
            }
        }

    @Override
    public double getPrice()
    {
        return price;
    }
}
