class Whitespaces
{
public static void main(String[] args)
{
String sentence="J av a p rog ram m ing.";
System.out.println("Original sentence:"+sentence);
sentence=sentence.replaceAll("\\s","");
System.out.println("After replacement:"+sentence);
}
}