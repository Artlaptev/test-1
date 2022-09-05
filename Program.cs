Console.WriteLine("C# Введите ваше имя: ");
string name = Console.ReadLine()!;
String message;
if ("Вероника" == name)
{
  message = "Я так ждала вас, Вероника!";
}
else
{
  message = "Привет, " + name + "!";
}
System.Console.WriteLine(message);