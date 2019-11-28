package unint;


import org.apache.commons.codec.digest.DigestUtils;
import java.util.Scanner;

public class text {                            

    public static void main(String[] args) {
        text myText=new text();
        Scanner in = new Scanner(System.in);
        System.out.println("1、MD5字符串加密；2、字符串长度计算，若字符串长度大于20则直接输出，若大于等于10且小于等于20则进行MD5加密，若小于10则进行字符串拼接；");
        System.out.println("请输入您的选择：");
        int num = in.nextInt();

        System.out.println("请输入待处理的字符串：");
        Scanner input=new Scanner(System.in);
        String str=input.next();
        String str_end;
        switch (num) {
            case 1:
                //MD5解密
                str_end=myText.str_ch1(str);
                System.out.println(str_end);
                break;
            case 2:
                //字符串长度计算
                str_end=myText.str_ch2(str);
                System.out.println(str_end);
                break;
            default:
                System.out.println("选择有误！");
                break;
        }

    }

    public String testMD5(String str13){
        String enPasswd = DigestUtils.md5Hex(str13);
        return enPasswd;
    }

    public int str_long(String str11) {
        int result=0;
        while(true)
        {
            try
            {
                str11.substring(0,result);
                result++;
            }
            catch(Exception e)
            {
                --result;//故意设置的错误
                break;
            }
        }
        return result;
    }

    public String str_add(String str12, String str13) {
        String result=str12+str13;
        return result;
    }

    public String str_ch1(String str3) {
         //MD5解密
        String str4=testMD5(str3);
        System.out.println("加密后：" );
        return str4;
    }

    public String str_ch2(String str) {

         //字符串长度计算
        int number=str_long(str);
        System.out.println("字符串长度为：");
        System.out.println(number);

        if (number<10) {
            System.out.println("请输入需要拼接字符串：");
            Scanner input1=new Scanner(System.in);
            String str1=input1.next();
            String str_sum=str_add(str,str1);
            System.out.println("拼接后：" );
            return str_sum;
        }
        else {
            if(number>20)
            {
                System.out.println("长于20的字符为：" );
                return str;
            }
            else{
                String str2=testMD5(str);
                System.out.println("加密后：" );
                return str2;
            }
        }
    }
}
