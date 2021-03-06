package test1;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class PhotoDownload {
	public static int count = 1;
	
	public static void main(String[] args) throws Exception {
		String[] grades = {"15"};
		String[] majors = generateMajors();
		for(int i = 0; i < grades.length; i++) {
			for(int j = 0; j < majors.length; j++) {
				count = 0;
				downloadPhotos(generateIds(grades[i] + majors[j]), "D:\\photos\\" + grades[i] + majors[j]);
			}
		}

	}
	
	public static String[] generateMajors() {
		String[] majors = new String[290];
		for(int i = 0; i < 290; i++) {
			majors[i] = String.valueOf(i + 1090);
		}
		return majors;
	}

	public static void downloadPhotos(String[] ids, String path) throws Exception {
		int missNum = 0;
		String grade = ids[0].substring(0, 2);
		for (int i = 0; i < ids.length; i++) {
			System.out.println(i);
//			http://desktop.nju.edu.cn:8080/jiaowu/Data/Photos/  大二
//			http://jw.nju.edu.cn:8080/jiaowu/Data/Photos/   大一
			String strURL = "http://desktop.nju.edu.cn:8080/jiaowu/Data/Photos/" + grade + "/" + ids[i] + ".JPG";
			System.out.println(strURL);
			if (isNetFileAvailable(strURL, path)) {
				
			}else {
				missNum++;
			}
			if (missNum > 20) {
				break;
			}
			count++;
		}
		
	}
	
	public static String[] generateIds(String majorId) {
		String[] idStrings = new String[300];
		for (int i = 0; i < idStrings.length; i++) {
			idStrings[i] = new String(majorId + myInteger2String(i + 1));
		}
		return idStrings;
	}
	
	
	public static byte[] readInputStream(InputStream inStream) throws Exception {
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		// 创建一个Buffer字符串
		byte[] buffer = new byte[1024];
		// 每次读取的字符串长度，如果为-1，代表全部读取完毕
		int len = 0;
		// 使用一个输入流从buffer里把数据读取出来
		while ((len = inStream.read(buffer)) != -1) {
			// 用输出流往buffer里写入数据，中间参数代表从哪个位置开始读，len代表读取的长度
			outStream.write(buffer, 0, len);
		}
		// 关闭输入流
		inStream.close();
		// 把outStream里的数据写入内存
		return outStream.toByteArray();
	}

	public static String myInteger2String(int i) {
		StringBuilder result = new StringBuilder();
		for (int j = 0; j < 2 - (int) Math.log10(i); j++) {
			result.append("0");
		}
		result.append(Integer.toString(i));
		return result.toString();
	}
	
	public static boolean isNetFileAvailable(String strUrl, String path) throws Exception {
		InputStream netFileInputStream = null;
		try {
			URL url = new URL(strUrl);
			URLConnection urlConn = url.openConnection();
			netFileInputStream = urlConn.getInputStream();
			if (null != netFileInputStream) {
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				// 超时响应时间为2秒
				conn.setConnectTimeout(2 * 1000);
				// 通过输入流获取图片数据
//				InputStream inStream = conn.getInputStream();
				// 得到图片的二进制数据，以二进制封装得到数据，具有通用性
				byte[] data = readInputStream(netFileInputStream);
				// new一个文件对象用来保存图片，默认保存当前工程根目录
				File file = new File(path);
				if(!file.isDirectory()) {
					file.mkdir();
				}
				File imageFile = new File(path, myInteger2String(count) + ".jpg");
				// 创建输出流
				FileOutputStream outStream = new FileOutputStream(imageFile);
				// 写入数据
				outStream.write(data);
				// 关闭输出流
				outStream.close();
				return true;
			} else {
				return false;
			}
		} catch (IOException e) {
			return false;
		} finally {
			try {
				if (netFileInputStream != null)
					netFileInputStream.close();
			} catch (IOException e) {
			}
		}
	}
}
