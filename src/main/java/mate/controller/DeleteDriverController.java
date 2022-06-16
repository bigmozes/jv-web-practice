package mate.controller;

import mate.lib.Injector;
import mate.service.DriverService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteDriverController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Long id = Long.valueOf(req.getParameter("id"));
        Injector injector = Injector.getInstance("mate");
        DriverService driverService = (DriverService) injector.getInstance(DriverService.class);
        driverService.delete(id);
        resp.sendRedirect("/drivers");
    }
}
