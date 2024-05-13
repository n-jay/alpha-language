CFLAGS= -O3  -std=c99  -I/usr/include/malloc/ -Wno-unused-result
LIBRARIES=-lm
CC?=gcc
OBJS = LUDecomposition.o 
all: plain check verify verify-rand

debug: CFLAGS =-DDEBUG -g -Wall -Wextra -std=c99 -I/usr/include/malloc/
debug: all

plain: $(OBJS)
	$(CC) LUDecomposition-wrapper.c -o LUDecomposition.out $(OBJS) $(CFLAGS) $(LIBRARIES)

check: $(OBJS)
	$(CC) LUDecomposition-wrapper.c -o LUDecomposition.check $(OBJS) $(CFLAGS) $(LIBRARIES) -DCHECKING

verify: $(OBJS) LUDecomposition_verify.o
	$(CC) LUDecomposition-wrapper.c -o LUDecomposition.verify $(OBJS) LUDecomposition_verify.o $(CFLAGS) $(LIBRARIES) -DVERIFY

verify-rand: $(OBJS) LUDecomposition_verify.o
	$(CC) LUDecomposition-wrapper.c -o LUDecomposition.verify-rand $(OBJS) LUDecomposition_verify.o $(CFLAGS) $(LIBRARIES) -DVERIFY -DRANDOM

LUDecomposition.o : LUDecomposition.c
	$(CC) LUDecomposition.c -o LUDecomposition.o $(CFLAGS) $(LIBRARIES) -c

LUDecomposition_verify.o : LUDecomposition_verify.c
	$(CC) LUDecomposition_verify.c -o LUDecomposition_verify.o $(CFLAGS) $(LIBRARIES) -c

clean:
	rm -f *.o LUDecomposition.out LUDecomposition.check LUDecomposition.verify LUDecomposition.verify-rand
