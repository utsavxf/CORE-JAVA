
//THEORY
/*
Strings in Java are object that represents sequence of characters
The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.
further there are 3 classes which implements CharSequence along with String which are StringBuffer and StringBuilder,It means, we can create strings in Java by using these three classes.

STRING POOL
A specific region within the heap memory.
Stores unique string literals (strings defined using double quotes, e.g., "Hello").
When you create a string literal, the JVM first checks the pool.
If the string already exists, a reference to the existing object is returned.
If not, a new string object is created and stored in the pool.

STRINGBUILDER AND STRINGBUFFER
StringBuilder and StringBuffer are mutable, allowing modifications to the string without creating new objects. This significantly improves performance, especially for operations like frequent appending or insertions.
string builder is used in single-threaded environment and string buffer is used in multithreaded environment as it is thread ,it means two threads can't call the methods of StringBuffer simultaneously.

THEN THERE ARE MULTIPLE METHODS ON THE STRING CLASS
->length(),toLower(),toUpper(),trim(),split(),startsWith(),endsWith(),charAt()... and many more

then there is toString method in Java which you can learn from the below article
https://www.javatpoint.com/understanding-toString()-method



*/


public class Strings_3 {
    public static void main(String[] args) {
       //CREATING  A STRING
       String s1="Hello"; //stored in string pool (a special area in heap to improve efficiency and saves space
       String s2="Hello";
       if(s1==s2) System.out.println("Yes as they s1 and s2 reference to the same object in string pool");
       else System.out.println("No");
       //this will every time create new objects in the heap memory
       String s3=new String("Hello");
       String s4=new String("Hello");
       if(s3==s4) System.out.println("No");
       else System.out.println("Yes as now they are 2 different objects");

       //BUT ABOVE WHAT IF WE ACTUALLY WANT TO COMPARE THE VALUE OF BOTH STRINGS,ABOVE IT COMPARES THE REFERENCES THAT'S WHY THE ELSE BLOCK IS EXECUTED
       //FOR THAT WE HAVE ANOTHER METHOD CALLED EQUALS() WHICH ACTUALLY CHECKS THE CONTENT
       if(s3.equals(s4)) System.out.println("Yes as it now only checks the value");
       else System.out.println("No");

       //STRINGS ARE IMMUTABLE IN JAVA MEANS WHENEVER YOU WILL TRY TO TAMPER WITH IT,A NEW OBJECT WILL BE CREATED IN THE MEMORY ,THIS IS BECAUSE IMPORTANT CREDENTIALS LIKE PASSWORDS,DB CONNECTIONS ARE STORED IN STRINGS

       String s="Hello";
        s.concat("World"); //creates a new object in memory with value HelloWorld but since it has no reference ,it becomes eligible for garbage collection
        System.out.println(s);
       //String t=s.concat("World"); though we can get the reference like this
        s="Utsav";
    }
}
