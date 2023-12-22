#include "literature.h"
#include <iostream>
#include <string>
#include <conio.h>
#include <Windows.h>
using namespace std;
int main() {
	setlocale(0, "");
	SetConsoleCP(1251);
	SetConsoleOutputCP(1251);
	Author author_static, * author_dynamic = new Author("Шолохов", "М.А.", "Родился 24 мая 1905 года на хуторе Кружилин в станице Вёшенской Российской империи.");
	Author& author_dynamic_ref = *author_dynamic;
	Book* book = new Book("Шолохов", "М.А.", "Тихий Дон", "Роман-эпопея", 1590), book_copy;
	Genre* genre1 = new Genre("Повесть", "Прозаический жанр, занимающий по объёму текста промежуточное место между романом и рассказом, тяготеющий к хроникальному сюжету, воспроизводящему естественное течение жизни.");
	Genre* genre2 = new Genre("Драма", "Текст в драме представлен в виде реплик персонажей и авторских ремарок. Как правило, он разбит на действия и явления.");
	Genre genre3;
	string* static_author_last_name = new string(), dynamic_author_last_name, & dynamic_author_last_name_ref = dynamic_author_last_name;
	author_static.enterAuthorData();
	author_static.getAuthorData();
	cout << "Создано авторов: " << Author::getAuthorCount() << endl;
	cout << "Создано книг: " << Book::getBookCount() << endl;
	cout << "Создано жанров: " << Genre::getGenreCount() << endl;
	cout << "Создано журналов: " << Magazine::getMagazineCount() << endl;
	cout << "Создано издателей: " << Publisher::getPublisherCount() << endl;
	cout << endl;
	author_static.getAuthorLastNamePtr(static_author_last_name);
	author_dynamic->getAuthorLastNameRef(dynamic_author_last_name_ref);
	cout << "Фамилия статического объекта автора через указатель: " << *static_author_last_name << endl;
	cout << "Фамилия динамического объекта автора через ссылку: " << dynamic_author_last_name_ref << endl;
	cout << endl;
	cout << "Вывод биографии автора через дружественную функцию:" << endl;
	getAuthorBiography(author_dynamic_ref);
	genre3 = *genre1 + *genre2;
	cout << endl;
	cout << "Объединение жанров с помощью перегрузки оператора +:" << endl;
	genre3.getGenreData();
	cout << endl;
	cout << "Увеличение кол-ва страниц в книге на 1 с помощью перегрузки префиксного оператора:" << endl;
	book_copy = ++(*book);
	book_copy.getBookData();
	cout << "Увеличение кол-ва страниц в книге на 1 с помощью перегрузки постфиксного оператора:" << endl;
	book_copy = (*book)++;
	book_copy.getBookData();

	_getch();
	delete author_dynamic;
	delete book;
	delete genre1;
	delete genre2;
	delete static_author_last_name;
	return 0;
}