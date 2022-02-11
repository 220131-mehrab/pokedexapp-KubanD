package com.revature.pokedex;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DexService extends HttpServlet {
    public DexService(DexRepository dexRepository) {
    }

    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IDException {
        for (String pokemon: dexRepository.getPocketMonsters()) {
            resp.getWriter().println(pokemon);
        }
    }
}
