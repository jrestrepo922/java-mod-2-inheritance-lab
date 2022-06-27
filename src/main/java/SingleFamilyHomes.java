public class SingleFamilyHomes extends Home{
    private int numberOfUnits; 

    
    public SingleFamilyHomes(){
        super();
        this.numberOfUnits = 1; 
    }

    public void investingInHomes(){
        System.out.println("Single family homes gennerally gain more value from appreciation rather than cash flow");
    }

    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public void valueOfSingleFamilyHome(){
        System.out.println("appreciation");
    }

    
}
