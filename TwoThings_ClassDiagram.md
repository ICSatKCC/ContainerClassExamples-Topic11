# TwoThings Class Diagram

This diagram shows the structure and relationships of objects in the TwoThings.java file.

```mermaid
classDiagram
    class TwoThings {
        -T item1
        -C item2
        +TwoThings(T itemA, C itemB)
        +toString() String
        +getItem1() T
        +getItem2() C
        +setItem1(T itemA) void
        +setItem2(C itemB) void
        +main(String[] args)$ void
    }
    
    class Name {
        #String first
        #String last
        +Name(String firstName, String lastName)
        +toString() String
        +setFirstName(String firstName) void
    }
    
    class Fraction {
        -Integer numerator
        -Integer denominator
        +Fraction(Integer num, Integer den)
        +toString() String
    }
    
    class FractionInterface {
        <<interface>>
    }
    
    class ComparableName {
        <<interface>>
        +compareTo(Name other) int
    }
    
    class ComparableFraction {
        <<interface>>
        +compareTo(Fraction other) int
    }
    
    TwoThings ..> Name : uses
    TwoThings ..> Fraction : uses
    TwoThings ..> String : uses
    TwoThings ..> Integer : uses
    
    Name ..|> ComparableName : implements
    Fraction ..|> FractionInterface : implements
    Fraction ..|> ComparableFraction : implements
```

## Object Instances in main()

```mermaid
flowchart TD
    A["TwoThings&lt;String, Integer&gt;<br/>object1"] --> B["item1: 'Nami'<br/>(String)"]
    A --> C["item2: 25 → 24<br/>(Integer)"]
    
    D["TwoThings&lt;Name, Fraction&gt;<br/>object2"] --> E["item1: Name object"]
    D --> F["item2: Fraction(5,2)"]
    
    E --> G["first: 'Nalu' → 'Sally'"]
    E --> H["last: 'Suzuki'"]
    
    F --> I["numerator: 5"]
    F --> J["denominator: 2"]
    
    style A fill:#e1f5fe
    style D fill:#f3e5f5
    style E fill:#e8f5e8
    style F fill:#fff3e0
```

## Legend
- **Private fields**: `-` (item1, item2, numerator, denominator)
- **Protected fields**: `#` (first, last)  
- **Public methods**: `+`
- **Static methods**: `$`
- **Generic types**: `~T, C~`
- **Interfaces**: `<<interface>>`