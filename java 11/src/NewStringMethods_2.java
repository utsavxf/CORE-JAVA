public class NewStringMethods_2 {
    public static void main(String[] args) {
        //isBlank()
        //Checks if a string is empty or contains only whitespace characters.
        System.out.println("".isBlank());
        System.out.println("   ".isBlank());
        System.out.println("abc".isBlank());

        //strip()
        //Removes leading and trailing whitespace. Unlike trim(), it also removes Unicode whitespace characters.
        String str = "\u2003  Hello World  \u2003";
        System.out.println("Before strip: [" + str + "]");
        System.out.println("After strip: [" + str.strip() + "]");

        System.out.println(str.stripLeading());//removes leading white spaces
        System.out.println(str.stripTrailing());//removes trailing white spaces

        // repeat(int count)
        //Repeats the string count times.

        var name="Utsav ";
        System.out.println(name.repeat(5));
    }
}
