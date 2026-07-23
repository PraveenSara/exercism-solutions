class MicroBlog {
    public String truncate(String input) {
        int codePoint = Math.min(5, input.codePointCount(0,input.length()));
        int endIndex = input.offsetByCodePoints(0,codePoint);
        return input.substring(0,endIndex);
    }
}
