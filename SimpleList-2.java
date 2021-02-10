package Assign2;


import java.util.Arrays;

public class SimpleList {

    private int list[];  //Declaring the variables of the list

    private int c;

    public SimpleList() //this is a constructor
    {

        this.c = 0;

        list = new int[10];

    }

    public void add(int n) //This method is used to add a number to the list
    {

        // increasing capacity by 50 percent if array is full

        if (c == list.length) {

             int h = c / 2;

             Incrsize(c + h);

        }


        for (int j = c; j > 0; j--) {

             list[j] = list[j - 1];

        }

        list[0] = n;

        c++;

        System.out.println("Number is added to the list");

    }

    // this is private method increase the size as asked

    private void Incrsize(int NS)
    {

        int a[] = new int[NS];

        // to make a copy of the array

        for (int j = 0; j < NS && j < c; j++)
        {

             a[j] = list[j];

        }

        // exchanging old  array with the latest one

        list = a;


        if (NS < c) 
        {

            c = NS;

        }

    }

    public void remove(int n) // This method is used to remove a number from the list
    {

        int in = search(n);

        if (in != -1) {

             // remove specific indexed element in array

             // left shift array

             for (int j = in; j < c - 1; j++) {

                 list[j] = list[j + 1];

             }

             c--;

             System.out.println("number is removed");

        } else {

             System.out.println(n + " number is found");

        }

        //To find the capacity of 75 percent

        int b = 3 * list.length / 4;

        if (c < n) 
        {

             Incrsize(c);

        }

    }

    // this send the number to the end

    public void append(int v)
    {

        // Making increasing capacity to full

        if (c == list.length) {

             int h = c / 2;

             Incrsize(c + h);

        }

        list[c] = v;

        c++;

    }

    // this returns the intial element of the list

    public int first() //this returns the first element in the list
    {

        if (c == 0) {

             throw new RuntimeException("there is nothing in the list!");

        }

        return list[0];

    }

    // this returns current size capacity 

    public int size() //this return the current all possible locations in the list
    {

        return list.length;

    }

    public int count() 
    {

        return c;

    }

    public int search(int n) // This method will search the list 
    {

        int in = -1;

        for (int j = 0; j < c; j++) {

             if (list[j] == n) {

                 in = j;

             }

        }

        return in;

    }


    public String toString() // this will give the string
    {

        String s = "";

        for (int j = 0; j < c; j++) {

             s = s + list[j];

             if (j != c - 1) {

                 s += " ";

             }

        }

        return s;

    }

}