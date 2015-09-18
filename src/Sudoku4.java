/**
 * Program Assignment:08
 * Name:��ʫ��
 * Date��2015/07/17
 * Description:Sudoku����Ľⷨ
 *
 */
	public class Sudoku4 {
		/**
		 * �������ķ���
		 * @param n
		 * @param i
		 * @param j
		 * @return boolean
		 */
		//NAMEOFMETHOD:next
	    public  boolean next(int[][] n, int i, int j) {
	        /**
	         * Ѱ����Ҫ�����ĸ���
	         */
	        if (n[i][j] != 0) {
	            if (j < 8) {
	            	j++;
	            }
	            else if (i < 8) {
	                i++;
	                j = 0;
	            } else {
	                //������
	                return true;
	            }
	        }
	        //��䳢��
	        for (int k = 1; k <= 9; k++) {
	            n[i][j] = k;
	            if (status(n, i, j)) {
	                if (!next(n, i, j)){
	                	continue;
	                }
	                return true;
	            }
	        }
	        /**
	         * �ж�������󷵻�ԭ����0״̬
	         */
	        n[i][j] = 0;    
	        return false;
	    }//ENDMETHOD
	    /**
	     *�����У��У��Ź�����ж�
	     * @param n
	     * @param i
	     * @param j
	     * @return
	     */
	    //NAMEOFMETHOD:status
	   public  boolean status(int[][] n, int i, int j) {
	        int s = n[i][j];
	        //�ж�ͬ��
	        for (int k = 0; k < 9; k++) {
	            if (k == j){
	            	continue;
	            }
	            if (n[i][k] == s) {
	            	return false;
	            }
	        }
	        //�ж�ͬ��
	        for (int k = 0; k < 9; k++) {
	            if (k == i) {
	            	continue;
	            }
	            if (n[k][j] == s) {
	            	return false;
	            }
	        }
	        //�ж�ͬ��һ���Ÿ�����
	        int bi = i / 3 * 3;
	        int bj = j / 3 * 3;
	        for (int i2 = bi; i2 < bi + 3; i2++) {
	            for (int j2 = bj; j2 < bj + 3; j2++) {
	                if (i2 == i && j2 == j) {
	                	continue;
	                }
	                if (n[i2][j2] == n[i][j]) {
	                	return false;
	                }
	            }
	        }
	        return true;
	    }//ENDMETHOD
	   /**
	    * ��ӡ��������
	    * @param n
	    */
	   //NAMEOFMETHOD:print
	    public void print(int[][] n) {
	        for (int i = 0; i < 9; i++) {
	            for (int j = 0; j < 9; j++) {
	                System.out.print(n[i][j] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }//ENDMETHOD
	    /**
	     * main�������������
	     * @param args
	     */
	    //NAMEOFMEHOD:main
	    public static void main(String[] args) {
	        /*int[][] n = {
	            {8,0,0,0,0,0,0,0,0}
	            ,{0,0,3,6,0,0,0,0,0}
	            ,{0,7,0,0,9,0,2,0,0}
	            ,{0,5,0,0,0,7,0,0,0}
	            ,{0,0,0,0,4,5,7,0,0}
	            ,{0,0,0,0,1,0,0,3,0}
	            ,{0,0,1,0,0,0,0,6,8}
	            ,{0,0,8,5,0,0,0,1,0}
	            ,{0,9,0,0,0,0,4,0,0}
	          



	        };*/
	    	/*int [][] n = {
	    			 {0,0,0,0,0,0,2,0,0}
	    			,{0,0,0,0,0,0,0,5,0}
	    			,{0,4,0,0,3,0,0,0,0}
	    			,{0,0,0,0,0,9,0,0,4}
	    			,{0,3,0,0,0,0,0,0,7}
	    			,{0,0,0,7,0,5,0,0,0}
	    			,{5,0,2,8,0,0,0,0,0}
	    			,{0,0,9,0,0,0,0,0,0}
	    			,{0,0,0,0,7,0,1,0,6}
	    			
	    	};*/
	    	int [][] n={
	    			 {0,5,0,8,7,4,0,0,0}
	    			,{0,0,0,0,5,0,0,0,1}
	    			,{0,0,0,0,0,6,0,0,0}
	    			,{3,0,1,0,0,0,0,0,2}
	    			,{4,6,0,0,3,0,0,8,7}
	    			,{2,0,0,0,0,0,6,0,9}
	    			,{0,0,0,9,0,0,0,0,0}
	    			,{8,0,0,0,1,0,0,0,0}
	    			,{0,0,0,4,8,3,0,5,0}
	    	};
	    	Sudoku4 sudoku = new Sudoku4();
	        sudoku.print(n);
	        sudoku.next(n, 0, 0);
	        sudoku.print(n);
	    }//ENDMETHOD
	}

