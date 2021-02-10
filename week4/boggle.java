import java.util.*;

public class boggle	{
			//vars 
	static int[] scores = {0, 0, 0, 1, 1, 2, 3, 5, 11};
	static char[][] board;
	static boolean[][] visited;
	static int[] boardX = {-1, -1, -1, 0, 0, 1, 1, 1};
	static int[] boardY = {-1, 0, 1, -1, 1, -1, 0, 1};
	static HashSet<String> foundWords;
	static int currentScore;
	static String longestWord;
	static int numWordsFound;
	
	
	public static void main(String[] args)	{
		
		Scanner sc = new Scanner(System.in);
		StringBuilder myString = new StringBuilder();
		
		int n = sc.nextInt();
		String[] words = new String[n];
		
		for (int i = 0; i < n; i++)	{
			words[i] = sc.next();
		}
		
		int numBoards = sc.nextInt();
		
		for (int i = 0; i < numBoards; i++)	{
			
			board = new char[4][4];
			for (int j = 0; j < 4; j++)	{
				board[j] = sc.next().toCharArray();
			}
			
			visited = new boolean[4][4];
			foundWords = new HashSet<String>();
			

			for (int j = 0; j < 4; j++)	{
				for (int k = 0; k < 4; k++)	{
					
					for (String x : words)	{
						// discarding duplicates
						if (foundWords.contains(x))	{
							continue;
						}
						
						if (board[j][k] == x.charAt(0))	{
							if (nextChar(j, k, x, 1))	{
								foundWords.add(x);
							}
						}
						
					}
				}
			}
			
			currentScore = 0;
			longestWord = "";
			numWordsFound = foundWords.size();
			

			for (String x : foundWords)	{
				
				if (x.length() > longestWord.length() || (x.length() == longestWord.length() && x.compareTo(longestWord) < 0))	{
					longestWord = x;
				}
				currentScore += scores[x.length()];
			}
			
			myString.append(currentScore + " " + longestWord + " " + numWordsFound + "\n");
		}
		
		System.out.println(myString.toString());
	}
	
=	static boolean nextChar(int x, int y, String word, int index)	{
		
		// word is found
		if (index == word.length())	{
			return true;
		}
		
		boolean result = false;
		visited[x][y] = true;
		
		for (int i = 0; i < 8; i++)	{
			int newX = x + boardX[i];
			int newY = y + boardY[i];
			
			if (0 <= newX && newX < 4 && 0 <= newY && newY < 4 && !visited[newX][newY] && board[newX][newY] == word.charAt(index))	{
				result = result || nextChar(newX, newY, word, index+1);
			}
		}
		
		visited[x][y] = false;
		
		return result;
		
	}
}