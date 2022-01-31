package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("WITHOUT PREDICT");
        System.out.println(isPhoneNumberValid("05431112266"));
        System.out.println(isPhoneNumberValid("45462"));

        System.out.println("WITH PREDICT");
        //PREDICATE FUNCTION
        System.out.println(isPhoneNumberValidPredicate.test("05431112266"));
        System.out.println(isPhoneNumberValidPredicate.test("0543112312266"));

        System.out.println(
                "Is phone number valid and contains 3 : " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("15153"));

        System.out.println(
                "Is phone number valid and contains 3 : " +
                        isPhoneNumberValidPredicate.or(containsNumber3).test("15153"));
    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("05") && phoneNumber.length() == 11;
    }

    //PREDICATE FUNCTION
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("05") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");
}
