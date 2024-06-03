// Copyright 2023 Piotr Rucinski

#include "../include/Person.h"

Person::Person(const string &name, short age, const string &email, int phoneNumber)
:name(name), age(age), email(email), phoneNumber(phoneNumber) {}

Person::~Person() {}

string Person::getName() const {
    return name;
}

short Person::getAge() const {
    return age;
}

string Person::getEmail() const {
    return email;
}

int Person::getPhoneNumber() const {
    return phoneNumber;
}

void Person::setName(const string &name) {
    this->name = name;
}

void Person::setAge(short age) {
    this->age = age;
}

void Person::setEmail(const string &email) {
    this->email = email;
}

void Person::setPhoneNumber(int phoneNumber) {
    this->phoneNumber = phoneNumber;
}