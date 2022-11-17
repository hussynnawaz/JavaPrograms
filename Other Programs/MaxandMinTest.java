/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labterminal;

/**
 *
 * @author fa19-bcs-074
 */
public class MaxandMinTest {
    	private static void findMinAndMax(int[][] matrix){     
		int maxNum = matrix[0][0];
		int minNum = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(maxNum < matrix[i][j]){ 
					maxNum = matrix[i][j]; 
				} else if(minNum > matrix[i][j]){
					minNum = matrix[i][j];
				}
			}
		}
		System.out.println("Max number: " + maxNum + 
					" Min number: " + minNum);
	}
}
