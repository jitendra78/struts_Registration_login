package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import bean.LoginBean;
import dao.LoginDao;

public class LoginService extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		 LoginBean obj=(LoginBean)form;
		  LoginDao ld=new LoginDao();
		  if(ld.login(obj)) {
			  return mapping.findForward("loginsuccess");
		  }else
		// TODO Auto-generated method stub
		return mapping.findForward("error");
	}

}
