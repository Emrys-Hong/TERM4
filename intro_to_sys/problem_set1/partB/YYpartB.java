
public static int[] computePiInHex(int precision) {
        // TODO: Implement (Problem b)
        int[] a= new int[precision];
        if(precision<0){return null;}else{
            for (int i=0;i<precision;i++){a[i]=piDigit(i+1);}
        }
        return a;
        

    }
