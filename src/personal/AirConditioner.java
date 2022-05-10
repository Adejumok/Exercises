package personal;

public class AirConditioner {
    private boolean isOn;
    private String productName;
    private int temperature;

    public void setProductName(String productName) {
        this.productName = productName;
    }
        /*String validProductName = productName.toLowerCase();
        if(validProductName.equals("jum") || validProductName.equals("smart")){
            this.productName = productName;
        }
        else {this.productName = "Unknown";
        }*/
    public String getProductName(){
    return this.productName;
    }
    }
