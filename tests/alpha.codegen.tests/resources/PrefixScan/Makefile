CFLAGS= -O3  -std=c99  -I/usr/include/malloc/ -Wno-unused-result
LIBRARIES=-lm
CC?=gcc
OBJS = PrefixScan.o 
all: plain check verify verify-rand

debug: CFLAGS =-DDEBUG -g -Wall -Wextra -std=c99 -I/usr/include/malloc/
debug: all

plain: $(OBJS)
	$(CC) PrefixScan-wrapper.c -o PrefixScan.out $(OBJS) $(CFLAGS) $(LIBRARIES)

check: $(OBJS)
	$(CC) PrefixScan-wrapper.c -o PrefixScan.check $(OBJS) $(CFLAGS) $(LIBRARIES) -DCHECKING

verify: $(OBJS) PrefixScan_verify.o
	$(CC) PrefixScan-wrapper.c -o PrefixScan.verify $(OBJS) PrefixScan_verify.o $(CFLAGS) $(LIBRARIES) -DVERIFY

verify-rand: $(OBJS) PrefixScan_verify.o
	$(CC) PrefixScan-wrapper.c -o PrefixScan.verify-rand $(OBJS) PrefixScan_verify.o $(CFLAGS) $(LIBRARIES) -DVERIFY -DRANDOM

PrefixScan.o : PrefixScan.c
	$(CC) PrefixScan.c -o PrefixScan.o $(CFLAGS) $(LIBRARIES) -c

PrefixScan_verify.o : PrefixScan_verify.c
	$(CC) PrefixScan_verify.c -o PrefixScan_verify.o $(CFLAGS) $(LIBRARIES) -c

clean:
	rm -f *.o PrefixScan.out PrefixScan.check PrefixScan.verify PrefixScan.verify-rand
