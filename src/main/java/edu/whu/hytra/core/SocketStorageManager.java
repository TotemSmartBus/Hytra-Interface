package edu.whu.hytra.core;

import java.io.*;
import java.net.Socket;

public class SocketStorageManager implements StorageManager {
    private static final String SUCCESS = "Insert OK!";
    private Socket s;

    public SocketStorageManager(Socket socket) {
        this.s = socket;
    }

    @Override
    public void put(String key, String value) throws Exception {
        write("put:" + key + "," + value);
        String code = read();
        if (!SUCCESS.equals(code)) {
            throw new IOException("error sending command," + code);
        }
    }

    @Override
    public String get(String key) throws Exception {
        write("get:" + key);
        return read();
    }

    public String status() throws Exception {
        write("status");
        return read();
    }

    private void write(String msg) throws Exception {
        OutputStream os = s.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        bw.write(msg);
//        System.out.println("[socket]" + msg);
        bw.flush();
    }

    private String read() throws Exception {
        InputStream is = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String mess = br.readLine();
//        System.out.println("[socket]receive " + mess);
        return mess;
    }

    public void close() throws Exception {
        write("exit");
        s.close();
    }
}
