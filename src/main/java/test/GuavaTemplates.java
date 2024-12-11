package test;

import static com.google.common.collect.ImmutableList.toImmutableList;
import static java.util.stream.Stream.of;

public class GuavaTemplates {

    public static void main(String[] args) {
        of("a", "b", "c").collect(toImmutableList());
    }

}
