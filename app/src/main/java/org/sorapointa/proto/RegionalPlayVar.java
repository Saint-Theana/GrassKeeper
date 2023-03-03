package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RegionalPlayVar {
    @Tag(tag=15) public Integer type = null;
    @Tag(tag=11,isFloat=true) public Float maxValue = null;
    @Tag(tag=3,isFloat=true) public Float value = null;
    @Tag(tag=10,isFloat=true) public Float baseValue = null;
}
