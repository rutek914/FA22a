
CXX = g++ # choose your compailer
CXXFLAGS = -Wall -Wextra -Wpedantic # TURNS WARRNINGS ON

Compailer_Call = $(CXX) $(CXXFLAGS)  # statt g++ bei targets

EXECUTABLE_NAME = main # statt main unten, kann einfach überall EX_NAME

DEBUG := $(DEBUG)
$(info DEBUG is $(DEBUG))
DEBUG = 1   # 1 = DEBUG MODE
ifeq ($(DEBUG),1)   # if equals
CXXFLAGS += -g -O0   # -g -> generates additional debug info,  -O0 -> turns optimalization on but 0 = debug lvl = none -> easier to debug
else
CXXFLAGS += -O3 # highest opti lvl
endif


##########################
####	 TARGETS      ####
##########################

build: main.o my_lib.o
	$(Compailer_Call) main.o my_lib.o -o $(EXECUTABLE_NAME)

main.o:
	$(Compailer_Call) main.cpp -c

my_lib.o:
	$(Compailer_Call) my_lib.cpp -c

execute:
	gnome-terminal -- bash -c "./$(EXECUTABLE_NAME); exec bash"

clean:
	rm -f *.o
	rm -f $(EXECUTABLE_NAME)