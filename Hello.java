public class Hello{
    public static void main(String[] args){
        // 2. Extend/Modify the above program to print two additional lines:
        // This is my first program
        // I am on module ST4003CEM
        // System.out.print (not println) and produces the same output.
        System.out.print("Hello World!\n");
        System.out.print("This is my frist program.\n");
        System.out.print("I am on module ST4003CEM.\n");

        // 3. Write a program that prints the following output:
        //     A "quoted" String is
        //     'much' better if you learn
        //     the rules of "escape sequences."
        //     Also, "" represents an empty
        //     String. Don't forget: use \"
        //     instead of " !
        //     '' is not the same as "
        System.out.println("A \"quoted\" String is ");
        System.out.println("\'much\' better if you learn");
        System.out.println("the rules of \"escape sequences\"");
        System.out.println("Also, \"\" reperesents an empty ");
        System.out.println("String. Don't forget: use \\\"");
        System.out.println("instead of \" !");
        System.out.println("\'\' is not the same as \" ");

        // 4. WAP that prints the following pattern:
        //     *
        //     **
        //     ***
        //     ****
        for (int i=1; i<=4; i++){            // this loop is for each line
            for (int j=1; j<=i; j++){        // this loop is for printing stars
                System.out.print("*");
            }
            System.out.println();            // move to the next line
        }

        // 5. WAP prints the following pattern:
        //     *********
        //     *********
        //     *********
        //     *********
        for (int i=1; i<=4; i++){
                System.out.println("*********");
        }

        // 6. WAP that prints the following output:
        //     A well-formed Java program has a main method with { and } braces.
        //     A System.out.println statement has ( and ) and usually a String that starts and ends with a " character.
        //     (But we type \" instead!)
        //     What is the difference between
        //     a ' and a "?  Or between a " and a \"?
        //     One is what we see when we're typing our program. The other is what appears on the "console."
        System.out.println("A well_formed Java program has a main method with method with { and } braces.");
        System.out.println("A System.out.println ststement has ( and ) and usually a String that starts and ends with a \" character.");
        System.out.println("(But we type \\\" instead!)");
        System.out.println("What is the difference between");
        System.out.println("a \' and a \"? Or between a \" and a \\\"?");
        System.out.println("One is what we see when we\'re typing our program. The other is what appears on the \"console.\"");
        

    }
}