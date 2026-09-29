public class marks {
    public static void main(String[] args) {
        int marks1 = 65;
        int marks2 = 80;
        int marks3 = 69;
        int marsk4 = 40;
        int marks5 = 79;
        int marks = marks1 + marks2 + marks3 + marsk4 + marks5 / 5;
        String valid = (marks<0 || marks<100)? "invalid Marks": "valid Marks";
        String result = marks>40 ? marks == 40 && marks <=59?"Second Class":marks>=60&&marks<=74 ?"Fisrt class": marks>=75?"Distinction":"pass" : "fail" ;
        
        System.out.println("valid:"+valid)
        System.out.println("Result:"+result);



        
    }
}