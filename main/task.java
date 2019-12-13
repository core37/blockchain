import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.*;
public class task {
	static String address = "0xf81bdf5bece6f0a2438563776b873bd1f9364c83";
	static String user = "0xfdf3d23daaf671005bf74fcb2b818796185bb5a5";
    final static String url = "http://localhost:5002/WeBASE-Front/trans/handle";
	final static String params =
			"{\"user\":\"" + user+  "\","
            + "\"contractName\":\"main\","
			+ "\"contractAddress\":\"" + address +  "\","
			+ "\"funcName\":\"showReceiptMountById\","
			+ "\"funcParam\":[0],"
			+ "\"groupId\":1,"
			+ "\"useAes\":false}"
			// "{\"enable\":,"
            // + "\"contractName\":\"main\""
			// + "\"contractAddress\":\"0x16c743361c184c77f902d8025fc8258225e59fd5\""
			// + "\"funcName\":\"showReceiptById\""
			// + "\"funcParam\":[0]"
			// + "\"groupId\":1"
			// + "\"useAes\":false"





			;

	public static int createAccount(String name, String info)
	{
		String param = "{\"user\":\"" + user+  "\","
		+ "\"contractName\":\"main\","
		+ "\"contractAddress\":\"" + address +  "\","
		+ "\"funcName\":\"createAccount\","
		+ "\"funcParam\":[\"" +  name + "\",\""  + info + "\"],"
		+ "\"groupId\":1,"
		+ "\"useAes\":false}"
		;
		String res = post(url, param);
		int tres = parseJson(res);
		// System.out.println(tres);
		return  tres;
	}
	public static int createReceipt(int fr, int to, int mount, boolean bankMortgage)
	{
		String param = "{\"user\":\"" + user+  "\","
		+ "\"contractName\":\"main\","
		+ "\"contractAddress\":\"" + address +  "\","
		+ "\"funcName\":\"createReceipt\","
		+ "\"funcParam\":[" +  String.valueOf(fr) + "," + String.valueOf(to) + "," + String.valueOf(mount) + "," + String.valueOf(bankMortgage?1:0) + "],"
		+ "\"groupId\":1,"
		+ "\"useAes\":false}"
		;
		String res = post(url, param);
		int tres = parseJson(res);
		// System.out.println(tres);
		return  tres;
	}

	public static int showReceiptMountById(int id)
	{
		String param = "{\"user\":\"" + user+  "\","
		+ "\"contractName\":\"main\","
		+ "\"contractAddress\":\"" + address +  "\","
		+ "\"funcName\":\"showReceiptMountById\","
		+ "\"funcParam\":[" +  String.valueOf(id) + "],"
		+ "\"groupId\":1,"
		+ "\"useAes\":false}"
		;

		String res = post(url, param);
		int tres = parseJson(res);
		// System.out.println(tres);
		return tres;
	}

	public static int showReceiptfrById(int id)
	{
		String param = "{\"user\":\"" + user+  "\","
		+ "\"contractName\":\"main\","
		+ "\"contractAddress\":\"" + address +  "\","
		+ "\"funcName\":\"showReceiptfrById\","
		+ "\"funcParam\":[" +  String.valueOf(id) + "],"
		+ "\"groupId\":1,"
		+ "\"useAes\":false}"
		;

		String res = post(url, param);
		int tres = parseJson(res);
		// System.out.println(tres);
		return tres;
	}

	public static int showReceipttoById(int id)
	{
		String param = "{\"user\":\"" + user+  "\","
		+ "\"contractName\":\"main\","
		+ "\"contractAddress\":\"" + address +  "\","
		+ "\"funcName\":\"showReceipttoById\","
		+ "\"funcParam\":[" +  String.valueOf(id) + "],"
		+ "\"groupId\":1,"
		+ "\"useAes\":false}"
		;

		String res = post(url, param);
		int tres = parseJson(res);
		// System.out.println(tres);
		return tres;
	}

	public static int showReceiptbankById(int id)
	{
		String param = "{\"user\":\"" + user+  "\","
		+ "\"contractName\":\"main\","
		+ "\"contractAddress\":\"" + address +  "\","
		+ "\"funcName\":\"showReceiptbankById\","
		+ "\"funcParam\":[" +  String.valueOf(id) + "],"
		+ "\"groupId\":1,"
		+ "\"useAes\":false}"
		;

		String res = post(url, param);
		int tres = parseJson(res);
		// System.out.println(tres);
		return tres;
	}

