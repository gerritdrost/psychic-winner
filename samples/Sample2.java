public class Sample2 {
    // Step 'palantir-java-format' found problem in 'samples/Sample2.java':
    // 12:18: error: did not generate token "A
    //                 "
    // com.palantir.javaformat.java.FormatterException: 12:18: error: did not generate token "A
    //                 "
    void problem_2(char c) {
        switch (c) {
            case '\u0000':
                System.out.println("NUL");
            case '\n': // \u000A
                System.out.println("LF");
                break;
        }
    }
}
