target tm.test.simple1D

context {:N>10} set {
	A : tile-band {
			 A : [N-i]
			 (32)
			 point unroll(0)
		};
	B : band { B : [i]};
}
