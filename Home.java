package app;

import java.util.ArrayList;

import io.javalin.http.Context;
import io.javalin.http.Handler;

/**
 * Temporary HTML as an example page.
 * 
 * Based on the Project Workshop code examples.
 * This page currently:
 *  - Provides a link back to the index page
 *  - Displays the list of movies from the Movies Database using the JDBCConnection
 *
 * @author Timothy Wiley, 2021. email: timothy.wiley@rmit.edu.au
 * @author Santha Sumanasekara, 2021. email: santha.sumanasekara@rmit.edu.au
 */
public class Home implements Handler {

    // URL of this page relative to http://localhost:7000/
    public static final String URL = "/home.html";

    @Override
    public void handle(Context context) throws Exception {
        // Create a simple HTML webpage in a String
        String html = "<html>";

        // Add some Header information
        html = html + "<head>" + 
               "<title>Computing for Good</title>";

        // Add some CSS (external file)
        html = html + "<link rel='stylesheet' type='text/css' href='common.css' />";

        // Add the body
        html = html + "<body>";

        // Add HTML for link back to the homepage
        html = html + "<h1>Computing for Good</h1>";
        html = html + "<p><i>Make the most of our useful and accurate resources for change and to address the social challenge. </i></p>";
        html = html + "<a href='/'>Questions? Contact Us</a><br>";
        html = html + "<a href='/'><i>Find out more about case numbers and other trends in my country.</i></a><br>";
        html = html + "<a href='/'><i>Detailed reports and graphs with a wide range of countries.</i></a><br>";
        html = html + "<a href='/'>Safe practices to reduce the risk of transmission</a><br>";
        html = html + "<a href='/'>Statistical Analysis</a>";


        // Finish the List HTML
        html = html + "</ul>";

        // Finish the HTML webpage
        html = html + "</body>" + "</html>";


        // DO NOT MODIFY THIS
        // Makes Javalin render the webpage
        context.html(html);
    }

}
