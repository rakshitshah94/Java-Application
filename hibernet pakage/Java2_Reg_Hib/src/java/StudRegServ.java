/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.Logininfo;
import modal.Sinfo;
import modal.Smaster;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.*;

/**
 *
 * @author master
 */
public class StudRegServ extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            String uname = request.getParameter("uname");
            String pwd = request.getParameter("pwd");
            String sname = request.getParameter("sname");
            String mob = request.getParameter("mob");
            
            Logininfo li = new Logininfo();
            li.setUname(uname);
            li.setPwd(pwd);
            li.setRole("stud");
            
            
            SessionFactory sf = NewHibernateUtil.getSessionFactory();
            Session ss = sf.openSession();
            
            Transaction tr = ss.beginTransaction();
            ss.save(li);
            
            Smaster sm = new Smaster();
            sm.setUid(li.getUid());
            sm.setSname(sname);
            sm.setSmn(mob);
            ss.save(sm);
            
            tr.commit();
            
            out.println("Success");
        }
        catch(Exception e)
        {
            out.println(e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
