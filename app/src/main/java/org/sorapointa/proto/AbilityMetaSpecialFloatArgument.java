package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityMetaSpecialFloatArgument {
    @Tag(tag=14,isFloat=true) public Float argumentValue = null;
    @Tag(tag=10) public Boolean isOn = null;
}
