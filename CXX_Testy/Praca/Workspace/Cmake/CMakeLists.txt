# 1.) create code and cmake file
# 2.) mkdir build
# 3.) cd build
# 4.) cmake ..     wczytaj cmake file i wygeneruj makefile
# 5.a) cmake --build .
# 5.b) make


cmake_minimum_required(VERSION 3.22)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED ON)
set(CMAKE_INCLUDE_CURRENT_DIR ON)


project(ZadanieKsiazka1 VERSION 1.0.0 LANGUAGES CXX)
#project(CppProjectTemplate VERSION 1.0.0 LANGUAGES C CXX)
set(TARGET_NAME Zadanie1)


set(Header
    code/gameplay/GameManager.h
    code/ships/Submarine.h
)
# zarowno .h jak i .cpp w jednym folderze
# np pliki od statku dajesz do ship engine.h engine.cpp
set (Source
    code/main.cpp
    code/gameplay/GameManager.cpp
    code/ships/Submarine.h
)

include_directories(
    code/gameplay
    code/ships)

add_executable(${TARGET_NAME} ${Source} ${Header})





# add_executable(Executable main.cpp)

