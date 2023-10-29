function reverseWordsInSentence(sentence) {
    // Split the sentence into words
    var words = sentence.split(' ');
    
    // Reverse each word and store them in an array
    var reversedWords = words.map(function(word) {
      return word.split('').reverse().join('');
    });
    
    // Join the reversed words to form a new sentence
    var reversedSentence = reversedWords.join(' ');
    
    return reversedSentence;
  }
  
  // Example usage
  var inputSentence = "This is a sunny day";
  var reversedSentence = reverseWordsInSentence(inputSentence);
  console.log(reversedSentence);
  