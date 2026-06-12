# EjerciciosMorado — DOSW

Practical exercises on **design patterns** for the Software-Oriented Design (DOSW) course — 6th semester.

Each exercise is a standalone Java application illustrating one or more GOF patterns applied to a concrete use case.

---

## Contents

| Exercise | Topic | Patterns |
|---|---|---|
| [transporteUrbano](#1-urban-transport) | Urban transport management | Factory Method |
| [maletasInteligentes](#2-smart-bags) | Travel bag inventory | Abstract Factory · Singleton |
| [Veterinaria](#3-veterinary-clinic) | Veterinary clinic | Factory Method · Decorator |
| [bibliotecaEnLinea](#4-online-library) | Digital and physical book loans | Template Method · Proxy |
| [sistemaViajes](#5-travel-system) | Travel packages | Abstract Factory · Strategy |

---

## Exercises

### 1. Urban Transport
**Pattern:** Factory Method

Models different types of urban transport (car, bicycle, motorbike). Each transport type has its own concrete factory implementing `ITransportFactory`. A `TransportManager` coordinates the registration of created vehicles.

```
ITransportFactory
├── CarFactory       → Car
├── BicyclesFactory  → Bicycle
└── MotorBikeFactory → MotorBike
```

---

### 2. Smart Bags
**Patterns:** Abstract Factory · Singleton

Creates families of bags according to the travel type (adventure, business, tourism). The inventory is managed with a Singleton to guarantee a single shared instance.

```
IBagsFactory
├── AdventureFactory → AdventureBag
├── BussinesFactory  → BussinesBag
└── TurismFactory    → TurismBag

Inventory (Singleton)
```

---

### 3. Veterinary Clinic
**Patterns:** Factory Method · Decorator

Creates pets through factories and dynamically adds veterinary services (vaccination, grooming, training) by chaining decorators.

```
IPetFactory
├── DogFactory  → Dog
├── CatFactory  → Cat
└── BirdFactory → Bird

PetDecorator (abstract)
├── VaccinationDecorator
├── HairDecorator
└── TrainingDecorator
```

Composition example:
```
Dog + VaccinationDecorator + HairDecorator + TrainingDecorator
```

---

### 4. Online Library
**Patterns:** Template Method · Proxy

Defines a general loan workflow (`ProcessLoan`) with abstract steps that each loan type implements differently. `ProxyDigitalBook` delays loading the real book until it is actually needed.

```
ProcessLoan (Template Method)
├── PyshicalLoan → physical book flow
└── DigitalLoan  → digital book flow

IDigitalBook
├── RealDigitalBook
└── ProxyDigitalBook → RealDigitalBook (lazy load)
```

---

### 5. Travel System
**Patterns:** Abstract Factory · Strategy

Combines a transport factory with an accommodation strategy to assemble flexible, configurable travel packages.

```
ITransportFactory
├── PlaneFactory → Plane
├── BusFactory   → Bus
└── TrainFactory → Train

IAccomodationStrategy
├── HotelStrategy
├── HostelStrategy
└── CampStrategy

TravelSystem(factory, strategy) → travel package
```

---

## Class Diagrams

UML diagrams are located in `0 EjerciciosRefuerzo/Diagrama De Clases/`:

| File | Exercise |
|---|---|
| `Biblioteca.png` | Online Library |
| `DiagramaMaletas.png` | Smart Bags |
| `DiagramaVeterinaria.png` | Veterinary Clinic |
| `DiagramaViajes.png` | Travel System |

---

## Technologies

- **Java** — JDK 11+
- No external dependencies (standard Java library only)
- Each exercise has its own `Application.java` as the entry point

---

## Running

Compile and run any exercise from the project root:

```bash
# Example with the Veterinary exercise
javac "0 EjerciciosRefuerzo/Veterinaria/*.java"
java -cp "0 EjerciciosRefuerzo/Veterinaria" Application
```

Or import the project into an IDE (IntelliJ IDEA / Eclipse / VS Code with the Java extension) and run the `Application` class of the desired exercise directly.


## Author

**Julian Camilo Lopez Barrero**
