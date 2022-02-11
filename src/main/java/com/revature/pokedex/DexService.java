package com.revature.pokedex;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DexService extends HttpServlet{
    public DexService(DexRepository dexRepository) {
    }

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IDException {
        for (String pokemon: dexRepository.getPocketMonsters()) {
            resp.getWriter().println(pokemon);
        }
    }
}