	public static int transferReceipt(int rid, int tc, int mount)
	{
		String param = "{\"user\":\"" + user+  "\","
		+ "\"contractName\":\"main\","
		+ "\"contractAddress\":\"" + address +  "\","
		+ "\"funcName\":\"transferReceipt\","
		+ "\"funcParam\":[" +  String.valueOf(rid) + ',' + String.valueOf(tc)+  ',' + String.valueOf(mount)  + "],"
		+ "\"groupId\":1,"
		+ "\"useAes\":false}"
		;

		String res = post(url, param);
		int tres = parseJson(res);
		// System.out.println(tres);
		return tres;
	}

	public static int bankMortgage(int id)
	{
		String param = "{\"user\":\"" + user+  "\","
		+ "\"contractName\":\"main\","
		+ "\"contractAddress\":\"" + address +  "\","
		+ "\"funcName\":\"bankMortgage\","
		+ "\"funcParam\":[" +  String.valueOf(id) + "],"
		+ "\"groupId\":1,"
		+ "\"useAes\":false}"
		;

		String res = post(url, param);
		int tres = parseJson(res);
		// System.out.println(tres);
		return tres;
	}

	public static int payReceipt(int id, int mount)
	{
		String param = "{\"user\":\"" + user+  "\","
		+ "\"contractName\":\"main\","
		+ "\"contractAddress\":\"" + address +  "\","
		+ "\"funcName\":\"payReceipt\","
		+ "\"funcParam\":[" +  String.valueOf(id) +','+ String.valueOf(mount) + "],"
		+ "\"groupId\":1,"
		+ "\"useAes\":false}"
		;

		String res = post(url, param);
		int tres = parseJson(res);
		// System.out.println(tres);
		return tres;
	}








