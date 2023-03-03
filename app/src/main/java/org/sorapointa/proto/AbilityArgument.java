package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityArgument {
    @Tag(tag=5) public Integer intArg = null;
    @Tag(tag=15,isFloat=true) public Float floatArg = null;
    @Tag(tag=11) public String strArg = null;
}
