package Java_Dojo.fundamentals.Java_Cafe;

public class javaCafe {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 1.5;
        double lattePrice = 2.0;
        double cappuchinoPrice = 2.5;

    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;

    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(customer1 + pendingMessage);
        
        if (isReadyOrder4 == true) {
            System.out.println(customer4 + readyMessage );
        } else {
            System.out.println(customer4 + pendingMessage );
        }

        System.out.println(displayTotalMessage + (lattePrice + lattePrice));
        if (isReadyOrder2 == true) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        System.out.println(displayTotalMessage + (lattePrice - dripCoffeePrice));

        // I'm using the same code as before for the if statments but instead of changing the variables, I'm changing the 
        //if statment condition to simulate it being the true == false and false == true. :)
        System.out.println("!!!The inverse of the if statments used!!!");
        if (isReadyOrder4 == false) {
            System.out.println(customer4 + readyMessage );
        } else {
            System.out.println(customer4 + pendingMessage );
        }
        
        if (isReadyOrder2 == false) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }
    }
}