public class count_occurance_of_char_in_string {
    public static void main(String[] args) {

        String str="java programming language";
        int totalcount=str.length();

        int totalcountoccrance=str.replace("a","").length();

        int occunracece=totalcount-totalcountoccrance;
        System.out.println(occunracece);
    }
}
