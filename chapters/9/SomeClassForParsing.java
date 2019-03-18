class SomeClassForParsing {

    // here is a field
    static final String escapedQuote = "And then he said unto the water, \"Be still for I am the Lord\".";
    static final String escapedSlash = "C:\\Programs\\Google\\Chrome";

    static void main(String[] args) {
        System.out.print(escapedQuote);
        System.out.print(escapedSlash);
    }
}