package DAY12.Step1;

public class VIPCustomer extends Customer{
    private int agentID;
    double saleRatio;

    public VIPCustomer(){
        //현재 클래스내 customerGrade 변수가 없으니까.
        customerGrade = "VIP"; //private는 상속이 불가능 protected 가능
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int getAgentID(){
        return agentID;
    }
}
