package abc;

import java.sql.SQLException;
import java.util.Scanner;

import model.DataConnect;

/**
 * 
 * 24����Ϸ��һ�����ڻ���������Ϸ�������4���˿��ƣ���������С������ֻ�ܹ��üӡ������ˡ����Լ��ʵ�����������������
 * 
 * ����˳��ʹ������Ϊ24�������������������޽�ģ�ÿ���Ʊ������㣬����ֻ������һ�Σ� J,Q��K������Ϊ11��12��13
 * 
 * 1������ֵ�Ƿ�24���ĸ�����ȥ����a,b,c,d���м����ڵķ���op1,op2,op3�� a op1 b op2 c op3 d =
 * 
 * 24,�������㻹�����ȼ������⣬������ȥ�����������ȼ� ���ȼ��ļ�������� 1����a op1 b��op2 (c op3 d) 2��(�� a op1
 * 
 * b��op2 c) op3 d 3��a op1 ((b op2 c) op3 d) 4��a op1 (b op2 (c op3 d)) 5��(a op1
 * 
 * (b op2 c) op3 d) op1 ��ȡֵ��Χ�� �������ˣ��� ÿ�θ�4���ƣ��ж�������� ��64*5 = 320�֣�
 * 
 * ��320���ҳ�������Ϊ24�ı��ʽ��ӡ����
 */

public class test2 {
	static String result;

	// �洢�����

	private final static char[] op = { '#', '+', '-', '*', '/' };

	// ���� x op y

	private static float cal(float x, float y, int op) {

		float result = 0; // ������

		switch (op) {

		case 1:

			result = x + y;

			break;

		case 2:

			result = x - y;

			break;

		case 3:

			result = x * y;

			break;

		case 4:

			result = x / y;

			break;

		}

		return result;

	}

	// 1����a op1 b��op2 (c op3 d)

	private static float cal_expressiona1(float a, float b, float c, float d,
			int op1, int op2, int op3) {

		float r1, r2, r3;

		r1 = cal(a, b, op1);

		r2 = cal(c, d, op3);

		r3 = cal(r1, r2, op2);

		return r3;

	}

	// 2��(�� a op1 b��op2 c) op3 d

	private static float cal_expressiona2(float a, float b, float c, float d,
			int op1, int op2, int op3) {

		float r1, r2, r3;

		r1 = cal(a, b, op1);

		r2 = cal(r1, c, op2);

		r3 = cal(r2, d, op3);

		return r3;

	}

	// 3��a op1 ((b op2 c) op3 d)

	private static float cal_expressiona3(float a, float b, float c, float d,
			int op1, int op2, int op3) {

		float r1, r2, r3;

		r1 = cal(b, c, op2);

		r2 = cal(r1, d, op3);

		r3 = cal(a, r2, op1);

		return r3;

	}

	// 4��a op1 (b op2 (c op3 d))

	private static float cal_expressiona4(float a, float b, float c, float d,
			int op1, int op2, int op3) {

		float r1, r2, r3;

		r1 = cal(c, d, op3);

		r2 = cal(b, r1, op2);

		r3 = cal(a, r2, op1);

		return r3;

	}

	// 8��a op1 (b op2 c) op3 d

	private static float cal_expressiona8(float a, float b, float c, float d,
			int op1, int op2, int op3) {

		float r1, r2, r3;

		if (op[op1] >= op[op3]) {
			r1 = cal(b, c, op2);

			r2 = cal(a, r1, op1);

			r3 = cal(r2, d, op3);
		} else {
			r1 = cal(b, c, op2);

			r2 = cal(d, r1, op3);

			r3 = cal(r2, a, op1);
		}
		return r3;

	}

	// 6��a op1 b op2 c op3 d

