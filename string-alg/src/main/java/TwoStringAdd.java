/**
 * 两个字符串相加(全正数)
 * @author: CY.Ma
 * @date: 2024/9/23 20:51
 * @description:
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和并同样以字符串形式返回。
 * 你不能使用任何內建的用于处理大整数的库（比如 BigInteger）， 也不能直接将输入的字符串转换为整数形式。
 */
public class TwoStringAdd {
    public static void main(String[] args) {
        String add = addStrings("11111", "123");
        System.out.println(add);
    }

    public static String addStrings(String num1, String num2) {
        int len1=num1.length()-1, len2=num2.length()-1;
        char ch1[]=num1.toCharArray();
        char ch2[]=num2.toCharArray();

        StringBuilder sb=new StringBuilder();
        int remainder =0;//计算余数
        while (len1>=0||len2>=0)
        {
            int n1=len1>=0?(ch1[len1--]-'0'):0;
            int n2=len2>=0?(ch2[len2--]-'0'):0;
            int num=n1+n2+remainder;//求和对应数字
            remainder=num/10;//是否进位
            sb.append(num%10);// 添加到结果字符串中
        }

        if(remainder>0)//是否还需要进位
        {
            sb.append(remainder);
        }
        //反装即为结果
        return sb.reverse().toString();
    }
}
