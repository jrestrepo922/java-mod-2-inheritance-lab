public class Home {
    private String madeOf;
    private String useFor; 

    public Home(){
        this.madeOf = "wood and drywall";
        this.useFor = "to live"; 
    }

    

    public String getMadeOf() {
        System.out.println(madeOf);
        return madeOf;
    }



    public String getUseFor() {
        System.out.println(useFor);
        return useFor;
    }



    public void investingInHomes(){
        System.out.println("homes can make great investments as long as your tenant is paying your mortgage");
    }


}
