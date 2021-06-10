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
public class InfectionsbyCountry implements Handler {

    // URL of this page relative to http://localhost:7000/
    public static final String URL = "/infectionsbycountry.html";

    @Override
    public void handle(Context context) throws Exception {

        String html = "<html>";


        html = html + "<head>" + 
               "<title>Infections By Country:</title>";


        html = html + "<link rel='stylesheet' type='text/css' href='common.css' />";


        html = html + "<body>";


        html = html + "<h1>Infections By Country:</h1>";

        html = html + "<h2>Cases: </h2>";
        html = html + "<form action='/infectionsbycountry.html' method='post'>";
        html = html + "   <div class='form-group'>";
        html = html + "      <label for='infections_drop'>Select the range:</label>";
        html = html + "      <select id='infections_drop' name='infections_drop'>";
            html = html + "<option selected>Per Capita</option>";
            html = html + "<option>Total</option>";
        html = html + "      </select>";
        html = html + "   </div>";
        html = html + "   <button type='submit' class='btn btn-primary'>Submit</button>";
        html = html + "</form>";

        html = html + "<table><tr><th>Country:</th> <th>Cases:</th>";
        html = html + "<th>Recovered</th></tr>";
        html = html + "</table>";

        html = html + "<h2>Australia</h2>";

        html = html + "<form action='/infectionsbycountry.html' method='post'>";
        html = html + "   <div class='form-group'>";
        html = html + "      <label for='australia_drop'>Select the range:</label>";
        html = html + "      <select id='australia_drop' name='australia_drop'>";
            html = html + "<option selected>Per Capita</option>";
            html = html + "<option>Total</option>";
        html = html + "      </select>";
        html = html + "   </div>";
        html = html + "   <button type='submit' class='btn btn-primary'>Submit</button>";
        html = html + "</form>";

        html = html + "<table><tr><th>States:</th> <th>Cases:</th>";
        html = html + "<th>Recovered</th></tr>";
        html = html + "</table>";


        html = html + "<p>Return to Homepage: ";
        html = html + "<a href='/'>Link to Homepage</a>";
        html = html + "</p>";


        JDBCConnection jdbc = new JDBCConnection();


        // Finish the List HTML
        html = html + "</ul>";

        // Finish the HTML webpage
        html = html + "</body>" + "</html>";


        // DO NOT MODIFY THIS
        // Makes Javalin render the webpage
        context.html(html);
    }

}
