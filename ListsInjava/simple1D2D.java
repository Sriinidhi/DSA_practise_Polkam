import java.util.*;
class simple1d{
    public static void main(String args[])
    {
        List<Integer> list1d1 = new ArrayList<>();
        list1d1.add(1);
        List<Integer> list1d2 = new ArrayList<>();
        list1d2.add(1);
        list1d2.add(2);
        

        System.out.println(list1d1);//[1]
        System.out.println(list1d2);//[1,2]

        List<List<Integer>> list2d = new ArrayList<>();
        System.out.println(list2d);//[]
        list2d.add(list1d1);
        list2d.add(list1d2);
        System.out.println(list2d);//[[1],[1,2]]

        List<List<Integer>> list2d2 = new ArrayList<>(2);
        System.out.println(list2d2);//[]

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

List<List<Integer>> list2d33 = new ArrayList<>();

for (int i = 0; i <= 1; i++) {
    list2d33.add(new ArrayList<>());  // Add an empty inner list directly to list2d3
    for (int j = 0; j <= i; j++) {
        list2d33.get(i).add(j);  // Add elements to the current inner list directly
}
	}
	System.out.println(list2d33);//[[0],[0,1]]

List<List<Integer>> list2d3 = new ArrayList<>();
        System.out.println(list2d3);//[]

        for (int i = 1; i <= 3; i++) {
    list2d3.add(new ArrayList<>(List.of(i)));
}

        System.out.println(list2d3);
    }
}

/* output
[1] -> list1d1
[1, 2] -> list1d2
[] -> list2d before
[[1], [1, 2]] -> list2d after
[] -> list2d2 before
[[1], [1, 2], [1, 2, 3]] -> list2d2 after
[[0],[0,1]] -> list2d33 created without innerList
[] -> list2d3 before
[[1], [2], [3]] -> list2d3 after

Try running on online compiler for better understanding...
happy Learning
*/
