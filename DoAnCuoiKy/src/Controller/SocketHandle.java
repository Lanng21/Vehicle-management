package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.ClientInfoStatus;

import View.Admin;


public class SocketHandle {

	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;

	private Socket socket;

	public void run() {
		try {
			socket = new Socket("localhost", 1234);

			dataInputStream = new DataInputStream(socket.getInputStream());
			dataOutputStream = new DataOutputStream(socket.getOutputStream());

			String message;

			while (true) {
				message = dataInputStream.readUTF();
				if (message.equals("End")) {
					break;
				}
				String[] mesageSlip = message.split(",");
				if (mesageSlip[0].equals("login-succses")) {
					System.out.println("Dang nhap thanh cong");
					Client.closeView(Client.View.LOGIN);
					Client.openView(Client.View.ADMIN);
			
				}
				if (mesageSlip[0].equals("login-false")) {
					System.out.println("Dang nhap that bai");
				}

			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Socket getSocket() {
		return socket;
	}

	public DataInputStream getDataInputStream() {
		return dataInputStream;
	}

	public DataOutputStream getDaOutputStream() {
		return dataOutputStream;
	}
}
