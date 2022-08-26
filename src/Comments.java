public class Comments {
    public static void main(String[] args) {
        System.out.println("Single Line Comment");
        //This line is omitted by the compiler
        System.out.println("Yay!.. This line is executed!.");
        Comments comments = new Comments();

        //Executing a block of code with multi_line comment
        comments.multiLineComment();
    }

    public void multiLineComment() {
        /*
         * Multi line comment block is omitted by the compiler
         * Helpful in adding
         * more description to the code
         */
        System.out.println("Multi Line Comment");
        System.out.printf("Multi line commit is omitted!");
    }
}