    public static void main(String[] args) {
		System.out.println("****欢迎使用基于区块链的供应链金融平台****\n--------------------------------\n\n\n");
		System.out.println("主菜单\n------------------------------");


		System.out.println("0：帮助");
		System.out.println("1：创建企业用户");
		System.out.println("2：创建账单");
		System.out.println("3：账单凭据转让");
		System.out.println("4：查询账单");
		System.out.println("5：账单支付");
		System.out.println("6：银行担保贷款");
		System.out.println("7：退出");

		Scanner sc = new Scanner(System.in);

		Vector<String> v = new Vector<String>();
		int op = sc.nextInt();
		int res;
		while(op != 7){
		switch(op){
			case 0:
			System.out.println("1：创建企业用户\n创建企业用户是指新用户在本金融平台上的注册使用。每一个用户第一次使用的时候均需要进行注册获得一个ID，该ID作为用户身份的代表进行一系列操作。");
			System.out.println("2：创建账单\n创建账单是指通过本平台，创建两个用户之间的交易凭据，并将账单上传到区块链上，用于证明该交易是确实产生的。可用于后续转让。");
			System.out.println("3：账单凭据转让\n转让凭据功能指通过本平台，可信的将对应的账单进行拆分，并转让给第三方，，并将转移记录上传上链，新的账单同样具有要求还款的效力");
			System.out.println("4：查询账单\n查询账单可以通过凭据ID，查找出相应的信息，便于用户进行确认");
			System.out.println("5：账单支付\n账单支付功能可以通过对应的ID进行对对应账单的支付还款");
			System.out.println("6：银行担保贷款\n银行可以通过获得该账单的抵押，从而进行贷款，抵押的账单将无法再进行转让，直到抵押完成");


			break;
			case 1:

			String s1, s2;
			System.out.println("请输入对应的用户名称");
			s1 = sc.nextLine();
			s1 = sc.nextLine();
			System.out.println("请输入对应的用户描述");
			s2 = sc.nextLine();
			s2 = sc.nextLine();

			if (v.indexOf(s1) != -1)
			{
				System.out.println("用户重名");
			}
			else
			{
				System.out.println("您的新用户ID是：");
				System.out.println(createAccount(s1, s2));
				v.add(s1);
			}
			break;

			case 2:
			int n1,n2,n3;
			System.out.println("请输入付款方的ID");
			n1 = sc.nextInt();
			System.out.println("请输入收款方的ID");
			n2 = sc.nextInt();
			System.out.println("请输入账单金额");
			n3 = sc.nextInt();

			res = createReceipt(n1,n2,n3,false);
			System.out.println("创建成功，新账单ID为：");
			System.out.println(res);
			break;

			case 3:

			System.out.println("输入账单ID");
			int rid = sc.nextInt();
			System.out.println("输入转让对象");
			int tc = sc.nextInt();
			System.out.println("输入转让金额");
			int mount = sc.nextInt();

			if (showReceiptMountById(rid) >= mount)
			{
				res = transferReceipt(rid, tc, mount);

				System.out.printf("转让成功，原账单余额为：\n%d\n", showReceiptMountById(rid));
				System.out.println("新账单ID为：");
				System.out.println(res);

			}
			else System.out.println("余额不足，转让失败！");
			break;


			case 4:
			System.out.println("请输入需要查询的账单ID");
			int rid2 = sc.nextInt();
			System.out.println("查询结果:");

			System.out.println("发出人ID");
			System.out.println(showReceiptfrById(rid2));
			System.out.println("接收人ID");
			System.out.println(showReceipttoById(rid2));
			System.out.println("账单金额");
			System.out.println(showReceiptMountById(rid2));
			System.out.println("是否已经用作担保");
			System.out.println(showReceiptbankById(rid2)==1?"是":"否");


			break;
			case 5:
			System.out.println("请输入需要支付的账单ID");
			int rid3 = sc.nextInt();
			System.out.println("您目前需要支付的金额：");
			System.out.println(showReceiptMountById(rid3));

			System.out.println("请输入需要支付的金额：");
			int n4 = sc.nextInt();
			if (n4 < 0 ) {
				System.out.println("支付金额不能为负数");
				break;
			}
			if (n4 > showReceiptMountById(rid3)) {
				System.out.println("支付金额超过了应付金额，请重新检查");
				break;
			}
			int payres = payReceipt(rid3, n4);
			if (payres <= 0) System.out.println("支付成功,您已结清款项");
			else System.out.printf("支付成功,还需要支付的金额：%d\n", payres);

			break;

			case 6:
			System.out.println("请输入需要用于担保贷款的账单ID");
			int ridb = sc.nextInt();
			System.out.println("该账单的金额为：");
			System.out.println(showReceiptMountById(ridb));
			bankMortgage(ridb);
			System.out.println("支付成功,您已成功将账单用于贷款");

			default:
			break;


		}
		System.out.println("\n\n\n\n主菜单\n---------------------------------");


		System.out.println("0：帮助");
		System.out.println("1：创建企业用户");
		System.out.println("2：创建账单");
		System.out.println("3：账单凭据转让");
		System.out.println("4：查询账单");
		System.out.println("5：账单支付");
		System.out.println("6：银行担保贷款");
		System.out.println("7：退出");
		op = sc.nextInt();
		}

		System.out.println("感谢使用！");
		sc.close();


    }
	public static int parseJson(String s)
	{
		int i = 20;
		while(!(s.charAt(i) == 'o' && s.charAt(i+1) =='u'&& s.charAt(i+2) =='t')) i++;
		i += 11;
		int j = i;
		while(!(s.charAt(j) == '"')) j++;
		String t = s.substring(i, j);
		int parseInt = Integer.parseInt(t, 16);
		return parseInt;
	}
    /**
     * 发送HttpPost请求
     *
     * @param strURL
     *            服务地址
     * @param params
     *            json字符串,例如: "{ \"id\":\"12345\" }" ;其中属性名必须带双引号<br/>
     * @return 成功:返回json字符串<br/>
     */
    public static String post(String strURL, String params) {
        // System.out.println(strURL);
        // System.out.println(params);
        BufferedReader reader = null;
        try {
            URL url = new URL(strURL);// 创建连接
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);
            connection.setRequestMethod("POST"); // 设置请求方式
            // connection.setRequestProperty("Accept", "application/json"); // 设置接收数据的格式
            connection.setRequestProperty("Content-Type", "application/json"); // 设置发送数据的格式
            connection.connect();
            //一定要用BufferedReader 来接收响应， 使用字节来接收响应的方法是接收不到内容的
            OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream(), "UTF-8"); // utf-8编码
            out.append(params);
            out.flush();
            out.close();
            // 读取响应
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            String line;
            String res = "";
            while ((line = reader.readLine()) != null) {
                res += line;
            }
            reader.close();

            //如果一定要使用如下方式接收响应数据， 则响应必须为: response.getWriter().print(StringUtils.join("{\"errCode\":\"1\",\"errMsg\":\"", message, "\"}")); 来返回
//            int length = (int) connection.getContentLength();// 获取长度
//            if (length != -1) {
//                byte[] data = new byte[length];
//                byte[] temp = new byte[512];
//                int readLen = 0;
//                int destPos = 0;
//                while ((readLen = is.read(temp)) > 0) {
//                    System.arraycopy(temp, 0, data, destPos, readLen);
//                    destPos += readLen;
//                }
//                String result = new String(data, "UTF-8"); // utf-8编码
//                System.out.println(result);
//                return result;
//            }

            return res;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "error"; // 自定义错误信息
    }

}