	private static float cal_expressiona6(float a, float b, float c, float d,
			int op1, int op2, int op3) {

		float r1, r2, r3 = 0;

		if (op[op1] >= op[op2] && op[op1] >= op[op3] && op[op2] >= op[op3]) {
			r1 = cal(a, b, op1);

			r2 = cal(r1, c, op2);

			r3 = cal(r2, d, op3);
		}
		if (op[op1] >= op[op2] && op[op1] >= op[op3] && op[op2] < op[op3]) {
			r1 = cal(a, b, op1);

			r2 = cal(d, c, op3);

			r3 = cal(r2, r1, op2);
		}
		if (op[op2] > op[op1] && op[op2] >= op[op3] && op[op1] >= op[op3]) {
			r1 = cal(c, b, op2);

			r2 = cal(a, r1, op1);

			r3 = cal(r2, d, op3);
		}
		if (op[op2] > op[op1] && op[op2] >= op[op3] && op[op1] < op[op3]) {
			r1 = cal(c, b, op2);

			r2 = cal(d, r1, op3);

			r3 = cal(r2, a, op1);
		}
		if (op[op3] > op[op1] && op[op3] > op[op2] && op[op1] >= op[op2]) {
			r1 = cal(c, d, op3);

			r2 = cal(a, b, op1);

			r3 = cal(r2, r1, op2);
		}
		if (op[op3] > op[op1] && op[op3] > op[op2] && op[op1] < op[op2]) {
			r1 = cal(c, d, op3);

			r2 = cal(r1, b, op2);

			r3 = cal(r2, a, op1);
		}
		return r3;

	}

	// 7��(a op1 b) op2 c op3 d
	private static float cal_expressiona7(float a, float b, float c, float d,
			int op1, int op2, int op3) {

		float r1, r2, r3;
		if (op[op2] >= op[op3]) {
			r1 = cal(a, b, op1);

			r2 = cal(r1, c, op2);

			r3 = cal(r2, d, op3);
		} else {
			r1 = cal(a, b, op1);

			r2 = cal(d, c, op3);

			r3 = cal(r2, r1, op2);
		}
		return r3;

	}

	// 5��(a op1 (b op2 c)) op3 d
	private static float cal_expressiona5(float a, float b, float c, float d,
			int op1, int op2, int op3) {

		float r1, r2, r3;

		r1 = cal(c, b, op2);

		r2 = cal(r1, a, op1);

		r3 = cal(r2, d, op3);

		return r3;

	}

	// 9��a op1 b op2 (c op3 d)
	private static float cal_expressiona9(float a, float b, float c, float d,
			int op1, int op2, int op3) {

		float r1, r2, r3;
		if (op[op1] >= op[op2]) {
			r1 = cal(c, d, op3);

			r2 = cal(a, b, op1);

			r3 = cal(r2, r1, op2);
		} else {
			r1 = cal(c, d, op3);

			r2 = cal(r1, b, op2);

			r3 = cal(r2, a, op1);
		}
		return r3;

	}

	// 10��(a op1 b op2 c) op3 d
	private static float cal_expressiona10(float a, float b, float c, float d,
			int op1, int op2, int op3) {

		float r1, r2, r3;
		if (op[op1] >= op[op2]) {

			r1 = cal(a, b, op1);

			r2 = cal(r1, c, op2);

			r3 = cal(r2, d, op3);
		} else {
			r1 = cal(c, b, op2);

			r2 = cal(r1, a, op1);

			r3 = cal(r2, d, op3);
		}
		return r3;

	}

	// 11��a op1 (b op2 c op3 d)
	private static float cal_expressiona11(float a, float b, float c, float d,
			int op1, int op2, int op3) {

		float r1, r2, r3;
		if (op[op2] >= op[op3]) {
			r1 = cal(c, b, op2);

			r2 = cal(d, r1, op3);

			r3 = cal(r2, a, op1);
		} else {
			r1 = cal(c, d, op3);

			r2 = cal(b, r1, op2);

			r3 = cal(r2, a, op1);
		}
		return r3;

	}

