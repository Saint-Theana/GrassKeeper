package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FightPropPair {
    @Tag(tag=1) public Integer propType = null;
    @Tag(tag=2,isFloat=true) public Float propValue = null;
}
