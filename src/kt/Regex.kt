package kt

fun main(args : Array<String>) {

}

/**
 * Regular Expression
 * used for pattern matching or string matching


[abc]                               a,b, or c
[^abc]                              any character expect a,b,c
 [a-z]                              a to z
 [A-Z]                              A to Z
 [a-z A-Z]                          a to z and A to Z
 [0-9]                              0 to 9


 occurance - Quantifiers
 [] ?                               occurs 0 or 1 times
 [] +                               occurs 1 or more times
 [] *                               occurs 0 or more times
 [] {n}                             occurs on n times
 [] {n,}                            occurs n or more times
 [] {y,z}                           occurs atleast y times but less than z times


 Regex matches - metacharacters instead of writing long use easy way
 \ d                                [0-9]
 \ D                                [^0-9]
 \ w                                [a-zA-z_0-9]
 \ W                                [^\W]


 \ tells compiler to for character to search for '+,.' used for to identify - or + or any use \ before

 Examples:

 1. Mobile number -> start with 8 or 9 and total digit = 10
    [89][0-9]{9} - total 10 no

 2. First character , uppercase contains lower case alphabet and only one digit allowed in between
    [A-Z][a-z]*[0-9][a-z]*

 3. EmailId - iniyan455@gmail.com
    [a-zA-z0-9_\-\.]+[@][a-z]+[\.][a-z]{2,3}

 */

