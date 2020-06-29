public class emailGen {
    private String firstName;
    private String lastName;
    private String department;
    private String company;
    private String password;
    private final int length = 10;
    public emailGen(String firstName,String lastName,String department,String company){
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.department = department;
    }
    public String gen_email(){
        String email = new String(firstName+"."+lastName+"@"+department+"."+company+".com");
        passwordGen(length);
        return email;
    }
    private void passwordGen(int length){
        String pass_set = "QkadsnAJqeoI!23$65&";
        char[] pass = new char[length];
        int rand;
        for(int i=0;i<pass.length;i++){
            rand = (int) (Math.random()*pass_set.length());
            pass[i]=pass_set.charAt(rand);
        }
        this.password = new String(pass);
        System.out.println("password generate !");
    }
    public String get_pass(){
        return password;
    }
}
