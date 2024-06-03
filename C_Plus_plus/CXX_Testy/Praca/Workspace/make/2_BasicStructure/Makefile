DEBUG ?= 1  # 1 = DEBUG MODE

ENABLE_WARNINGS ?= 1
WARRNINGS_AS_ERRORS ?= 0

EXECUTABLE_NAME = main # statt main unten, kann einfach überall EX_NAME
INCLUDE_DIR = include
SOURCE_DIR = src
BUILD_DIR = build

ifeq ($(ENABLE_WARNINGS), 1)
CXX_WARNINGS = -Wall -Wextra -Wpedantic # TURNS WARRNINGS ON
else
CXX_WARNINGS =
endif

ifeq ($(WARRNINGS_AS_ERRORS), 1)
CXX_WARNINGS += -Werror
endif


CXX = g++ # choose your compailer
CXX_STANDARD = c++17
CXXFLAGS = $(CXX_WARNINGS) -std=$(CXX_STANDARD)
CPPFLAGS = -I $(INCLUDE_DIR)
LDFLAGS =

#DEBUG := $(DEBUG)
#$(info DEBUG is $(DEBUG))

ifeq ($(DEBUG), 1)   # if equals
CXXFLAGS += -g -O0   # -g -> generates additional debug info,  -O0 -> turns optimalization on but 0 = debug lvl = none -> easier to debug
EXECUTABLE_NAME = mainDebug
else
CXXFLAGS += -O3 # highest opti lvl
EXECUTABLE_NAME = mainRelease
endif

Compailer_Call = $(CXX) $(CXXFLAGS) $(CPPFLAGS) # statt g++ bei targets

# CXX_OBJECTS = my_lib.o main.o #tu wypisuje jakie .o chce utworzyc
# alternatywa dla wyzej
CXX_SOURCES = $(wildcard $(SOURCE_DIR)/*.cpp) # pliki .cpp z folderu gdzie makefile sa zapisane do zmiennej
CXX_OBJECTS = $(patsubst $(SOURCE_DIR)/%.cpp, $(BUILD_DIR)/%.o, $(CXX_SOURCES)) #patsubst jest do wymiany koncowek z .cpp na .o, plikow ktore sa w zmiennej SOURCES

##########################
####	 TARGETS      ####
##########################

all: create build

create:
	mkdir -p build

build: $(CXX_OBJECTS) #main.o my_lib.o
	$(Compailer_Call) $(CXX_OBJECTS) -o $(BUILD_DIR)/$(EXECUTABLE_NAME)

#main.o: tworzy (...).o z (...).cpp
#	$(Compailer_Call) main.cpp -c

#my_lib.o: tworzy (...).o z (...).cpp
#	$(Compailer_Call) my_lib.cpp -c

execute:
	./$(BUILD_DIR)/$(EXECUTABLE_NAME)

clean:
	rm -f $(BUILD_DIR)/*.o
	rm -f $(BUILD_DIR)/$(EXECUTABLE_NAME)


##########################
####     PATTERNS     ####
##########################

# $@ the file name of the target .o
# $< the file name of the first dependency .cpp

$(BUILD_DIR)/%.o: $(SOURCE_DIR)/%.cpp
	$(Compailer_Call) -c $< -o $@
# musi byc tabulator


##########################
####	  PHONY       ####
##########################

.PHONY: all clean create build execute