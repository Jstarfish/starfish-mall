package priv.starfish;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;
import priv.starfish.common.utils.FtpUtil;


public class FTPTest {

	@Test
	public void testFtpClient() throws Exception {
		//创建一个FtpClient对象
		FTPClient ftpClient = new FTPClient();
		//创建ftp连接。默认是21端口
		ftpClient.connect("192.168.26.58", 21);
		//登录ftp服务器，使用用户名和密码
		ftpClient.login("ftpuser", "nideshengri");
		//上传文件。
		//读取本地文件
		FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\shabi.jpg"));
		//设置上传的路径
		ftpClient.changeWorkingDirectory("/home/ftpuser/images");
		//修改上传文件的格式
		ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
		//第一个参数：服务器端文档名
		//第二个参数：上传文档的inputStream
		ftpClient.storeFile("hello.jpg", inputStream);
		//关闭连接
		ftpClient.logout();
		
	}
	
	@Test
	public void testFtpUtil() throws Exception {
		FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\test.png"));
		FtpUtil.uploadFile("192.168.26.58", 21, "ftpuser", "nideshengri", "/home/ftpuser/images", "/2015/09/04", "shabi.jpg", inputStream);
		
	}
}
