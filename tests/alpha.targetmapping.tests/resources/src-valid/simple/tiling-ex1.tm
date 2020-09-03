target tm.test.simple2D

//context {:N%32=0}
tile-band [a,b] {
	A : [i,j]
	tile parallel (8, 8) [a+b,b]
	point full-tile
}
