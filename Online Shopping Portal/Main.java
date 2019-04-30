public class Main {
	public static void main(String[] args) {
        Customers obj1 = new Customers();
        obj1.Id = 1001;
        obj1.Name = "Saakshi";
        obj1.MobileNumber = 9000000000L;
        obj1.shippingAdderess = "Bangalore";
        obj1.dateOfBirth = "16-Jul-1990";
        obj1.gender = 'F';
        obj1.orderHistory = "Lakme Kajal, Salwar";
        

        Customers obj2 = new Customers();
        obj2.Id = 1008;
        obj2.Name = "Rahul";
        obj2.MobileNumber = 9000000001L;
        obj2.shippingAdderess = "Chennai";
        obj2.dateOfBirth = "27-Jan-1992";
        obj2.gender = 'M';
        obj2.orderHistory = "T-Shirt,Jeans";

        Suppliers sup1 = new Suppliers();
        sup1.Id = 7901;
        sup1.Name = "ABC Traders";
        sup1.MobileNumber = 8000000000L;
        sup1.billingAddress = "Mumbai";
        sup1.itemsStock = 10;
        sup1.paymentStatus = "Paid";
        sup1.feedbackRating = 4.75d;

        Suppliers sup2 = new Suppliers();
        sup2.Id = 7972;
        sup2.Name = "XYZ Enterprises";
        sup2.MobileNumber = 8000000900L;
        sup2.billingAddress = "Kolkata";
        sup2.itemsStock = 7;
        sup2.paymentStatus = "Unpaid";
        sup2.feedbackRating = 4.35d;

        obj1.displayProfileDetail(obj1.Name,obj1.MobileNumber);
        obj2.displayProfileDetail(obj2.Name,obj2.MobileNumber);
        sup1.displayProfileDetail(sup1.Name,sup1.MobileNumber);
        sup2.displayProfileDetail(sup2.Name,sup2.MobileNumber);

        obj1.editAddress(obj1.shippingAdderess,"Coimbatore");
        sup1.editAddress(sup1.billingAddress,"Delhi");

        obj1.placeOrder();

        sup1.increaseStockLevel(sup1.Name,5,sup1.itemsStock);
        sup2.increaseStockLevel(sup2.Name,10,sup2.itemsStock);
    }	
}

class Users {
    public int Id;
    public String Name;
    public Long MobileNumber;

    public void editAddress(String Address,String toReplace){
        System.out.println(this.Name + "," + " " + Address);
        String newAddress = Address.replace(Address,toReplace);
        System.out.println(this.Name + "," + " " + newAddress);
    }

    public String displayProfileDetail(String Name,Long MobileNumber) {
        System.out.println(Name + "," + " " + MobileNumber);
        return Name;
    }

}

class Customers extends Users{
    public String shippingAdderess;
    public String dateOfBirth;
    public char gender;
    public String orderHistory;

    
    public void placeOrder() {
        System.out.println("Order placed successfully!");        
    }

}

class Suppliers extends Users {
    public String billingAddress;
    public int itemsStock;
    public String paymentStatus;
    public double feedbackRating;

    public String increaseStockLevel(String Suppliers,int addStock, int currStock) {
        int totalStock = addStock + currStock;
        System.out.println(Suppliers + "," + " " + totalStock);
        return Suppliers;
    }
}