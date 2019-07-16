package kr.gracelove.think.algorithm.SelectionSort;

public class SelectionSort {
    /**
     * i와 j의 위치에 있는 값을 바꾼다.(선택정렬.)
     */
    public static void swapElements(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * start로부터 시작하는 최소값의 위치를 찾고(start포함)
     * 배열의 마지막 위치로 간다.
     */
    public static int indexLowerst(int[] arr, int start){
        int lowIndex = start;
        for(int i = start; i < arr.length; i++){
            if(arr[i] < arr[lowIndex]){
                lowIndex = i;
            }
        }
        return lowIndex;
    }
    /**
     * 선택 정렬을 사용하여 요소를 정렬한다.
     */
    public static void selectionSort(int[] arr){
        for(int i = 0; i< arr.length; i++){
            int j = indexLowerst(arr, i);
            swapElements(arr, i, j);
        }
    }
}
