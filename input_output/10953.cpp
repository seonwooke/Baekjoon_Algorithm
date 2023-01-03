#include <iostream>
#include <string>
#include <sstream>

using namespace std ;

int split (string str, char delimiter) ;

int split (string str, char delimiter) {
	int result = 0 ;
	int tmp ;
	string token ;
	stringstream stream(str) ;

	while (getline(stream, token, delimiter)) {
		tmp = stoi(token) ;
		result = result + tmp ;
	}

	return result ;
}

int main () {
	int T, result ;
	string test_case ;

	cin >> T ;

	for (int i = 0 ; i < T ; i++) {
		cin >> test_case ;
		result = split(test_case, ',') ;
		cout << result << endl ;
	}

	return 0 ;
}
