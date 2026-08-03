/*Q77 — URL Structure Validator

A link checker tool validates whether a string is a properly structured URL. A valid URL must: start with http:// or https://, have at least one dot after the protocol, and have characters after the last dot.

Input:

String[] urls = {
    "https://www.google.com",
    "http://example.se",
    "ftp://invalid.com",
    "https://nodot",
    "www.missing-protocol.com",
    "https://valid.domain.se/path"
};

Expected Output:

https://www.google.com         → VALID
http://example.se              → VALID
ftp://invalid.com              → INVALID (wrong protocol)
https://nodot                  → INVALID (no dot)
www.missing-protocol.com       → INVALID (no protocol)
https://valid.domain.se/path   → VALID

Constraint: Use startsWith() for protocol check. Use indexOf(".") and lastIndexOf(".") for dot checks.*/


class URLStructureValidator {

    public static void main(String[] args) {

        String[] urls = {
                "https://www.google.com",
                "http://example.se",
                "ftp://invalid.com",
                "https://nodot",
                "www.missing-protocol.com",
                "https://valid.domain.se/path"
        };

        for (String url : urls) {
            urlStructureValidator(url);
        }
    }

    private static void urlStructureValidator(String url) {

        if (!(url.startsWith("http://") || url.startsWith("https://"))) {

            System.out.println(url + " → INVALID (wrong protocol)");

        } else if (url.indexOf(".") == -1) {

            System.out.println(url + " → INVALID (no dot)");

        } else if (url.lastIndexOf(".") >= url.length() - 1) {

            System.out.println(url + " → INVALID (nothing after last dot)");

        } else {

            System.out.println(url + " → VALID");
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


