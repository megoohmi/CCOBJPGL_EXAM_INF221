public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Bohol bohol) {

        //Budget
        budget -= bohol.airFare;

        //Define your visit
        System.out.println("  ");
        System.out.println("-");
        System.out.println("  ");
        System.out.print("Exploring.. Bohol: ");
        System.out.println("OMG! The Chocolate Hills are amazing!");
        checkBudget();
        System.out.println("  ");
        System.out.println("-"); 
        System.out.println("  ");

    }

    public void visit(Boracay boracay) {

        budget -= boracay.airFare;


        System.out.print("Exploring.. Boracay: ");
        System.out.println("I LOOVEE how the clear water is!");
        checkBudget();
        System.out.println("  ");
        System.out.println("-"); 
        System.out.println("  ");

    }

    public void visit(Cebu cebu) {

        budget -= cebu.airFare;

        System.out.print("Exploring.. Cebu: ");
        System.out.println("The Kawasan Falls looks stunning!");
        checkBudget();
        System.out.println("  ");
        System.out.println("-"); 
        System.out.println("  ");

    }
    
    public void visit(Palawan palawan) {

        budget -= palawan.airFare;

        System.out.print("Exploring.. Palawan: ");
        System.out.println("YAAY it's time for island hopping in El Nido!");
        checkBudget();
        System.out.println("  ");
        System.out.println("-"); 
        System.out.println("  ");
    
    }

    public void visit(Siargao siargao) {

        budget -= siargao.airFare;

        System.out.print("Exploring.. Siargao: ");
        System.out.println("Surfing at Cloud 9 is such a SLAY experience!");
        checkBudget();
        System.out.println("  ");
        System.out.println("-"); 
        System.out.println("  ");
    
    }

    public void visit(Vigan vigan) {

        budget -= vigan.airFare;

        System.out.print("Exploring.. Vigan:  ");
        System.out.println("Walking around Calle Crisologo is unreal.");
        checkBudget();
        System.out.println("  ");
        System.out.println("-"); 
        System.out.println("  ");
    
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);

    }
}
