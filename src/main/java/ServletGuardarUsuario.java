
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import qc.hj.proyecto1.controller.HibernateUtilidades;
import qc.hj.proyecto1.controller.Trabajador;

/**
 *
 * @author T107
 */
public class ServletGuardarUsuario extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        SessionFactory factory = HibernateUtilidades.getSessionFactory();
        Session sesion = factory.openSession();
        Transaction tranza = sesion.beginTransaction();
        sesion.save(new Trabajador("raton", "vaquero","cri-cri"));
        tranza.commit();
        sesion.close();
       out.println("Ya se guardo!!");
        }
    }

    