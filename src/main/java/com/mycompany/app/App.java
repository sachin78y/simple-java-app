package com.mycompany.app;

import static spark.Spark.*;

/**
 * Main application class.
 */
public class App {
    private static final String MESSAGE = "Hello From Hitachi System India";

    public static void main(String[] args) {
        // Set the server port
        port(8080);

        // Define a GET route for the API
        get("/api/page", (req, res) -> {
            res.type("text/html");
            return """
                <!DOCTYPE html>
                <html>
                <head>
                    <title>Welcome</title>
                    <style>
                        body {
                            display: flex;
                            justify-content: center;
                            align-items: center;
                            height: 100vh;
                            margin: 0;
                            font-family: Arial, sans-serif;
                            background-color: #f4f4f4;
                        }
                        h1 {
                            font-size: 3rem;
                            color: #333;
                            text-align: center;
                        }
                    </style>
                </head>
                <body>
                    <h1>Hello From Hitachi System India</h1>
                </body>
                </html>
                """;
        });

        // Log the server's status
        System.out.println("Server running at http://localhost:8080/api/page");
    }
}

