package com.revature.pokedex;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SearchFormService extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String HTMLForm = "<Html>\n" +
                "<head>\n" +
                "    <Title>Search Pokedex" +
                "</Title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <form action='/pokemon' method='get'>\n" +
                "        <input type='name' name='searchName'/>\n" +
                "        <input type='submit' value='Search'/>\n" +
                "    " +
                "    </form>\n" +
                "</body>\n" +
                "</Html>";
        resp.getWriter().println(HTMLForm);
    }
}
