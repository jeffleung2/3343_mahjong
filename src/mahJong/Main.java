package mahJong;

import static org.junit.Assert.assertEquals;

import java.io.InputStream;
import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		
		System.out.println("Description: H - Honour Tile, S - Bamboo Tile, T - Dots Tile, M - Characters Tile");
		System.out.println("Winds Tile Description: H1 - East Wind, H2 - South Wind, H3 - West Wind, H4 - North Wind");
		System.out.println("Dragons Tile Description: H5 - Red, H6 - Green, H7 - White");
		System.out.println("Simples Tile Description: T1 - 1Dot, S3 - 3 Bamboos, M6 - 6 Characters");
		System.out.println("Input Example: M1M2M3M4M5M6M7M8M9H7H7H7H6H6");
		System.out.println("Tips: A Pair of eyes should be placed at the last.");
		System.out.println("Tips: The input should be in increasing order like H1H2H3 but not H3H2H1");
		System.out.print("Please input your tiles (14 Tiles):");
		Scanner in = new Scanner(System.in);
		String tiles = in.next();
		if(tiles.length() < 28)System.out.println("Error: Insufficient Tiles");
		else
		{
			String[] temp = new String[14];
			for(int i = 0;i < 28;i+=2)temp[i/2] = tiles.substring(i, i+2);
			Calculator calculator = new Calculator(temp);
			System.out.println("Points: "+calculator.getWinPoint());
			System.out.println("Scoring Hands: "+calculator.getWinName());
			in.close();
		}
		
	}
}
