class Solution {
    public String reverseWords(String s) {
    // int left = 0;
	// int right = s.length() - 1;

	// String temp = "";
	// String ans = "";

	// //Iterate the string and keep on adding to form a word
	// //If empty space is encountered then add the current word to the result
	// while (left <= right)
	// {
	// 	char ch = s.charAt(left);
	// 	if (ch != ' ')
	// 	{
	// 		temp += ch;
	// 	}
	// 	else if (ch == ' ')
	// 	{
	// 		if (!ans.equals(""))
	// 		{
	// 			ans = temp + " " + ans;
	// 		}
	// 		else
	// 		{
	// 			ans = temp;
	// 		}
	// 		temp = "";
	// 	}
	// 	left++;
	// }

	// //If not empty string then add to the result(Last word is added)
	// if (!temp.equals(""))
	// {
	// 	if (!ans.equals(""))
	// 	{
	// 		ans = temp + " " + ans;
	// 	}
	// 	else
	// 	{
	// 		ans = temp;
	// 	}
	// }

	// return ans;

    // optimal 
    // String result = new String();
    // int i = 0;
    // int n = s.length();

    // while(i < n){
    //     while(i < n && s.charAt(i) == ' ') i++;
    //     if(i >= n) break;
    //     int j = i + 1;
    //     while(j < n && s.charAt(j) != ' ') j++;
    //     String sub = s.substring(i, j);
    //     if(result.length() == 0) result = sub;
    //     else result = sub + " " + result;
    //     i = j+1;
    // }
    // return result;

    // by using trim and regex
    String words[]=s.split(" +");
    StringBuilder ss=new StringBuilder();
    for(int i=words.length-1;i>=0;i--){
        ss.append(words[i]);
        ss.append(" ");

    }
    return ss.toString().trim();



    }
}