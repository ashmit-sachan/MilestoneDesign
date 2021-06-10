package app;



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
public class Overview implements Handler {

    // URL of this page relative to http://localhost:7000/
    public static final String URL = "/overview.html";

    @Override
    public void handle(Context context) throws Exception {
        // Create a simple HTML webpage in a String
        String html = "<html>";

        // Add some Header information
        html = html + "<head>" + 
               "<title>Computing For Good</title>";

        // Add some CSS (external file)
        html = html + "<link rel='stylesheet' type='text/css' href='common.css' />";

        // Add the body
        html = html + "<body>";

        html = html + "<h1>Three Facts about COVID - 19</h1>" + "<ul>";
        html = html + "<li> There are currently 3,082,663 confirmed deaths due to COVID-19.</li>";
        html = html + "<li> The amount of confirmed COVID-19 equates to approximately 1.89% of the global population.</li>";
        html = html + "<li> The mortality rate of COVID-19 is currently 2.13%.</li>" +"</ul>";

        html = html + "<h1> In a glance: </h1>";

        html = html + "<form action='/overview.html' method='post'>";
        html = html + "   <div class='form-group'>";
        html = html + "      <label for='overview_drop'>Select the range:</label>";
        html = html + "      <select id='overview_drop' name='overview_drop'>";
            html = html + "<option selected>Last Month</option>";
            html = html + "<option>Last Six Months</option>";
            html = html + "<option>Overall</option>";
        html = html + "      </select>";
        html = html + "   </div>";
        html = html + "   <button type='submit' class='btn btn-primary'>Submit</button>";
        html = html + "</form>";






        html = html + "<table><tr><th>New Cases: </th><th>Total Cases: </th>";
        html = html + "<th>Lives Lost: </th><th>30 Day Average: </th><th>Mortality Rate: </th><th>Most New Cases: </th></tr>";
        html = html + "</table>";

        html = html + "<p>Still interested? ";
        html = html + "<a href='/infectionsbycountry.html'>Find out more about cases</a>" + "  ";
        html = html + "<a href='/deathsbycountry.html'>Find out more about deaths</a>";
        html = html + "</p>";


        

        // Finish the List HTML
        html = html + "</ul>";

        // Finish the HTML webpage
        html = html + "</body>" + "</html>";


        // DO NOT MODIFY THIS
        // Makes Javalin render the webpage
        context.html(html);
    }

}
