class DIRMOD {
 
    public static final int ASCII_INDEX = 65;

    public static final String[] ARR =  {"2","22","222",
                                         "3","33","333",
                                         "4","44","444",
                                         "5","55","555",
                                         "6","66","666",
                                         "7","77","777","7777",
                                         "8","88","888",
                                         "9","99","999","9999"};
    public static void main(String[] args) {
        
        String input1 = "hi";
        String input2 = "yes";
        String input3 = "foo bar";
        String input4 = "hello world"; 
        String input5 = "dirmod";

        System.out.println(print(input1));
        System.out.println(print(input2));
        System.out.println(print(input3));
        System.out.println(print(input4)); 
        System.out.println(print(input5));
    }

    static String print(String input) {

        String output = "";
     
        int n = input.length();
     
        for (int i = 0; i < n; i++) {
            
            if (input.charAt(i) == ' ')
                output = output + "0";
     
            else {

                char letter = Character.toUpperCase(input.charAt(i)); 
                int letterAscii = (int)letter;
                int position = letterAscii - ASCII_INDEX; 
                
                if (!output.isEmpty()) { 

                    char outputlastLetter = (output.substring(output.length()-1).charAt(0)); 
                    char firstNewLetter = ARR[position].charAt(0);
                    
                    if (outputlastLetter == firstNewLetter) {
                        output = output + ' ';
                    }
                }

                output = output + ARR[position];
            }
        }
     
        return output;
    }
     
}
