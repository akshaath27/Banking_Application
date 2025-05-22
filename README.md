# Java Bank Application – OOP Project

This is a console-based banking system project developed in Java. It demonstrates core Object-Oriented Programming (OOP) concepts like inheritance, interfaces, polymorphism, and abstraction.

## Table of Contents

- [Overview](#overview)
- [Technologies Used](#technologies-used)
- [OOP Concepts Demonstrated](#oop-concepts-demonstrated)
- [Features](#features)
- [Class Design](#class-design)

## Overview

The Bank Application allows users to simulate common banking operations such as opening accounts, depositing money, withdrawing funds, and viewing balances—all through a command-line interface.

## Technologies Used

- Java SE
- OOP principles (abstract classes, interfaces)
- No external libraries required

## OOP Concepts Demonstrated

- Abstract classes (`Bank`, `Account`)
- Inheritance (`NationalizedBank`, `CooperativeBank`)
- Interfaces (`AccountOperations`)
- Polymorphism (overriding methods)
- Static and final keywords

## Features

- Open new bank accounts
- Deposit and withdraw money
- View account details
- Different behavior for different bank types

## Class Design

- `Bank` – Abstract class defining common attributes  
- `Account` – Base class for account properties  
- `NationalizedBank` / `CooperativeBank` – Inherited classes  
- `AccountOperations` – Interface for basic operations  
- `Main` – Contains main execution logic
