package Soapui;

import java.io.File;

import java.io.IOException;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
	//	assertTrue(true);
		File dir = new File("");
		/**
		 * 案例报告存放路径
		 */
		String reportPath =dir.getAbsolutePath() + "\\project_report\\";;
		/**
		 * Soapui案例脚本存放路径
		 */
		String path = dir.getAbsolutePath() + "\\project_xml\\";
		/**
		 * 调用testrunner.bat批处理命令
		 */
		String common =
				// "cmd /D soapui.bat";
				"cmd /D "
						// +"cd D:\\Program
						// Files\\SmartBear\\SoapUI-Pro-5.1.2\\bin"
						+ " D:\\Program Files\\SmartBear\\SoapUI-Pro-5.1.2\\bin\\testrunner.bat -r -j " + path
						+ "IMUserInfo-soapui-project.xml -f " + reportPath + "-FPDF";

		System.out.println("reportPath:" + reportPath);
		System.out.println("path:" + path);
		System.out.println("common: " + common);
		try {
			Process process = Runtime.getRuntime().exec(common);
			System.out.println("done");

		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
