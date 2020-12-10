import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Aminozuren {
    public static void main(String[] args) {
        HashMap<String, String> heel_drie = new HashMap<String, String>();

        heel_drie.put("Alanine", "Ala");
        heel_drie.put("Arginine", "Arg");
        heel_drie.put("Asparagine", "Asn");
        heel_drie.put("Asparaginezuur", "Asp");
        heel_drie.put("Cysteïne", "Cys");
        heel_drie.put("Fenylalanine", "Phe");
        heel_drie.put("Glutamine", "Gln");
        heel_drie.put("Glutaminezuur", "Glu");
        heel_drie.put("Glycine", "Gly");
        heel_drie.put("Histidine", "His");
        heel_drie.put("Isoleucine", "Ile");
        heel_drie.put("Leucine", "Leu");
        heel_drie.put("Lysine", "Lys");
        heel_drie.put("Methionine", "Met");
        heel_drie.put("Proline", "Pro");
        heel_drie.put("Serine", "Ser");
        heel_drie.put("Threonine", "Thr");
        heel_drie.put("Tryptofaan", "Trp");
        heel_drie.put("Tyrosine", "Tyr");
        heel_drie.put("Valine", "Val");

        HashMap<String, String> drie_een = new HashMap<String, String>();

        drie_een.put("Ala", "A");
        drie_een.put("Arg", "R");
        drie_een.put("Asn", "N");
        drie_een.put("Asp", "D");
        drie_een.put("Cys", "C");
        drie_een.put("Phe", "F");
        drie_een.put("Gln", "Q");
        drie_een.put("Glu", "E");
        drie_een.put("Gly", "G");
        drie_een.put("His", "H");
        drie_een.put("Ile", "I");
        drie_een.put("Leu", "L");
        drie_een.put("Lys", "K");
        drie_een.put("Met", "M");
        drie_een.put("Pro", "P");
        drie_een.put("Ser", "S");
        drie_een.put("Thr", "T");
        drie_een.put("Trp", "W");
        drie_een.put("Tyr", "Y");
        drie_een.put("Val", "V");

        HashMap<String, String> een_heel = new HashMap<String, String>();

        een_heel.put("A", "Alanine");
        een_heel.put("R", "Arginine");
        een_heel.put("N", "Asparagine");
        een_heel.put("D", "Asparaginezuur");
        een_heel.put("C", "Cysteïne");
        een_heel.put("F", "Fenylalanine");
        een_heel.put("Q", "Glutamine");
        een_heel.put("E", "Glutaminezuur");
        een_heel.put("G", "Glycine");
        een_heel.put("H", "Histidine");
        een_heel.put("I", "Isoleucine");
        een_heel.put("L", "Leucine");
        een_heel.put("K", "Lysine");
        een_heel.put("M", "Methionine");
        een_heel.put("P", "Proline");
        een_heel.put("S", "Serine");
        een_heel.put("T", "Threonine");
        een_heel.put("W", "Tryptofaan");
        een_heel.put("Y", "Tyrosine");
        een_heel.put("V", "Valine");

        Scanner sc= new Scanner(System.in);
        System.out.print("vul een aminozuur in (hoofdletter gevoelig): ");
        String str= sc.nextLine();
        if (str.length()==1){
            if (een_heel.get(str)!= null) {
                System.out.println(heel_drie.get(een_heel.get(str)));
                System.out.println(een_heel.get(str));
            } else {
                System.out.println(str + " is geen aminozuur");
            }

        }
        else if (str.length()==3){
            if (drie_een.get(str) != null) {
                System.out.println(drie_een.get(str));
                System.out.println(een_heel.get(drie_een.get(str)));
            } else {
                System.out.println(str + " is geen aminozuur");
            }

        }
        else{
            if (heel_drie.get(str) != null) {
                System.out.println(heel_drie.get(str));
                System.out.println(drie_een.get(heel_drie.get(str)));
            } else {
                System.out.println(str + " is geen aminozuur");
            }

        }
    }
}
