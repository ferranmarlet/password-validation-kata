
Simple container that I use to run small java projects.

To generate the image for the first time, run:

```
make build
```

Once it's generated, to get the container up and running you only need to do:

```
make up
```

To log into the running container, run:

```
make sh
```

To run the test suite inside the container:

```
make tests
```

To run a single test class:

```
make tests target="ClassName"
```

To run a single test method:

```
make tests target="ClassName#MethodName"
```
