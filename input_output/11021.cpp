#include <iostream>
using namespace std ;

int main () {
	int T, A, B ;
	cin >> T ;

	for (int i = 0 ; i < T ; i++ ) {
		if (!((0 < A) || (B < 10))) {
			return 1 ;
		}

		cin >> A >> B ;
		cout << "Case #" << i + 1 << ": " << A+B << endl ;
	}

	return 0 ;
}
