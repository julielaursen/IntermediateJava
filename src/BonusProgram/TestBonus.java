package BonusProgram;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TestBonus {
	
	
	public static void main(String[] args)
	{
		Cash_Register menu = new Cash_Register();
	
		
		ArrayList<Retail_Item> list = new ArrayList<Retail_Item>();
		String fileName = "inventory.txt";
		try{
			 FileInputStream fstream = new FileInputStream(fileName);
			 DataInputStream in = new DataInputStream(fstream);
			 BufferedReader br = new BufferedReader(new InputStreamReader(in));
			 String strLine;
			 while ((strLine = br.readLine()) != null)   {
				   String[] tokens = strLine.split(" +");
				   menu.addInventory(Integer.parseInt(tokens[0]),tokens[1],Integer.parseInt(tokens[2]),Float.parseFloat(tokens[3]));
				   //(new Retail_Item(Integer.parseInt(tokens[0]),tokens[1],Integer.parseInt(tokens[2]),Float.parseFloat(tokens[2])));
			 }
			 in.close();
		   }
		catch (Exception e){
		     System.err.println("Error: " + e.getMessage());
		 }
		
	
 		
 		String cashierFile = "Cashier.txt";
 		try{
			 FileInputStream fstream1 = new FileInputStream(cashierFile);
			 DataInputStream in1 = new DataInputStream(fstream1);
			 BufferedReader br1 = new BufferedReader(new InputStreamReader(in1));
			 String strLine;
			 while ((strLine = br1.readLine()) != null)   {
				 System.out.println(strLine);
			 		menu.addCashier(strLine);
				   //menu.addInventory(Integer.parseInt(tokens[0]),tokens[1],Integer.parseInt(tokens[2]),Float.parseFloat(tokens[3]));
				   //(new Retail_Item(Integer.parseInt(tokens[0]),tokens[1],Integer.parseInt(tokens[2]),Float.parseFloat(tokens[2])));
			 }
			 in1.close();
		   }
		catch (Exception e){
		     System.err.println("Error: " + e.getMessage());
		 }
		//menu.show_items(null); //display items
 		
 		menu.displayInventory();
		menu.display_menu();
 		//menu.getTotal();
		
		for(Retail_Item obj : list)
		{
			System.out.println(obj);
		}
		
		
		
		
//		String line = "";
//		try{
//			FileReader fileReader = new FileReader(fileName);
//			
//			BufferedReader bufferedReader = 
//	                new BufferedReader(fileReader);
//
//            while((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }   
//			
//		}
//		catch(FileNotFoundException ex) {
//            System.out.println(
//                "Unable to open file '" + 
//                fileName + "'");                
//        } catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
	}

}
