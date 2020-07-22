target tm.test.simple1D

set {
	A {:i<10}  : band { A : [i]};
	A {:i>=10} : if {:N>10} band { A : [i]};
}
