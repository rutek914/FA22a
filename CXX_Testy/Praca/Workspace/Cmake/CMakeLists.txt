# 1.) create code and cmake file
# 2.) mkdir build
# 3.) cd build
# 4.) cmake ..     wczytaj cmake file i wygeneruj makefile
# 5.a) cmake --build .
# 5.b) make


cmake_minimum_required(VERSION 3.22)

project(CppProjectTemplate VERSION 1.0.0 LANGUAGES C CXX)

add_executable(Executable main.cpp)

