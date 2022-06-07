package Controller;

import java.io.IOException;

import View.Admin;
import View.Login;
import View.Register;
public class Client {

	public static Login login;
	public static Admin admin;
	public static Register register;
	public static SocketHandle socketHandle;
	
	public enum View {
		LOGIN, ADMIN, REGISTER
	}

	public static void closeView(View viewName) {
		
		if (viewName != null) {
			switch (viewName) {
			case LOGIN:
				login.dispose();
				break;
			case ADMIN:
				admin.dispose();
				break;
			case REGISTER:
				register.dispose();
				break;
			}
		}

	}
	
	public static void sendAccount(String account, String password) {
		String s1 = account + "," +password;
		String s2 = EnCryption.enCryption(s1);
		try {
			socketHandle.getDaOutputStream().writeUTF("request-login,"+s2);
			socketHandle.getDaOutputStream().flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void openView(View viewName) {
		if (viewName != null) {
			switch (viewName) {
			case LOGIN:
				login = new Login();
				login.setVisible(true);
				break;
			case ADMIN:
				admin = new Admin();
				admin.setVisible(true);
				break;
			case REGISTER:
				register = new Register(login);
				register.setVisible(true);
				break;
			}
		}
	}
	public void initView() {
		login = new Login();
		login.setVisible(true);
		socketHandle = new SocketHandle();
		socketHandle.run();
	}
	public static void main(String[] args) {
		new Client().initView();
	}
}
