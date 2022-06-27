public class Main {
    public static void main(String[] args) {
        System.out.println("======= Running Home Examples ===============");
        Home baseHome = new Home(); 
        baseHome.getMadeOf(); 
        baseHome.getUseFor(); 
        baseHome.investingInHomes();

        System.out.println("======= Running SingleFamilyHome Examples ===============");
        SingleFamilyHomes singleFamilyHome = new SingleFamilyHomes(); 
        singleFamilyHome.getMadeOf(); 
        singleFamilyHome.getUseFor(); 
        singleFamilyHome.getNumberOfUnits(); 
        singleFamilyHome.investingInHomes();
        singleFamilyHome.valueOfSingleFamilyHome();

        System.out.println("======= Running MultiFamilyHome Examples ===============");
        MultiFamilyHomes multiFamilyHome = new MultiFamilyHomes(4); 
        multiFamilyHome.getMadeOf(); 
        multiFamilyHome.getUseFor(); 
        multiFamilyHome.getNumberOfUnits(); 
        multiFamilyHome.investingInHomes();
        multiFamilyHome.valueOfMultiFamilyHome(); 
    }
}
