import java.util.*;
class simple1d2d{
    public static void main(String args[])
    {
        List<Integer> list1d1 = new ArrayList<>();
        list1d1.add(1);
        List<Integer> list1d2 = new ArrayList<>();
        list1d2.add(1);
        list1d2.add(2);
        

        System.out.println(list1d1);
        System.out.println(list1d2);

        List<List<Integer>> list2d = new ArrayList<>();
        System.out.println(list2d);
        list2d.add(list1d1);
        list2d.add(list1d2);
        System.out.println(list2d);

        List<List<Integer>> list2d2 = new ArrayList<>(2);
        System.out.println(list2d2);

        for(int i=1; i<=3 ; i++)
        {
            List<Integer> innerList = new ArrayList<>();
            for(int j=1 ; j<=i ; j++)
            {
                innerList.add(j);
            }
            list2d2.add(innerList);
        }

        System.out.println(list2d2);
    }
}

/* output
[1]
[1, 2]
[]
[[1], [1, 2]]
[]
[[1], [1, 2], [1, 2, 3]]
*/
