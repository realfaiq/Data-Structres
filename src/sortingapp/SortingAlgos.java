/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingapp;

/**
 *
 * @author Faiq
 */
public class SortingAlgos {
    private int bSwap, sSwap;
    private int bComp, sComp;
    private int iComp, iSwap;
    private long ElapsedB, ElapsedS, ElapsedI;
    
    
    void SortingAlgos()
    {
        bSwap = 0;
        bComp = 0;
    }
    
    public void BubbleSort(int bList[])
    {
        long Start,End;
        Start = System.nanoTime();
        int Swap = 0;
        
        
        for(int i = 0; i<bList.length-1; i++){
            for(int j = 0; j<bList.length - (i+1); j++){
                bComp = bComp + 1;
                int temp = 0;
                if(bList[j]>bList[j+1]){
                    Swap = 1;
                    //Swap
                    temp = bList[j];
                    bList[j] = bList[j+1];
                    bList[j+1] = temp;
                    bSwap = bSwap + 1;
                }
                if(Swap == 0);
                break;
            }
        }
        
        End = System.nanoTime();
        ElapsedB = Start - End;
    
    
    }
    
    public void SelectionSort(int SList[]){
        
        long Start,End;
        Start =  System.nanoTime();
        int temp, Min, Size;
        Size = SList.length;
        for(int i = 0; i<Size-1; i++){
            Min = i;
            for(int j = i+1; j<Size; j++){
                if(SList[j]<SList[Min]){
                    sComp = sComp + 1;
                    Min = j;
                }
            }
            temp = SList[i];
            SList[i] = SList[Min];
            SList[Min] = temp;
            sSwap = sSwap + 1;
        }
        End = System.nanoTime();
        ElapsedS = Start - End;
    }
    
    public void InsertionSort(int IList[]){
        long Start, End;
        Start = System.nanoTime();
        int temp;
        int Size = IList.length;
        for(int i = 1; i  < Size; i++){
            int j = i;
            temp = IList[i];
            while(j > 0 && temp < IList[j-1]){
                iComp = iComp + 1;
                IList[j] = IList[j-1];
                j--;
            }
            IList[j] = temp;
            iSwap = iSwap + 1;
        }
        End = System.nanoTime();
        ElapsedI = Start - End;
    }
    
    
    public void PrintList(int List[])
    {
        for(int i=0; i<List.length; i++)
        {
            System.out.print(List[i]+" ");
        }
        
        
    }
    
    public void PrintReport()
    {
        System.out.println("----------------------------------");
        System.out.println("\t Comparison Chart");
        System.out.println("----------------------------------");
        System.out.println("Bubble Sort Comparisons    : "+bComp);
        System.out.println("Bubble Swaps Swaps         : "+bSwap);
        System.out.println("ELapsed time by Bubble Sort is : " + ElapsedB + " N/S ");
        System.out.println("Selection Sort Comparisons    : "+sComp);
        System.out.println("Selection Swaps Swaps         : "+sSwap);
        System.out.println("Elapsed time by Selection Sort is : " + ElapsedS + " N/S ");
        System.out.println("Insertion Sort Comparisons : " +iComp);
        System.out.println("Insertion Sort Swaps : " +iSwap);
        System.out.println("Elapsed Time by Insertion Sort is : " + ElapsedI + " N/S ");
        
    }
}
