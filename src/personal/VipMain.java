package personal;

public class VipMain {
    public static void main(String[] args) {
        VipCustomer agba = new VipCustomer();
        System.out.println(agba.getName() + " with " + agba.getEmailAddress() + " cannot deposit more than " + agba.getCreditLimit());

        VipCustomer iyawon = new VipCustomer("Fash", 500.00, "fash@gmail.com");
        System.out.println(iyawon.getName() + " with " + iyawon.getEmailAddress() + " has " + iyawon.getCreditLimit());

        VipCustomer babao = new VipCustomer("Ojo", 2000.00);
        System.out.println(babao.getName() + " with " + babao.getEmailAddress() + " has " + babao.getCreditLimit());
    }
}
