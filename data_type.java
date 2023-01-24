public class data_type {
    public static boolean isValidPassword(int a){
        if (a % 2 == 0){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car: cars){
            if (car.equals("BMW")){
                System.out.println(car);

            }
    
            
        }
        String[] name = {"Jide", "Dami", "Jay"};
        int n = name.length;
        for (int i = 0; i<n; i++){
            name[i] = name[i].toUpperCase();
            System.out.println(name[i]);

        }
        int count = 4;
        switch(count){
            case 1:
                System.out.println("The count is 1");
                break;
            case 2:
                System.out.println("The count is 2");
                break;
            case 3:
                System.out.println("The count is 3");
                break;
            default:
                System.out.println("The number is not there");
                break;
        }
        
      
    }
    
            
}



