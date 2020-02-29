# graphql-crud
CRUD using GraphQL

````
{
    person(id: 1) {
        id
        name
        email
        age
    }
}
````

````
{
    p1: person(id: 1) {
        id
        name
        email
        age
    }
    p2: person(id: 2) {
        id
        name
        email
        age
    }
}
````

````
mutation {
  savePerson(name: "Test", email: "eita@re.com") {
    name, email
  }
}

mutation {
  savePerson(person: {name: "Test Input", email: "sasa@rere.com"}) {
    name, email
  }
}
````

````
fragment personFrag on Person {
  id
  name
  email
  age
}

{
    p1: person(id: 1) {
        ...personFrag
    }
    p2: person(id: 2) {
        ...personFrag
    }
    people {
        ...personFrag
    }
}
````