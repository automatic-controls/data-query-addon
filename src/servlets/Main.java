package servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.controlj.green.addonsupport.*;
import com.controlj.green.addonsupport.access.*;
public class Main extends HttpServlet {
  @Override protected void doGet(final HttpServletRequest req, final HttpServletResponse res) throws ServletException, IOException {
    doPost(req, res);
  }
  @Override protected void doPost(final HttpServletRequest req, final HttpServletResponse res) throws ServletException, IOException {
    
    try{
      DirectAccess.getDirectAccess().getRootSystemConnection().runReadAction(FieldAccessFactory.newDisabledFieldAccess(), new ReadAction(){
        public void execute(SystemAccess sys){
          sys.getGeoRoot().;
          
        }
      });
    }catch(Exception e){

    }
    
  }
}