class Solution {

    public void generateRow(int numRows, List<List<Integer>> res)
    {

        //Basecase 1st row of pascalTriangle
        if(numRows == 1)
        {
            List<Integer> innerList = new ArrayList<>();

            innerList.add(1);//firstRow
            //[1]
            // not returning bcoz we need
            res.add(innerList);//[[1]]
        return;
        }

        
        generateRow(numRows-1, res);//recursively got previous rows

        List<Integer> prevRow = res.get(numRows-2);//-2 bcoz res has already prev rows acc to 0-indexing
        //if numRows=3, prevRow=res.get(3-2)=res.get(1)=[1,1] (acc to 0-indexing of res)
        //if numRows=4, prevRow=res.get(4-2)=res.get(2)=[1,2,1]
        List<Integer> currentRow = new ArrayList<>();

        currentRow.add(1);//[1] first element of any row is 1

        //middle elemenets
        for(int i=1 ; i<=numRows-2 ; i++)
        {
            currentRow.add(prevRow.get(i-1) + prevRow.get(i));
            //prevRow.get(0)+prevRow.get(1) they follow 0-indexing
            //if numRows=3 , 1+1
        }
        currentRow.add(1);

        res.add(currentRow);
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

    /* we gotta generate the row(innerList) first then add it to res
        hence, we create helper func to generateRow(pascal row)
     */

        
    if(numRows == 0)
    {
        return res;
    }
    generateRow(numRows, res);
    return res;
    }
}
