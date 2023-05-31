// Copyright 2023 Piotr Rucinski

#pragma once

#include <string>

using std::string;

class Person
{
private:
   string name;
   short age; // NOLINT
   string email;
   int phoneNumber;
   Person(const Person &other); // Copy Constructor
public:
   Person(const string &name, short age, // NOLINT
         const string &email, int phoneNumber);
   ~Person();  // destructor
   // getters
   string getName() const;
   short getAge() const; // NOLINT
   string getEmail() const;
   int getPhoneNumber() const;
   // setters
   void setName(const string &name);
   void setAge(short age); // NOLINT
   void setEmail(const string &email);
   void setPhoneNumber(int phoneNumber);
   // NOLINT
};
