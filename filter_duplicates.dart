Future<void> main() async {
//   Given an array of n integers. The task is
//     to print the duplicates in the given array. If
//     there are no duplicates then print -1.
  var smth = [1, 2, 4, 4, 5, 6, 8, 8];
  getDuplicates(smth);
}

// [1,2,4,4,5,6,8,8]

void filterDuplicates(List<int> arr) {
  Set<int> setArr = {};
  setArr.addAll(arr); // O(n)
  if (setArr.length == arr.length) {
    print(-1);
    return;
  }
  for (int i in setArr) {
    // O(n)
    arr.remove(i); // O(n)
  }
  print(arr);
}

void getDuplicates(List<int> arr) {
  Set<int> setArr = {};
  bool hasDuplicates = false;
  for (int i in arr) {
    // O(n)
    if (setArr.add(i) == false) {
      // O(1)
      print(i);
      hasDuplicates = true;
    }
  }
  if (!hasDuplicates) {
    print(-1);
    return;
  }
}
