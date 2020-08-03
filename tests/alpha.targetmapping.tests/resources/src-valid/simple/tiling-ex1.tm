target tm.test.simple2D

tile-band [a,b] {
	A : [i,j]
	B : [i,j]
	parallel [a+b,b] (32, 8)
	point [b,a] unroll(1) parallel (0)
}