	static void get(int a, int b, int c, int d) throws SQLException,
			ClassNotFoundException {

		// boolean flag = false; // �ж�24��־ δ�õ�����false

		// int op1,op2,op3;

		for (int op1 = 1; op1 <= 4; op1++) {

			for (int op2 = 1; op2 <= 4; op2++) {

				for (int op3 = 1; op3 <= 4; op3++) {

					// ���ñ��ʽ1�ķ����� a op1 b��op2 (c op3 d)

					if (cal_expressiona1(a, b, c, d, op1, op2, op3) == 24) {

						result = "(" + a + op[op1] + b + ")" + op[op2] + "("
								+ c + op[op3] + d + ")";
						ugold(result);

					}

					// ���ñ��ʽ2�ķ��� (�� a op1 b��op2 c) op3 d

					if (cal_expressiona2(a, b, c, d, op1, op2, op3) == 24) {

						result = "((" + a + op[op1] + b + ")" + op[op2] + c
								+ ")" + op[op3] + d;
						ugold(result);

					}

					// ���ñ��ʽ3�ķ��� a op1 ((b op2 c) op3 d)

					if (cal_expressiona3(a, b, c, d, op1, op2, op3) == 24) {

						result = a + op[op1] + "((" + b + op[op2] + c + ")"
								+ op[op3] + d + ")";
						ugold(result);

					}

					// ���ñ��ʽ4�ķ��� a op1 (b op2 (c op3 d))

					if (cal_expressiona4(a, b, c, d, op1, op2, op3) == 24) {

						result = a + op[op1] + "(" + b + op[op2] + "(" + c
								+ op[op3] + d + "))";
						ugold(result);

					}

					// ���ñ��ʽ8�ķ��� a op1 (b op2 c) op3 d

					if (cal_expressiona8(a, b, c, d, op1, op2, op3) == 24) {

						result = a + op[op1] + "(" + b + op[op2] + c + ")"
								+ op[op3] + d;
						ugold(result);

					}
					// ���ñ��ʽ6�ķ��� a op1 b op2 c op3 d

					if (cal_expressiona6(a, b, c, d, op1, op2, op3) == 24) {

						result = "" + a + op[op1] + b + op[op2] + c + op[op3]
								+ d;
						ugold(result);

					}
					// ���ñ��ʽ7�ķ��� (a op1 b) op2 c op3 d

					if (cal_expressiona7(a, b, c, d, op1, op2, op3) == 24) {

						result = "(" + a + op[op1] + b + ")" + op[op2] + c
								+ op[op3] + d;
						ugold(result);

					}
					// ���ñ��ʽ5�ķ��� (a op1 (b op2 c)) op3 d

					if (cal_expressiona5(a, b, c, d, op1, op2, op3) == 24) {

						result = "(" + a + op[op1] + "(" + b + op[op2] + c
								+ "))" + op[op3] + d;
						ugold(result);

					}
					// ���ñ��ʽ9�ķ��� a op1 b op2 (c op3 d)

					if (cal_expressiona9(a, b, c, d, op1, op2, op3) == 24) {

						result = a + op[op1] + b + op[op2] + "(" + c + op[op3]
								+ d + ")";
						ugold(result);

					}
					// ���ñ��ʽ10�ķ��� (a op1 b op2 c) op3 d

					if (cal_expressiona10(a, b, c, d, op1, op2, op3) == 24) {

						result = "(" + a + op[op1] + b + op[op2] + c + ")"
								+ op[op3] + d;
						ugold(result);

					}
					// ���ñ��ʽ11�ķ��� a op1 (b op2 c op3 d)

					if (cal_expressiona11(a, b, c, d, op1, op2, op3) == 24) {

						result = a + op[op1] + "(" + b + op[op2] + c + op[op3]
								+ d + ")";
						ugold(result);

					}

				}

			}

		}

	}

	public static void ugold(String result) throws SQLException,
			ClassNotFoundException {
		String sql = "insert into 24answer (result) values ('" + result + "')";
		DataConnect.getStat().executeUpdate(sql);
	}

	public static void main(String[] args) throws SQLException,
			ClassNotFoundException {

		int a, b, c, d;
		for (a = 1; a <= 13; a++) {
			for (b = 1; b <= 13; b++) {
				for (c = 1; c <= 13; c++) {
					for (d = 1; d <= 13; d++) {
						get(a, b, c, d);
					}
				}
			}
		}

	}
}