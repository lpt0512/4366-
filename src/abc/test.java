package abc;

import java.util.ArrayList;

import java.util.HashSet;

import java.util.Set;

 

public class test {

 

    // ��4����������Ϊ3��������ʱ���������������������temp1��

    private static double[] temp1 = new double[3];

    // ��3����������Ϊ2��������ʱ���������������������temp2��

    private static double[] temp2 = new double[2];

 

    private static double sum;

    private static int[] cardArray = new int[4];

    private static char[] operator = { '+', '-', '*', '/' };

    private static double[] scard = new double[4];

    private static boolean isCorrect = false;

 

    /**

     * �г����в��ظ������

     */

    public static void allResult() {

        int allcount = 0;

        int count = 0;

        int times = 0;

        // ����ֻ���Ƕ�����

        // Ϊ�˼����������������ظ���������ϣ�����1,2,3,4��1,2,4,3�����������ظ��ģ�������j = i, k = j����������ѭ��

        for (int i = 1; i < 14; i++) {

            for (int j = i; j < 14; j++) {

                for (int k = j; k < 14; k++)

                    for (int l = k; l < 14; l++) {

                        //�жϻ�ɫ�ظ�������

                        times = times(i, j, k, l);

                        allcount += times;

                        // �жϸñ��ʽ�Ƿ���ȷ

                        if (getExpression(i, j, k, l) != null) {

                            count += times;

                        }

                    }

            }

        }

 

        double rate = (double) count / allcount;

        System.out.println("���п��ܵ���Ϲ��У�" + allcount);

        System.out.println("���Ϊ24����Ϲ��У� " + count);

        System.out.println("�ɹ��ļ�����:" + rate);

    }

 

    /**

     * ��������������4�����ж����ܲ������ٸ��������24����ʽ������ѡ�������ĸ���һ�����ж�����������ϣ�������Ϊ�˵õ�����

     * 

     * @param i

     * @param j

     * @param k

     * @param l

     * @return

     */

    public static ArrayList<String> getExpression(int num1, int num2, int num3, int num4) {

        //����һ��ArrayList�����ڴ�����п��ܵı��ʽ

        ArrayList<String> expressionList = new ArrayList<String>();

        for (int a = 0; a < 4; a++)

            for (int b = 0; b < 4; b++) {

                // ��Щ�ж���Ϊ�˷�ֹ�����������ϣ����紫����������1,4,6,8�����û���жϣ��Ϳ��ܵ��²���1,1,6,8�������

                if (b == a) {

                    continue;

                }

 

                for (int c = 0; c < 4; c++) {

                    if (c == a || c == b) {

                        continue;

                    }

 

                    for (int d = 0; d < 4; d++) {

 

                        if (d == a || d == b || d == c) {

                            continue;

                        }

                        // ���ĸ��������˲�ͬ����ϣ�����1,4,6,8--8,1,6,4��

                        cardArray[a] = num1;

                        cardArray[b] = num2;

                        cardArray[c] = num3;

                        cardArray[d] = num4;

 

                        for (int m = 0; m < 4; m++) {

                            // ����ת��Ϊdouble������Ϊ�˷������ĳ�������

                            scard[m] = (double) cardArray[m] % 13;

                            if (cardArray[m] % 13 == 0) {

                                scard[m] = 13;

                            }

                        }

 

                        // ����һ������

                        expressionList = search();

 

                        // �����������������ȷ�ģ���ô��isCorrect��Ϊfalse�������´�ʹ��

                        if (isCorrect) {

                            isCorrect = false;

                            return expressionList;

                        }

                    }

                }

            }

 

        return null;

    }

 

    /**

     * ������������������

     * 

     * @param number1

     *            ����1

     * @param number2

     *            ����2

     * @param operator

     *            ����3

     * @return

     */

    private static double calcute(double number1, double number2, char operator) {

        if (operator == '+') {

            return number1 + number2;

        } else if (operator == '-') {

            return number1 - number2;

        } else if (operator == '*') {

            return number1 * number2;

        } else if (operator == '/' && number2 != 0) {

            return number1 / number2;

        } else {

            return -1;

        }

    }

 

