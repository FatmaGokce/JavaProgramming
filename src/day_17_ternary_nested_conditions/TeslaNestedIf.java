package day_17_ternary_nested_conditions;
/*
char model = 'S';
trim -> "Long range"


when model 'S'
    if trim is "long range":

        "range: 412"
        "top speed: 155 mph"
        "0-60- 3.1sec"
    if trim is "Plaid":

        "range: 412"
        "top speed: 155 mph"
        "0-60- 3.1sec"
    if trim is "Plaid+":

        "range: 412"
        "top speed: 155 mph"
        "0-60- 3.1sec"
when model is '3'
 */
public class TeslaNestedIf {
    public static void main(String[] args) {
        char model = 'S';
        String trim = "long range";

        if (model == 'S'){
            if (trim.equals("long range")){

            }
        }


    }
}
