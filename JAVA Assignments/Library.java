class Library{
double height;
double width;
SubjectType subjectType;
}

class Stream{
String name;
double totalNoOfStudent;
}

class Member extends Library{
String name;
List<Stream> streams;
String dateOfIssue;
}

class Book{
String bookId;
String bookName;
double price;
}