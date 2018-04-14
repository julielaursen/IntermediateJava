package Chapter17Lambdas;



import java.util.*;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Chapter17Lambdas {

 public static void main(String[] args)
 {
  //initials table of parts
  Invoice[] invoices = {
    new Invoice(83, "Electric sander", 7, 57.98),
    new Invoice(24, "Power saw", 18, 99.99),
    new Invoice(7, "Sledge hammer", 11, 21.50),
    new Invoice(77, "Hammer", 76, 11.99),
    new Invoice(39, "Lawn Mower", 3, 79.50),
    new Invoice(68, "Screwdriver", 106, 6.99),
    new Invoice(56, "Jig Saw", 21, 11.00),
    new Invoice(3, "Wrench", 34, 7.50)
  };
  
  Predicate<Invoice> twoToFourHundred = e -> (e.getTotalPrice() >= 200 && e.getTotalPrice() <= 400);
  
  List<Invoice> list = Arrays.asList(invoices);
  System.out.println("Create invoice list:");
  list.stream()
  .forEach(System.out::println);
  
  //a) print values in sorted order by part description
  System.out.printf("%nValues displayed in sorted order by description:%n");
  list.stream()
   .sorted(Comparator.comparing(Invoice::getPartDescription))
   .forEach(System.out::println);
  
  //b) print values in sorted order by price
  System.out.printf("%nValues displayed in sorted order by price:%n");
  list.stream()
   .sorted(Comparator.comparing(Invoice::getPrice))
   .forEach(System.out::println);
  
  //map each invoice to its part description and quantity, sort result by Quantity
  System.out.printf("%nInvoices mapped to description and quantity, sorted by quantity:%n");
  Map<String, Integer> groupByPartQuantity = 
		    list.stream()
	    	.sorted(Comparator.comparing(Invoice::getQuantity))
		    .collect(Collectors.toMap(Invoice::getPartDescription, Invoice::getQuantity));
  			groupByPartQuantity.forEach(
  					 (partDescription, quantity) ->
  				     {
  					     System.out.println(String.format("%20s", partDescription + " " + quantity));
  				     }
		    );
		  
    
  
  //d map each invoice to its part description and the value of the invoice (quantity times price)
  System.out.printf("%nInvoices mapped to description and total price (quantity times price):%n");
  //page 755
  Map<String, Float> groupByPartValue = 
    list.stream()
    .collect(Collectors.toMap(Invoice::getPartDescription, Invoice::getTotalPrice));
    //.map(a, b) -> a * b)
    //.collect(Invoice::getQuantity,Invoice::getPrice);
     //.collect(Collectors.groupingBy(Invoice::getPartDescription, Invoice::getTotalPrice));// Collectors.summingInt(Invoice::getQuantity)));
  //Collectors.reduce((a, b) -> a * b).collect(Invoice::getQuantity,Invoice::getPrice) );//
     groupByPartValue.forEach(
     (partDescription, quantity) ->
     {
    	 System.out.println(String.format("%20s", partDescription + "\t" + quantity));
     }
    );
  
 
  //print values from $200-400
  System.out.printf("%nValues displayed in the range of $200-$400%n");
   list.stream()
   .filter(twoToFourHundred)
   .sorted(Comparator.comparing(Invoice::getTotalPrice))
   .forEach(System.out::println);
//  
 }

}