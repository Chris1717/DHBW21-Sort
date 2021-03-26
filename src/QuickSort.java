class QuickSort {

    public static void main(String[] args) {
        
        int[] data = { 7600, 2091, 6104, 9435, 8604, 1109 };
        //int[] data = { 1600, 2091, 6104, 1109, 9435, 8604, 3682, 664, 8958, 1374, 4749, 1011, 3906, 565, 6276, 4429, 7086, 4287, 7583, 5312, 4664, 6599, 4056, 2755, 6233, 4682, 4016, 9458, 385, 4516, 872, 6903, 3542, 5354, 5194, 6472, 5260, 7121, 6717, 740, 4361, 2942, 3234, 583, 1336, 9733, 13, 7766, 6337, 8776, 8274, 6423, 4022, 3157, 1295, 6903, 8648, 8477, 226, 9332, 1102, 3508, 3689, 4302, 9810, 866, 2488, 8146, 1110, 6636, 2456, 5644, 8518, 7178, 3286, 8535, 232, 2459, 6528, 2649, 4735, 4707, 3766, 8248, 3299, 2078, 9442, 999, 6453, 8333, 7815, 8390, 2864, 461, 6120, 1393, 2675, 9992, 609, 2633, 4838, 8680, 588, 5203, 2349, 8099, 780, 5613, 8050, 6471, 2307, 7677, 175, 2795, 8213, 3105, 9230, 7769, 4128, 86, 4522, 522, 7463, 7205, 3684, 4642, 8816, 4274, 5260, 854, 1374, 3370, 8579, 3557, 6862, 4150, 6610, 8282, 5478, 5657, 4731, 4506, 794, 3713, 846, 4534, 9385, 3114, 1796, 1998, 5321, 1308, 2819, 9861, 3803, 5866, 7644, 7311, 4508, 8885, 1675, 9178, 4509, 7060, 3985, 5881, 6867, 187, 6716, 9510, 1126, 5382, 3841, 121, 7221, 4033, 3217, 9296, 3762, 6372, 221, 3349, 6964, 4659, 965, 7332, 9625, 385, 5891, 5330, 847, 6004, 3590, 7018, 5746, 6947, 7720, 7815, 1908, 461 };

        sort(data);
    }

    public static void sort(int[] data) {

        quickSort(data, 0, data.length-1);

        prettyPrint(data);
    }

    private static void quickSort(int[] data, int low, int high) {
        if (low < high) {
            int pivotIdx = partion(data, low, high);
                quickSort(data, low, pivotIdx-1);
                quickSort(data, pivotIdx+1, high);
        }
    }

    private static int partion(int[] data, int low, int high) {
        int pivotValue = data[high];
        int pivotIdx = low; //gelber Marker

        for(int j = low; j <= high-1; j++) {//grüner Marker 
            if (data[j] < pivotValue) {
                swap(data, pivotIdx, j);
                pivotIdx++;
            }
        }
        swap(data, pivotIdx, high);
        return pivotIdx;
    }

    private static void swap(int[] data, int pivotIdx, int j) {
        int temp = data[j];
        data[j] = data[pivotIdx];
        data[pivotIdx] = temp;
    }

    public static void prettyPrint(int[] data) {
        for (int i : data) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

    }
}