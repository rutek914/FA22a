# 1.) create code and cmake file
# 2.) mkdir build
# 3.) cd build
# 4.) cmake ..     wczytaj cmake file i wygeneruj makefile
# 5.a) cmake --build .
# 5.b) make


cmake_minimum_required(VERSION 3.22)

project(ZadanieKsiazka1)
#project(CppProjectTemplate VERSION 1.0.0 LANGUAGES C CXX)

set(TARGET_NAME Zadanie1)


set(Header
    include/gameplay/GameManager.h
    include/ships/Submarine.h
)

set (Source
    src/main.cpp
    src/gameplay/GameManager.cpp
    src/ships/Submarine.h
)

include_directories(include/gameplay include/ships)

add_executable(${TARGET_NAME} ${Source} ${Header})





# add_executable(Executable main.cpp)

