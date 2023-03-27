package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ModifierProperty {
    @Tag(tag=14,isFloat=true) public Float value = null;
    @Tag(tag=8) public AbilityString key = null;
}
