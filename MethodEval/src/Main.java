
public class Main {
    public static void main(String[] args) {
        //String regEx = "^[0-9]+[+\\-*/][0-9]+[+\\-*/][0-9]+[+\\-*/][0-9]+[+\\-*/][0-9]+[+\\-*/][0-9]+[+\\-*/][0-9]+[+\\-*/][0-9]+$";
        int counter = 0, counter1 = 0;
        double eval = 0;
        String text2 = "15/3-5*2";
        String regEx1 = "(?=[-*+/])|[*+/]";
        String regExM2 = "\\*";
        String regExM3 = "/";
        String[] arr = text2.split(regEx1);
        String[] arr1, arr2;
        for (String s : arr) {
            if(s.contains("*") || s.contains("/")){
                if(s.contains("*")){
                    arr1 = s.split(regExM2);
                    if(arr[counter - 1].contains("*")){
                        arr2 = arr[counter - 1].split(regExM2);
                        eval *= Double.parseDouble(arr2[1]);
                    } else if(arr[counter - 1].contains("/")){
                        eval *= Double.parseDouble(arr1[1]);
                    }
                    else{
                        eval += Double.parseDouble(arr[counter - 1]) * Double.parseDouble(arr1[1]);
                    }
                } else if(s.contains("/")){
                    arr1 = s.split(regExM3);
                    if(arr[counter - 1].contains("/")){
                        arr2 = arr[counter - 1].split(regExM3);
                        System.out.println(eval);
                        eval /= Double.parseDouble(arr2[1]);
                        System.out.println(eval);
                    } else if(arr[counter - 1].contains("*")) {
                        arr2 = arr[counter - 1].split(regExM2);
                        eval /= Double.parseDouble(arr2[1]);
                    } else{
                        eval += Double.parseDouble(arr[counter - 1]) / Double.parseDouble(arr1[1]);
                    }
                }
            }
            counter++;
        }
        counter = 0;
        for (String s : arr){
            if(counter == 0){
               if(!arr[1].contains("*")){
                   if(!arr[1].contains("/")){
                       if(s.contains("-")){
                           System.out.print("");
                       } else {
                           eval += Double.parseDouble(arr[0]);
                       }
                   }
               }
            }
            if(counter1 == arr.length - 1 && !arr[counter].contains("*")){
                if(!arr[counter].contains("/")){
                    eval += Double.parseDouble(arr[counter]);
                    break;
                }
            }
            if(s.contains("+") || s.contains("-")){
                if(!arr[counter + 1].contains("*")){
                    if(!arr[counter + 1].contains("/")){
                        eval += Double.parseDouble(arr[counter]);
                    }
                }
            }
            counter1++;
            counter++;
        }
        if(String.valueOf(eval).equals("Infinity")){
            System.out.println("You cannot be divided by zero!");
        } else {
            System.out.println("It is: " + eval);
        }
    }
}
