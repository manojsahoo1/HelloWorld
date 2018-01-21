public class Main {

    public static void main(String[] args) {
        Car hyundai = new Car();
        hyundai.setModelYear(2012);
        hyundai.setName("hy");
        System.out.println(hyundai.getModelYear());
        if (hyundai.getName()!=null){
            System.out.println(hyundai.getName().toString());
        }
    }
}
