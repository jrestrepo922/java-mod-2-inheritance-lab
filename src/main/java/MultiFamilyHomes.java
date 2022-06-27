public class MultiFamilyHomes  extends Home{
    private int numberOfUnits; 

    public MultiFamilyHomes(int numberOfUnits){
        super(); 
        this.numberOfUnits = numberOfUnits; 
    }

    public void investingInHomes(){
        System.out.println("Multi family homes are great for cash flow but not so much for appreciation");
    }

    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public void valueOfMultiFamilyHome(){
        System.out.println("cash flow");
    }    
}
