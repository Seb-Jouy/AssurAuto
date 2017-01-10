/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import bean.ProfilBean;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author merguez
 */
public class CmdUtilisation implements ICommand{

    public CmdUtilisation() {
    }

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        ProfilBean profilBean = new ProfilBean();
        profilBean.setNom(request.getParameter("nom"));
        profilBean.setPrenom(request.getParameter("prenom"));
        profilBean.setMail(request.getParameter("mail"));
        profilBean.setJeune(Boolean.parseBoolean(request.getParameter("jeune")));
        
        HttpSession httpSession = request.getSession(true);
        httpSession.setAttribute("profilBean", profilBean);
        
        return "WEB-INF/devisutilisation.jsp";
    }
    
    
    
}