public class SuperCat {
    
    private String name;
    private String furColor;
    protected int age;


    public SuperCat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    protected String tellYourAttributes(String checkStr) {
        switch (checkStr) {
            case "#name":
                return this.name;
            case "#color":
                return this.furColor;
            // case "#age":
            //     return tellYourAge();
            default:
                return "ERROR";
        }
    }
}
