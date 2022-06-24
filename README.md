# alghoritmicTasks

Sorting a flight tickets, Dart:

Map<String, String> ticket1 = {'from': 'st_p','to':'msc'}; //1
  Map<String, String> ticket2 = {'from': 'izh','to':'sam'}; //3
  Map<String, String> ticket3 = {'from': 'kzn','to':'sch'}; //5
  Map<String, String> ticket4 = {'from': 'sam','to':'kzn'}; //4
  Map<String, String> ticket5 = {'from': 'msc','to':'izh'}; //2
  
  List<Map<String, String>> tickets = [ticket1,ticket2,ticket3,
                                       ticket4,ticket5];
  
  List<String> citiesFrom = [];
  List<String> citiesTo = [];
  
  for (var ticket in tickets) {
    citiesFrom.add(ticket['from']!);
    citiesTo.add(ticket['to']!);
  }
  
  String beginDestination = citiesFrom.firstWhere(
    (element) => !citiesTo.contains(element));
  
  List<Map> sortedTickets = [];
  
  sortedTickets.add(tickets.firstWhere(
    (element) => element['from']==beginDestination));
  
  while(sortedTickets.length != tickets.length) {
    sortedTickets.add(
      tickets.firstWhere(
        (element) => element['from']==sortedTickets.last['to'])
    );
  }
  
  print(sortedTickets);
