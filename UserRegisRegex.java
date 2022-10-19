public class UserRegisRegex {
    public static void main(String[] args) {
        String RegistrationName = "Abhishek_Pawar";

        String UserToCheck = "^[A-Za-z]\\w{5,29}$";
        System.out.println(RegistrationName.matches(UserToCheck));
    }
}
        /*   “^” represents that starting character of the string.
        “[A-Za-z]” makes sure that the starting character is in the lowercase or uppercase alphabet.
        “\\w{5, 29}” represents a check to make sure that the remaining items are word items, which includes the underscore,
                until it reaches the end and that is represented with $.
        The “{5, 29}” represents the 6-30 character constraint given to us minus the predefined first character.*/