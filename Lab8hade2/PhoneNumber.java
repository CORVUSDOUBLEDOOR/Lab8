package Lab8hade2;

public class PhoneNumber {
    private String name;
    private String Tel;
    PhoneNumber(){
        name = "unknow";
        Tel = "Tel";
    }
    public PhoneNumber(String name, String tel) {
        this.name = name;
        Tel = tel;
    }
    public String getName() {
        return name;
    }
    public String getTel() {
        return Tel;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTel(String tel) {
        this.Tel = tel;
    }

}

