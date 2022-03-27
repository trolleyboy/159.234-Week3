package oop159234.week3.tutorial3;

public class Tutorial_2 {
    public static void main(String[] args) {
        String html = new String();
        html = "<!DOCTYPE html><html><head><title>My HTML Page</title></head><body><h1>Welcome to my page</h1><p>This page is written in simple HTML<p><p>Since HTML files are just text markup, they can be contained in Java String Objects</p></body></html>";

        System.out.println("String length: " + html.length());
        System.out.println("Has level 1 headers: " + html.contains("<h1>"));
        System.out.println("Has level 1 headers: " + html.contains("<h2>"));
        System.out.println("Has level 1 headers: " + html.contains("<!DOCTYPE"));
        System.out.println("Position of the '!': " + html.indexOf("!"));
        
        int bodyStart = html.indexOf("<body>") + 6;
        int bodyEnd = html.indexOf("</body>");

        System.out.println("Body content: " + html.substring(bodyStart, bodyEnd));;
    }

}
