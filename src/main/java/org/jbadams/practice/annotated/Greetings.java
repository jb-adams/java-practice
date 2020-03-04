package org.jbadams.practice.annotated;

import org.jbadams.practice.annotations.Counter;
import org.jbadams.practice.annotations.Greeter;

@Greeter(greet = "Good morning")
@Counter(count = 23)
public class Greetings {
}