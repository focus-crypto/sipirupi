void main(){
  print(averageDigit(12345));
}

int remainingHours(int hours, int mins, int seconds){
  int totalSeconds = (hours * 3600) + (mins * 60) + seconds;
  return 86400- totalSeconds;
}

bool palindrome(String str){
  String reverse = "";
  for(int i = str.length-1; i >=0;i--){
    reverse += str[i];
  }
  if(reverse == str){
    return true;
  }
  return false;
}

String toBeOrNotToBe(String str){
  String toBe= "To be, or not to be, that is the question";
  if(toBe.contains(str)){
    return "Yes the $str is in the $toBe sentence";
  }
  return "No the $str is not in the $toBe sentence";
}

String removeDigit(String str){
  String result = "";
  for(int i = 0; i< str.length; i++){
    if(!str[i].contains(RegExp(r'[0-9]'))){
      result += str[i];
    }
  }
  return result;
}

bool isLeapYear(int year){
  if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
    return true;
  }
  return false;
}

String stoneScissorsPaper(int player1, int player2){
  if(player1 == player2){
    return "Draw";
  }
  if(player1 == 1 && player2 == 2 || player1 == 2 && player2 == 3 || player1 == 3 && player2 == 1){
    return "Player 1 wins";
  }
  return "Player 2 wins";
}

int vowelsCount(String str){
  String vowels = "aeiou";
  int count = 0;
  for(int i = 0; i< str.toLowerCase().length; i++){
    if(vowels.contains(str[i].toLowerCase())){
      count++;
    }
  }
  return count;
}

double averageDigit(int number){
  String digits = number.toString();
  int sum = 0;
  for(int i = 0; i< digits.length; i++){
    sum += int.parse(digits[i]);
  }
  return sum / digits.length;
}

String stopAtVowel(String str){
  String vowels = "aeiou";
  String result = "";
  for(int i = 0; i< str.length; i++){
    if(vowels.contains(str[i].toLowerCase())){
      break;
    }
    result += str[i];
  }
  return result;
}

String printLowerCase(String str){
  String result = "";
  for(int i = 0; i< str.length; i++){
    if(str[i].toLowerCase() == str[i]){
      result += str[i];
    }
  }
  return result;
}