    private static ArrayList<String> search() {

 

        //����һ��ArrayList�����ڴ�����п��ܵı��ʽ

        ArrayList<String> expressionList = new ArrayList<String>();

        // ��һ�η��õķ��ţ��������ȼ���ߣ�

        for (int i = 0; i < 4; i++) {

 

            // �ڶ��η��õķ��ţ��������ȼ��θߣ�

            for (int j = 0; j < 4; j++) {

 

                // �����η��õķ��ţ����һ�����㣩

                for (int k = 0; k < 4; k++) {

 

                    // ���ȼ���������������֣�����3��������൱�����ŵ����ã�Ҳ���Ǹ������ȼ�˳�����

                    for (int m = 0; m < 3; m++) {

                        // ������ֳ���Ϊ������ʽ���������˴�ѭ��

                        if (scard[m + 1] == 0 && operator[i] == '/') {

                            break;

                        }

                        // ��4������������ȡ����������Ȼ�󽫿��ܽ������ȼ�������������㣬Ȼ��õ�ֵ��ע�⣺���������ȼ���ߵ��������Ҳ���ǵ�һ�η��õķ���

                        temp1[m] = calcute(scard[m], scard[m + 1], operator[i]);

                        // ����������û�н��м����ֵ��ֵ��temp1����

                        temp1[(m + 1) % 3] = scard[(m + 2) % 4];

                        temp1[(m + 2) % 3] = scard[(m + 3) % 4];

 

                        // ��ȷ�����ȼ�����������֣���������൱��ʣ������������˳�򴢴���temp1������

                        // ��������ѡ���ȼ���������������֣�����������൱�ڵڶ�������

                        for (int n = 0; n < 2; n++) {

                            if (temp1[n + 1] == 0 && operator[j] == '/') {

                                break;

                            }

                            // �����㣬��������������Ϊ������������ע�⣺���������ȼ���ߵ��������Ҳ���ǵڶ��η��õķ���

                            temp2[n] = calcute(temp1[n], temp1[n + 1], operator[j]);

                            temp2[(n + 1) % 2] = temp1[(n + 2) % 3];

 

                            if (temp2[1] == 0 && operator[k] == '/') {

                                break;

                            }

 

                            // ��������������Ϊһ����������ע�⣺���������ȼ���ߵ��������Ҳ���ǵ����η��õķ���

                            sum = calcute(temp2[0], temp2[1], operator[k]);

 

                            // ����ܹ�24����ô������ʽ�����

                            if (sum == 24) {

                                isCorrect = true;

                                String expression = "";

 

                                // ��������г���ʽ

                                if (m == 0 && n == 0) {

                                    expression = "((" + (int) scard[0] + operator[i] + (int) scard[1] + ")"

                                            + operator[j] + (int) scard[2] + ")" + operator[k] + (int) scard[3] + "="

                                            + (int) sum;

                                } else if (m == 0 && n == 1) {

                                    expression = "(" + (int) scard[0] + operator[i] + (int) scard[1] + ")" + operator[k]

                                            + "(" + (int) scard[2] + operator[j] + (int) scard[3] + ")=" + (int) sum;

                                } else if (m == 1 && n == 0) {

                                    expression = "(" + (int) scard[0] + operator[j] + "(" + (int) scard[1] + operator[i]

                                            + (int) scard[2] + "))" + operator[k] + (int) scard[3] + "=" + (int) sum;

                                } else if (m == 2 && n == 0) {

                                    expression = "(" + (int) scard[0] + operator[j] + (int) scard[1] + ")" + operator[k]

                                            + "(" + (int) scard[2] + operator[i] + (int) scard[3] + ")=" + (int) sum;

                                } else if (m == 2 && n == 0) {

                                    expression = (int) scard[0] + operator[k] + "(" + (int) scard[1] + operator[j] + "("

                                            + (int) scard[2] + operator[i] + (int) scard[3] + "))=" + (int) sum;

                                }

 

                                System.out.println(expression);

                                expressionList.add(expression);

                            }

                        }

                    }

                }

            }

        }

        return expressionList;

    }

 

    /**

     * ���öԻ�ɫ��������ϣ����⻨ɫ�ظ��������ؼ��������������Ч��

     * @param i

     * @param j

     * @param k

     * @param l

     * @return

     */

    private static int times(int i,int j,int k,int l){

        //����set�ж��ж������ظ�

        Set<Integer> set =new HashSet<Integer>();

        set.add(i);

        set.add(j);

        set.add(k);

        set.add(l);

        //��4����������ȫ��һ��ʱ��ֻ������һ�ֻ�ɫ����ϣ��������6��÷��6������6������6

        if(set.size()==1){

            return 1;

        }

        //��4�����У�����������ͬ���������������ͬʱ������C4ȡ2����C4ȡ1����C4ȡ1�ֿ��ܵĻ�ɫ��ϣ��������6��÷��6������7������8

        else if(set.size()==3){

            return 96;

        }

        //��4����ȫ����ͬʱ������C4ȡ1����C4ȡ1����C4ȡ1����C4ȡ1�֣�256�����

        else if(set.size()==4){

            return 256;

        }

        else{

            //��4�����У�������ͬʱ��ͬ���ģ�����������ϣ�һ����C4ȡ2����C4ȡ2����36�����

            if((i==j&&k==l)||(i==k&&j==l)){

                return 36;

            }

            //��4����������������ͬ������һ������ͬʱ

            else {

                return 16;

            }

        }

    }

}
