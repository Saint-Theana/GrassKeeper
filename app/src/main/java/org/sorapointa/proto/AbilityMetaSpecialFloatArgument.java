package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityMetaSpecialFloatArgument {
    @Tag(tag=9) public Boolean isOn = null;
    @Tag(tag=2,isFloat=true) public Float argumentValue = null;
}
