package StringSet;

import java.util.*;
import java.io.*;

/*총 N개의 문자열로 이루어진 집합 S가 주어진다.

입력으로 주어지는 M개의 문자열 중에서 집합 S에 포함되어 있는 것이 총 몇 개인지 구하는 프로그램을 작성하시오.*/

//문제를 정확히 이해하지 못해서 오래 걸림 다음에는 집중해서 읽기

public class StringSet {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		
		 Set<String> stringSet = new HashSet<>();

	        // 집합 S에 포함된 문자열 입력 받기
	        for (int i = 0; i < n1; i++) {
	            String str = bf.readLine();
	            stringSet.add(str);
	        }
		
		int count = 0;
		
		
		//지금 받아오는 값이 배열에 존재하면 count 값을 1증가 배열에 존재하는지 확인하기 위해 contains를 사용함
		for(int i = 0; i < n2; i++) {
			if(stringSet.contains(bf.readLine())) {
				count++;
			}
			
		}
		
		System.out.println(count);

	}

}


// HashSet을 사용하여 중복을 제거하고 크기를 비교하여 정답을 출력하려 했지고 정답은 잘 나오는데 틀린 이유를 논리적으로 생각해도 모르겠음
/*
 HashSet<String> set = new HashSet<>();
 for (String c : st2) {
        set.add(c);
 }
 int count = set.size();
 for(String d : st1) {
	 set.add(d);
 }
 count = count + n1 - set.size();
 System.out.print(count);*/
