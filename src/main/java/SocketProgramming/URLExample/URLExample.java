package SocketProgramming.URLExample;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by timmanas on 2018-07-29.
 */
public class URLExample {

    //region Main
    public static void main(String [] args)
            throws MalformedURLException {

        URL url1 = new URL("https://www.google.co.in/?gfe_rd=cr&ei=ptYqWK26I4fT8gfth6CACg#q=geeks+for+geeks+java");

        URL url2 = new URL("http", "www.geeksforgeeks.org",
                "/jvm-works-jvm-architecture/");

        URL url3 = new URL("https://www.google.co.in/search?"+
                "q=gnu&rlz=1C1CHZL_enIN71" +
                "4IN715&oq=gnu&aqs=chrome..69i57j6" +
                "9i60l5.653j0j7&sourceid=chrome&ie=UTF" +
                "-8#q=geeks+for+geeks+java");


        // print the String representation of the URL.
        System.out.println(url1.toString());
        System.out.println(url2.toString());
        System.out.println();
        System.out.println("Different components of the URL3-");

        // retrieve the protocol for the URL
        System.out.println("Protocol:- " + url3.getProtocol());

        // retrieve the hostname of the url
        System.out.println("Hostname:- " + url3.getHost());

        // retrive the Port of the url
        System.out.println("Port:- " + url3.getPort());

        // retrieve the defalut port
        System.out.println("Default port:- " + url3.getDefaultPort());

        // retrieve the query part of URL
        System.out.println("Query:- " + url3.getQuery());

        // retrive the path of URL
        System.out.println("Path:- " + url3.getPath());

        // retrive the file name
        System.out.println("File:- " + url3.getFile());

        // retrieve the reference
        System.out.println("Reference:- " + url3.getRef());

        // retrieve the Authority
        System.out.println("Authority:- " + url3.getAuthority());

    }
    //endregion

}


/**

 URL Class

 What ?
 - Allows for construction of the Web URL

 What is a URL ?
 - Stands for Uniform Resource Location



 Explanations of the methods

 1. getAuthority() - Returns the Autority part of the URL
 2. getPath() - Returns the path of the URL OR NULL if empty
 3. getQuery()  - Returns the quert part of the URL.
                - Query is the "?" part of the URL
                - Whenever displaying a result of a query, the ? is displayed
 4. getHost() - returns the hostname of the URL in IPV6 Format
 5. getFile() - Returns the filename
 6. getRef()    - Returns the reference of the URL object
                - The reference part is marked with the "#" in the URL
 7. getPort() - returns the port associated with the protocol associated with the URL
 8. getDefaultPort() - returns the default port used



 */