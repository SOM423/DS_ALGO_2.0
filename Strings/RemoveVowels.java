public class RemoveVowels {
	public static String removeVowels(String str) {


	return  str.chars()
	.filter(c -> "".indexOf(c) == -1)
	.mapToObj(c -> String.valueOf((char) c))
	.collect(Collectors.joining());
	}
}
