# Introduce the indirection layer
- when we refactoring, we often end up in situation where single change causing cascading effects of changes and we retreat in our corner and cry, and recently, I have learned a good trick from J.B. Rainberger to introduce indirection layer to help us making small steps incrementally
- X minutes do
  - It seems like OrderLines is a good home (domain concept) for Order.lines field, once you extract Order.lines into OrderLines, we could see a whole bunch of behavior should belong into OrderLines as well
  - **Setup**
  - [ ] checkout https://github.com/tonytvo/event-sourcing-example
  - [ ] run tests, see them pass
  - [ ] checkout introduce-indirection-starting-point branch_
  
  - **adding wrapper class `OrderLines``**
  - [ ] Extract the field `lines` from Order into its own class `OrderLines`
  - [ ] Extract a method to check if `OrderLines.isEmpty()`
  - [ ] Extract a method to return `OrderLines.asList()`
  - [ ] Extract a method `OrderLines.incrementItemCount(ItemAdded)`

# References
- https://github.com/codecop/dependency-breaking-katas
- https://tonytvo.github.io/what-simple-way-share-learn-refactor/
- https://github.com/tomphp/event-sourcing-example
