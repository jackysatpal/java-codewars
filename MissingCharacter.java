public String missingChar(String str, int n) {
  char removeCharacter = str.charAt(n);
  String output = "";
  
  for (int counter = 0; counter < str.length(); counter++) {
    
    if (!(removeCharacter == str.charAt(counter))) {
      output += str.charAt(counter);
    }
    
  }
  
  return output;
}
