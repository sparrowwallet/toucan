# Toucan

### Java implementation of LifeHash

Toucan is a Java implementation of the [LifeHash](https://github.com/BlockchainCommons/bc-lifehash) hash visualization algorithm.
It is a direct port of the reference C++/C implementation by Wolf McNally. 
Toucan requires a minimum of Java 17. 

## Setup

Toucan is hosted in Maven Central and can be added as a dependency with the following:

```
implementation('com.sparrowwallet:toucan:0.9.0')
```

## Usage

A LifeHash is represented by the `LifeHash.Image` class, which can be created as follows:

```java
import com.sparrowwallet.toucan.*;
import java.awt.image.BufferedImage;

public class Main {
    public static void main(String[] args) {
        LifeHash.Image lifeHashImage = LifeHash.makeFromUTF8("Hello World", LifeHashVersion.VERSION2, 1, false);
        BufferedImage awtImage = LifeHash.getBufferedImage(lifeHashImage);
    }
}
```

## Testing

Toucan has a small testsuite ported from the C++ implementation. The tests can be run with:

```
./gradlew test
```

## License

Toucan is licensed under the Apache 2 software license.

## Dependencies

No dependencies.
