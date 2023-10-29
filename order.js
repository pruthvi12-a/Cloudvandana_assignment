function sortArrayDescending(arr) {
    arr.sort(function(a, b) {
      return b - a; // Compare in descending order
    });
  }
  
  // Example usage
  var numbers = [5, 2, 9, 1, 5, 6];
  sortArrayDescending(numbers);
  console.log(numbers); // The array is now sorted in descending order
  