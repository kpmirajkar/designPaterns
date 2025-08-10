# Factory Method

## Concept
Define an interface for creating an object, but let subclasses decide which class to instantiate.

## Steps
1. Define a product interface or abstract class.
2. Create concrete products implementing the product interface.
3. Declare a creator class with a factory method returning the product type.
4. Implement concrete creators that override the factory method to instantiate specific products.
5. Client uses the creator to obtain products without knowing their concrete classes.
