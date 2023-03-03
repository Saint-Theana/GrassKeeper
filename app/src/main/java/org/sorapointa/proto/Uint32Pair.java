package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class Uint32Pair {
    @Tag(tag=1) public Integer key = null;
    @Tag(tag=2) public Integer value = null;
}
