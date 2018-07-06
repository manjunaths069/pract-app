package hello;
public class FindingE {
    public String s1= "Umbrella";
    public String find1() {
        boolean per = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'e') {
                per = true;
                break;
            }
            System.out.println(per);
        }
        return s1;
    }
    public static void main (String args[]){
        FindingE a = new FindingE();
        System.out.println("Searching for E:"+a.find1());
    }
}
