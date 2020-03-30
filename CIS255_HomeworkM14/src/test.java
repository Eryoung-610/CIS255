
public class test {

	public static void main(String[] args) {

		int[] array1 = { 0, 0, 0, 3, 2, 7, 8 };
		countZeros(array1);

//		int start = 2;
//		int end = 5;

//		if (start + 1 < end) {
//			if (start < end) {
//				for (int i = 0; i < 3; i++) {
//					System.out.println("Print : " + i);
//
//					System.out.println("BLAHBLAHBLAH");
//
//					System.out.println("Second Print : " + i);
//				}
//			} else {
//				System.out.println("DONE");
//			}
//		}
	}

//	public static int methodA(int n) {
//		if (n == 0) {
//			return 0;
//		} else if (n > 0) {
//			return 1 + methodA(n - 1);
//		} else {
//			return 1 + methodA(n + 1);
//		}
//	}
//
//	public static int method1(int[] array, int val, int index) {
//		if (index < array.length) {
//			if (array[index] == val) {
//				return method1(array, val, index + 1);
//			} else {
//				return method1(array, val, index + 1) + 1;
//			}
//		} else {
//			return 0;
//		}
//	}
//
//	public static int method2(int[] array, int index) {
//		if (index < array.length) {
//			return array[index] + method2(array, index + 1);
//		} else {
//			return 1;
//		}
//	}
//
//	public static int methodB(String s, char c) {
//		if (s.length() == 0) {
//			return 0;
//		} else {
//			return (s.charAt(0) == c ? 1 : 0) + methodB(s.substring(1), c);
//		}
//	}

//	public static void recMethod(int[] array, int start, int end) {
//
//		if (start < end) {
//			for (int i = start; start < end; start++) {
//				System.out.println("LINE 1 " + array[start]);
//			}
//
////			System.out.println(array[start]);
//
//			if (array[start] == array[start]) {
//				start = start * 2;
//			}
//
////			System.out.println(array[start]);
//
//			recMethod(array, start + 1, end);
//
//			for (int i = start; start < end; start++) {
//				System.out.println(array[start]);
//			}
//
//		} else {
//			System.out.println("done");
//		}
//	}

//	public static int countEvens(int[] array) {
//		return countEvensHelper(array, 0, array.length);
//	}
//
//	private static int countEvensHelper(int[] array, int start, int stop) {
//		int count = 0;
//		if (start == stop) {
//			return count;
//		} else {
//			if (array[start] % 2 == 0) {
//				count = 1 + countEvensHelper(array, start + 1, stop);
//			}
//			System.out.println(count);
//			return count;
//
//		}
//	}

//	public static void infiniteRecursion(int n) {
//		   if (n > 0) { 
//		      System.out.println("here"); 
//		      infiniteRecursion(n-1);
//		   } else if(n < 0){ 
//		      System.out.println("here");
//		      infiniteRecursion(n+1);
//		   } else {   
//		      System.out.println("here"); 
//		   }
//		}

//	public static int secretMethod(int x, int y) {
//		   if (x == y) {
//		      return 1;
//		   } else {
//		      return secretMethod(x-1, y) + 1; 
//		   }
//		}

//	public static int baseCaseTest(int x) {
//		   if (x > 0) {
//		      return baseCaseTest(x-1) + 1;
//		   } else {
//		      return baseCaseTest(x-2) + 2; 
//		   }
//		}
//	
//	public static void baseCaseTest2(int x) {
//		   if (x > 0) {
//		      System.out.println(x);
//		      baseCaseTest2(x-1);
//		   }
//		}

//	public static int method1(int x) {
//		if (x > 0) {
//			return method1(x - 1) + 1;
//		} else {
//			System.out.println("METHOD 1 " + x);
//			return 0;
//		}
//	}
//
//	public static int method2(int x) {
//		if (x <= 0) {
//			return 0;
//		} else {
//			System.out.println("METHOD 2 " + x);
//			return 1 + method2(x - 1);
//		}
//	}

//	public static int countOdds(int[] array) {
//		return countOddsHelper(array, 0, array.length);
//	}
//
//	private static int countOddsHelper(int[] array, int start, int stop) {
//		int count = 0;
//		if (start < stop) {
//			if (array[start] % 2 == 1) {
//				count++;
//			}
//			countOddsHelper(array, start + 1, stop);
//			System.out.println(count);
//		}
//
//		return count;
//	}
	
	public static int countZeros(int[] array) {
		 return countZerosHelper(array, 0, array.length, 0);
		}

		private static int countZerosHelper(int[] array, int start, int stop, int count) {
		 if(start < stop) {
		 if(array[start] == 0) {
		 count++;
		 }
		 countZerosHelper(array, start+1, stop, count);
		 System.out.println(count);
		 }
		 return count;
		}
}
