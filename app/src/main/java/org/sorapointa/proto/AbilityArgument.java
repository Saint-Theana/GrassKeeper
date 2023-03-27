package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityArgument {
    @Tag(tag=11) public Integer intArg = null;
    @Tag(tag=2,isFloat=true) public Float floatArg = null;
    @Tag(tag=8) public String strArg = null;
}
