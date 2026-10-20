# Strategy Pattern — Navigation / Route Planning

Individual assignment for ** Software Design Patterns** (Astana IT University).

## Pattern
Behavioral **Strategy**. A `NavigationContext` delegates route planning to an
interchangeable `RouteStrategy`. Strategies can be swapped at runtime.

## Components
- `RouteStrategy` — strategy interface
- `CarRouteStrategy`, `WalkRouteStrategy`, `CycleRouteStrategy`,
  `PublicTransportRouteStrategy` — concrete strategies (4 in total)
- `NavigationContext` — context, holds a strategy reference, no conditional logic
- `Main` — client, selects strategies and demonstrates runtime switching

## Build & Run
Requires JDK 17.

```bash
javac -d out $(find src -name "*.java")
java -cp out kz.ait.navigation.Main
